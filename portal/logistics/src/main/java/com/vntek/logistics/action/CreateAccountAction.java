/**
 * 
 */
package com.vntek.logistics.action;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.vntek.core.exception.SystemException;
import com.vntek.core.struts.action.ProcessAction;
import com.vntek.core.util.Constants;
import com.vntek.core.util.DateTimeUtil;
import com.vntek.core.util.StringPool;
import com.vntek.logistics.service.UsersService;

/**
 * @author ToiNT
 * @since Sep 25, 2015, 12:26:24 AM
 */
public class CreateAccountAction extends ProcessAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsersService usersService;
	public String crEmail;
	public String crPassword1;
	public String crPassword2;
	public String crLastName;
	public String crFirstName;
	public String crAddress;
	public String crBirthDay;
	public String crPhone;
	public String crFax;
	public String crWebsite;

	/**
	 * register a account
	 * 
	 * @author ToiNT
	 * @since Sep 25, 2015, 11:57:53 PM
	 * 
	 * @return status
	 */
	public String create() {
		try {
			usersService.addNew(crEmail, crPassword1, crFirstName, crLastName,
					DateTimeUtil.toDate(crBirthDay, StringPool.PATTERN_DATE_VI), crAddress, crEmail, crPhone, crFax, 0,
					new Date());
			// HttpServletRequest request =
			// ServletActionContext.getRequest().getSession().getAttribute("");
			// HttpServletResponse response =
			// ServletActionContext.getResponse();
		} catch (SystemException e) {
			_log.log(Level.SEVERE, e.getMessage(), e);
		}

		return Constants.SUCCESS;
	}

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	/**
	 * log to server
	 */
	private static final Logger _log = Logger.getLogger(CreateAccountAction.class.getName());

}
