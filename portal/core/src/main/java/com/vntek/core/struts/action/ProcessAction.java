/**
 * 
 */
package com.vntek.core.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ToiNT
 * @since Oct 1, 2015, 10:53:22 PM
 */
public class ProcessAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	/**
	 * 
	 *
	 * @author ToiNT
	 * @since Oct 5, 2015, 10:17:30 AM
	 *
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	

}
