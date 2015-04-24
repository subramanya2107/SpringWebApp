package com.rzt.app.service.intf;

import java.util.List;

import com.rzt.app.beans.domain.intf.IMsgLog;

public interface IMsgLogService {
	IMsgLog saveMsgLog(IMsgLog obj) throws Exception;

	List<IMsgLog> findByUserName(String username) throws Exception;
}
