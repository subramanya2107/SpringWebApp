package com.rzt.app.rest;

/**
 * 
 */

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rzt.app.beans.domain.MsgLog;
import com.rzt.app.beans.domain.intf.IMsgLog;
import com.rzt.app.beans.ui.MsgLogUI;
import com.rzt.app.service.intf.IMsgLogService;
import com.rzt.app.utils.ContextVariables;

/**
 * @author vasu
 * 
 */
@Component
@Path("/msglog")
public class SampleRest extends ContextVariables {

	@Autowired
	IMsgLogService msgLogService;
	@Autowired
	private ObjectMapper jsonMapper;

	@GET
	@Path("/getmsglog/{userName}")
	public Response getMsg(@PathParam("userName") String userName)
			 {

		try {
			List<IMsgLog> list = msgLogService.findByUserName(userName);
			String result = jsonMapper.writeValueAsString(list);
			return Response.status(200).entity(result).build();
		} catch (Exception e) {
			return	Response.status(500).entity(e.getMessage()).build();
		}

	}

	@POST
	@Path("/addmsglog")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployeeInJSON(MsgLogUI obj) {
		try {
			IMsgLog res=msgLogService.saveMsgLog(obj);
			String result = jsonMapper.writeValueAsString(res);
			return Response.status(201).entity(result).build();
		} catch (Exception e) {
			return	Response.status(500).entity(e.getMessage()).build();
		}

	}

}
