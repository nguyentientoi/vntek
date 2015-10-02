/**
 * 
 */
package com.vntek.logistics.model;

import java.util.Date;

import com.vntek.core.model.BaseModel;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 3:42:14 PM
 */
public interface Users extends BaseModel<Users> {

	public Long getId();

	public void setId(Long id);

	public String getUserName();

	public void setUserName(String userName);

	public String getPassword();

	public void setPassword(String password);

	public String getFullName();

	public void setFullName(String fullName);

	public Date getBirthDay();

	public void setBirthDay(Date birthDay);

	public String getEmail();

	public void setEmail(String email);

	public String getAddress();

	public void setAddress(String address);

	public String getPhone();

	public void setPhone(String phone);

	public String getFax();

	public void setFax(String fax);

	public String getWebsite();

	public void setWebsite(String website);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public Long getCompanyId();

	public void setCompanyId(Long companyId);

	public Date getCreatedDate();

	public void setCreatedDate(Date createdDate);

	public Date getModifiedDate();

	public void setModifiedDate(Date modifiedDate);

}
