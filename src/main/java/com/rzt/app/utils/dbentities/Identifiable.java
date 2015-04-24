package com.rzt.app.utils.dbentities;

/**
 * 
 */

import java.io.Serializable;

public interface Identifiable extends Serializable {
	public Serializable getId();
	public void setId( Serializable id );
}
