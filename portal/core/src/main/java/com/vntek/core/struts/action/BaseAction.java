/**
 * 
 */
package com.vntek.core.struts.action;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ToiNT
 * @since Oct 5, 2015, 12:59:38 PM
 *
 */
public abstract class BaseAction extends ActionSupport implements Prepareable, ModelDriven, SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Log log = LogFactory.getLog(BaseAction.class.getName());
	private Map<String, Object> session;

	/**
	 * 
	 *
	 * @author ToiNT
	 * @since Oct 5, 2015, 1:34:24 PM
	 *
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
