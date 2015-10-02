/**
 * 
 */
package com.vntek.logistics.service.impl;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.vntek.core.exception.SystemException;
import com.vntek.core.service.impl.BaseServiceImpl;
import com.vntek.logistics.model.Users;
import com.vntek.logistics.service.UsersService;
import com.vntek.logistics.service.persistence.UsersPersistence;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:07:41 PM
 */
public class UsersServiceImpl extends BaseServiceImpl implements UsersService {

	/**
	 * 
	 * @author ToiNT
	 * @since Sep 30, 2015, 12:03:11 AM
	 * 
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param birthDay
	 * @param address
	 * @param email
	 * @param phone
	 * @param fax
	 * @param companyId
	 * @param createdDate
	 * @return
	 */
	public Users addNew(String userName, String password, String firstName, String lastName, Date birthDay,
			String address, String email, String phone, String fax, long companyId, Date createdDate) {
		try {
			return usersPersistence.addNew(userName, password, firstName, lastName, birthDay, address, email, phone,
					fax, companyId, createdDate);
		} catch (SystemException e) {
			_log.log(Level.SEVERE, e.getMessage(), e);
			return null;
		}
	}

	public UsersPersistence getUsersPersistence() {
		return usersPersistence;
	}

	public void setUsersPersistence(UsersPersistence usersPersistence) {
		this.usersPersistence = usersPersistence;
	}

	private UsersPersistence usersPersistence;

	private static final Logger _log = Logger.getLogger(UsersServiceImpl.class.getName());

}
