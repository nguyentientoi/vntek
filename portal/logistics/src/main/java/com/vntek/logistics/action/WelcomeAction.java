/**
 * 
 */
package com.vntek.logistics.action;

import java.util.logging.Logger;

import com.vntek.core.struts.action.BaseAction;

/**
 * @author ToiNT2
 *
 */
public class WelcomeAction extends BaseAction {

	public String execute() {
		return "SUCCESS";
	}

	public String register() {
		return "SUCCESS";
	}

	/**
	 * log server
	 */
	private static final Logger _log = Logger.getLogger(WelcomeAction.class.getName());

	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
