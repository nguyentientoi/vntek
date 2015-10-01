<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#page-top">KÊNH VẬN TẢI</a>
		</div>
		<div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden active">
					<a href="#page-top"></a>
				</li>
				<li class="page-scroll">
					<a href="remote.html" data-toggle="modal" data-target="#form-login" data-whatever="@mdo">Đăng nhập</a>
				</li>
				<li class="page-scroll">
					<a href="${contextPath}/Register">Đăng kí</a>
				</li>
			</ul>
		</div>
	</div>
</nav>

<div class="modal fade" id="form-login" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Đóng"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">Đăng nhập</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label>Tên đăng nhập</label>
					<input type="text" id="userName" class="form-control" placeholder="Tên đăng nhập" />
				</div>
				<div class="form-group">
					<label>Mật khẩu</label>
					<input type="password" id="password" class="form-control" placeholder="Mật khẩu" />
				</div>
				<div class="checkbox">
					<label>
						<input type="checkbox"> Ghi nhớ tôi
					</label>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default">Đăng nhập</button>
			</div>
		</div>
	</div>
</div>