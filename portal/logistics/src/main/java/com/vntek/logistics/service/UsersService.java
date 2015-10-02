/**
 * 
 */
package com.vntek.logistics.service;

import java.util.Date;

import com.vntek.core.exception.SystemException;
import com.vntek.core.service.BaseService;
import com.vntek.logistics.model.Users;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:07:06 PM
 */
public interface UsersService extends BaseService {
	public Users addNew(String userName, String password, String firstName, String lastName, Date birthDay,
			String address, String email, String phone, String fax, long companyId, Date createdDate)
					throws SystemException;
}
