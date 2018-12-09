package com.siva;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	public List<Employee> getEmpDetails() throws SQLException {
		List<Employee> listPerson = new ArrayList<>();
		Connection con = DBUtil.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from employees");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setCity(rs.getString(3));
				e.setSalary(rs.getInt(4));
				listPerson.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.close();
		return listPerson;
	}
}
