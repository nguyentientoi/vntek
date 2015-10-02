/**
 * 
 */
package com.vntek.logistics.model.impl;

import java.util.Date;

import com.vntek.core.model.impl.BaseModelImpl;
import com.vntek.logistics.model.Users;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 3:42:52 PM
 */
public class UsersImpl extends BaseModelImpl<Users> implements Users {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5878123359113340098L;
	private Long id;
	private String userName;
	private String password;
	private String fullName;
	private Date birthDay;
	private String address;
	private String email;
	private String phone;
	private String fax;
	private String website;
	private String firstName;
	private String lastName;
	private Long companyId;
	private Date createdDate;
	private Date modifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int compareTo(Users o) {
		long id = o.getId();
		if (getId() < id)
			return -1;
		else if (getId() > id)
			return 1;
		else
			return 0;
	}

}
