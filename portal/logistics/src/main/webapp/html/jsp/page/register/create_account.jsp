<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

<s:form action="/CreateAccount" method="POST" id="frm">
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group">
					<label>Địa chỉ Email</label>
					<input type="email" id="crEmail" class="form-control" />
				</div>
			</div>
			<div class="col-xs-6">
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group">
					<label>Mật khẩu</label>
					<input type="password" name="crPassword1" id="crPassword1" class="form-control" />
				</div>
			</div>
			<div class="col-xs-6">
				<div class="form-group">
					<label>Nhập lại mật khẩu</label>
					<input type="password" name="crPassword2" id="crPassword2" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group">
					<label>Họ</label>
					<input name="crLastName" id="crLastName" class="form-control" />
				</div>
			</div>
			<div class="col-xs-6">
				<div class="form-group">
					<label>Tên</label>
					<input name="crFirstName" id="crFirstName" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group">
					<label>Địa chỉ</label>
					<input name="crAddress" id="crAddress" class="form-control" />
				</div>
			</div>
			<div class="col-xs-6">
				<div class="form-group">
					<label>Ngày sinh</label>
					<input type="date" name="crBirthDay" id="crBirthDay" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group">
					<label>Điện thoại</label>
					<input type="number" name="crPhone" id="crPhone" class="form-control" />
				</div>
			</div>
			<div class="col-xs-6">
				<div class="form-group">
					<label>Fax</label>
					<input type="number" name="crFax" id="crFax" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12">
				<div class="form-group">
					<label>Website</label>
					<input type="url" name="crWebsite" id="crWebsite" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12" style="text-align: center">
				<button type="button" class="btn">Hủy</button>
				<button type="submit" class="btn">Đăng kí</button>
			</div>
		</div>
	</div>
</s:form>