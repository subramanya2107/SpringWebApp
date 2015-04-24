package com.rzt.app.beans.domain;

/**
 * 
 */

/**
 * @author vasu
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rzt.app.beans.domain.intf.IMsgLog;
import com.rzt.app.utils.dbentities.AbstractEntity;


@Entity
@Table(name = "msglog")
public class MsgLog extends AbstractEntity implements IMsgLog {

	/**
	 * 
	 */
	private Long logId;
	private String userName;
	private String msg;
	private Integer type;
	private String appVersion;
	private Integer project;
	
	
	public MsgLog() {
	}

	private static final long serialVersionUID = -5353291512425179463L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return logId;
	}

	public void setId(Long id) {
		this.logId = id;
	}
	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#getUserName()
	 */
	@Override
	@Column(name = "username",  nullable = false)
	public String getUserName() { 
		return userName;
	}

	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#getMsg()
	 */
	@Override
	@Column(name = "msg",  nullable = false)
	public String getMsg() {
		return msg;
	}

	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#setMsg(java.lang.String)
	 */
	@Override
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#getType()
	 */
	@Override
	@Column(name = "type",  nullable = false)
	public Integer getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#setType(java.lang.Integer)
	 */
	@Override
	public void setType(Integer type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#getAppVersion()
	 */
	@Override
	@Column(name = "appversion",  nullable = false)
	public String getAppVersion() {
		return appVersion;
	}

	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#setAppVersion(java.lang.String)
	 */
	@Override
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#getProject()
	 */
	@Override
	@Column(name = "project",  nullable = false)
	public Integer getProject() {
		return project;
	}

	/* (non-Javadoc)
	 * @see com.rzt.app.beans.domain.IMsgLog#setProject(java.lang.Integer)
	 */
	@Override
	public void setProject(Integer project) {
		this.project = project;
	}

}
