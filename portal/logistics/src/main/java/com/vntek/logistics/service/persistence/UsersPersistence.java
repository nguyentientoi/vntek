/**
 * 
 */
package com.vntek.logistics.service.persistence;

import java.util.Date;

import com.vntek.core.exception.SystemException;
import com.vntek.core.service.persistence.BasePersistence;
import com.vntek.logistics.model.Users;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:21:40 PM
 */
public interface UsersPersistence extends BasePersistence<Users> {
	/**
	 * <b>interface create a user</b>
	 * 
	 * @author ToiNT
	 * @since Sep 29, 2015, 11:54:30 PM
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
	 * @throws SystemException
	 */
	public Users addNew(String userName, String password, String firstName, String lastName, Date birthDay,
			String address, String email, String phone, String fax, long companyId, Date createdDate)
					throws SystemException;
}
