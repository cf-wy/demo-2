package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.domain.User;
import com.example.demo.enums.UserSex;
import com.example.demo.service.UserService;
import com.example.demo.web.HelloWorldController;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {

  
    private MockMvc mvc;
    @Autowired
    private UserService service;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }
    @Test
	public void testInsert() throws Exception {
		service.insert(new User("aa", "a123456", UserSex.MAN));
		service.insert(new User("bb", "b123456", UserSex.WOMAN));
		service.insert(new User("cc", "b123456", UserSex.WOMAN));

		Assert.assertEquals(3, service.getAll().size());
	}
    
    
    @Test
	public void testQuery() throws Exception {
		List<User> users = service.getAll();
		System.out.println(users.toString());
	}
}
