package com.siva;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getTrackInJSON() throws SQLException {
		DAO d = new DAO();
		return d.getEmpDetails();
	}

}
