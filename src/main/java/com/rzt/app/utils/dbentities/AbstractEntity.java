/**
 * 
 */
package com.rzt.app.utils.dbentities;
import java.io.Serializable;


/**
 * Superclass for all domain objects.
 * @author nsinghal
 *
 */
public abstract class AbstractEntity extends AbstractBean  implements Identifiable,Serializable
{
	private static final long serialVersionUID = -5392328848489095469L;
	
	protected Serializable id;
	
	/**
	 * @see com.ri.common.db.entity.Identifiable#getId()
	 */
	@Override
	public abstract Serializable getId ();

	/**
	 * @see com.ri.common.db.entity.Identifiable#setId(java.io.Serializable)
	 */
	@Override
	public void setId (Serializable id)
	{
		this.id = id;
	}

}
