/**
 * 
 */
package com.vntek.core.struts.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ToiNT
 * @since Oct 5, 2015, 12:59:38 PM
 *
 */
public abstract class BaseAction extends ActionSupport implements Prepareable, ModelDriven {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Log log = LogFactory.getLog(BaseAction.class.getName());

}
