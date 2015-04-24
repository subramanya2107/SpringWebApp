package com.rzt.app.dao;


import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rzt.app.beans.domain.MsgLog;
import com.rzt.app.beans.domain.intf.IMsgLog;
import com.rzt.app.dao.intf.IMsgLogdao;
import com.rzt.app.utils.CustomEntityManagerFactory;


/**
 * @author vasu
 *
 */
@Repository
@Transactional(readOnly = false, rollbackFor = Exception.class,propagation= Propagation.REQUIRED)
public class MsgLogDao extends CustomEntityManagerFactory implements IMsgLogdao  {

	/* (non-Javadoc)
	 * @see com.rzt.app.dao.IMsgLogdao#findByUserName(java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked") 
	public List<IMsgLog> findByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		try {
			Query query=getEntm().createQuery("from MsgLog where userName=:username");
			return query.setParameter("username", username).getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	/* (non-Javadoc)
	 * @see com.rzt.app.dao.IMsgLogdao#saveMsgLog(com.rzt.app.beans.domain.intf.IMsgLog)
	 */
	@Override
	public IMsgLog saveMsgLog(IMsgLog hum) throws Exception {
		try {
			MsgLog obj=new MsgLog();
			obj.setAppVersion(hum.getAppVersion());
			obj.setMsg(hum.getMsg());
			obj.setProject(hum.getProject());
			obj.setType(hum.getType()); 
			obj.setUserName(hum.getUserName());
			getEntm().persist(obj);
			return obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

}
