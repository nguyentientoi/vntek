/**
 * 
 */
package com.vntek.logistics.service.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vntek.logistics.model.Users;
import com.vntek.logistics.service.UsersService;

/**
 * @author ToiNT
 * @since Oct 7, 2015, 1:28:23 PM
 *
 */
public class UsersServiceUtil {
	/**
	 * bean services users
	 */
	private static UsersService usersService;
	/**
	 * log to server
	 */
	private static Log log = LogFactory.getLog(UsersServiceUtil.class.getName());

	/**
	 * get users service
	 * 
	 * @author ToiNT
	 * @since Oct 7, 2015, 1:32:56 PM
	 *
	 * @return users
	 */
	public static UsersService getUsersService() {
		return usersService;
	}

	/**
	 * set users
	 * 
	 * @author ToiNT
	 * @since Oct 7, 2015, 1:33:15 PM
	 *
	 * @param usersService
	 */
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	public static Users addNew() {
		try {
			// return usersService.addNew(userName, password, firstName,
			// lastName, birthDay, address, email, phone, fax, companyId,
			// createdDate);
			// return getUsersService().addNew(userName, password, firstName,
			// lastName, birthDay, address, email, phone, fax, companyId,
			// createdDate);
			return null;
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			return null;
		}
	}

}
