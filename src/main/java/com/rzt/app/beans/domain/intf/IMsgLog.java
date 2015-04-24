package com.rzt.app.beans.domain.intf;

import com.rzt.app.utils.dbentities.Identifiable;


public interface IMsgLog extends Identifiable{

	public String getUserName();

	public void setUserName(String userName);

	public String getMsg();

	public void setMsg(String msg);

	public Integer getType();

	public void setType(Integer type);

	public String getAppVersion();

	public void setAppVersion(String appVersion);

	public Integer getProject();

	public void setProject(Integer project);

}