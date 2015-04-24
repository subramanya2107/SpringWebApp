package com.rzt.app.beans.ui;


import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.rzt.app.beans.domain.intf.IMsgLog;
import com.rzt.app.utils.dbentities.AbstractBean;

/**
 * 
 */

/**
 * @author vasu
 *
 */



public class MsgLogUI extends AbstractBean implements IMsgLog {

	/**
	 * 
	 */
	private Long logId; 
	private String userName;
	private String msg;
	private Integer type;
	private String appVersion;
	private Integer project;
	
	
	public MsgLogUI() {
	}

	private static final long serialVersionUID = -5353291512425179463L;
	public Long getId()
	{
		return this.logId;
	}

	@JsonDeserialize(as = Long.class)
	public void setId( Serializable id )
	{
		if( id != null )
			this.logId = new Long( id.toString() );
		else
			this.logId = null;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Integer getProject() {
		return project;
	}

	public void setProject(Integer project) {
		this.project = project;
	}

	
	
}
