package com.rzt.app.dao.intf;

import java.util.List;

import com.rzt.app.beans.domain.intf.IMsgLog;

public interface IMsgLogdao {

	@SuppressWarnings("unchecked")
	public List<IMsgLog> findByUserName(String username) throws Exception;

	public IMsgLog saveMsgLog(IMsgLog hum) throws Exception;

}