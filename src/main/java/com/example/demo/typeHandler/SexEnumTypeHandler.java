package com.example.demo.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import com.example.demo.enums.UserSex;
@MappedJdbcTypes(value=JdbcType.INTEGER)
@MappedTypes(value=UserSex.class)
public class SexEnumTypeHandler implements TypeHandler<UserSex>{

	@Override
	public void setParameter(PreparedStatement ps, int i, UserSex parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(i, parameter.getKey());
		
	}

	@Override
	public UserSex getResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		int key=rs.getInt(columnName);
		return UserSex.getSexByKey(key);
	}

	@Override
	public UserSex getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int key=rs.getInt(columnIndex);
		return UserSex.getSexByKey(key);
	}

	@Override
	public UserSex getResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		int key=cs.getInt(columnIndex);
		return UserSex.getSexByKey(key);
	}

}
