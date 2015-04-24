package com.rzt.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rzt.app.beans.domain.intf.IMsgLog;
import com.rzt.app.dao.intf.IMsgLogdao;
import com.rzt.app.service.intf.IMsgLogService;

@Service
@Transactional(readOnly = false, rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class MsgLogServiceImpl implements IMsgLogService {
	@Autowired
	IMsgLogdao msgLogDao;

	@Override
	public IMsgLog saveMsgLog(IMsgLog obj) throws Exception {
		try {
			return msgLogDao.saveMsgLog(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	@Override
	public List<IMsgLog> findByUserName(String username) throws Exception {
		try {
			return msgLogDao.findByUserName(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

}
