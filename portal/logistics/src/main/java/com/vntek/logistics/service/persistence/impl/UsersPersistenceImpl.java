/**
 * 
 */
package com.vntek.logistics.service.persistence.impl;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.vntek.core.exception.SystemException;
import com.vntek.core.service.persistence.impl.BasePersistenceImpl;
import com.vntek.core.util.StringPool;
import com.vntek.logistics.model.Users;
import com.vntek.logistics.model.impl.UsersImpl;
import com.vntek.logistics.service.persistence.UsersPersistence;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:21:56 PM
 */
public class UsersPersistenceImpl extends BasePersistenceImpl<Users> implements UsersPersistence {

	/**
	 * create a user
	 * 
	 * @author ToiNT
	 * @since Sep 29, 2015, 11:52:40 PM
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
			Users user = new UsersImpl();

			user.setUserName(userName);
			user.setPassword(password);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setFullName(firstName + StringPool.SPACE + lastName);
			user.setBirthDay(birthDay);
			user.setAddress(address);
			user.setEmail(email);
			user.setPhone(phone);
			user.setFax(fax);
			user.setCompanyId(companyId);
			user.setCreatedDate(createdDate);

			return this.save(user);
		} catch (SystemException ex) {
			_log.log(Level.SEVERE, ex.getMessage(), ex);
			return null;
		}
	}

	/**
	 * log to server
	 */
	private static final Logger _log = Logger.getLogger(UsersPersistenceImpl.class.getName());

}
