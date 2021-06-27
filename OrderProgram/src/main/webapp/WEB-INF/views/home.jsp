<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
<style>
	body#LoginForm{ background-image:url("https://hdwallsource.com/img/2014/9/blur-26347-27038-hd-wallpapers.jpg"); background-repeat:no-repeat; background-position:center; background-size:cover; padding:10px;}
	
	.form-heading { color:#fff; font-size:23px;}
	.panel h2{ color:#444444; font-size:30px; margin:0 0 25px 0;}
	.panel p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}
	.login-form .form-control {
	  background: #f7f7f7 none repeat scroll 0 0;
	  border: 1px solid #d4d4d4;
	  border-radius: 4px;
	  font-size: 14px;
	  height: 50px;
	  line-height: 50px;
	}
	.main-div {
	  background: #ffffff none repeat scroll 0 0;
	  border-radius: 2px;
	  margin: 20% auto 20%;
	  max-width: 38%;
	  padding: 50px 70px 70px 71px;
	}
	
	.login-form .form-group {
	  margin-bottom:10px;
	}
	.login-form{ text-align:center;}
	.forgot a {
	  color: #777777;
	  font-size: 14px;
	  text-decoration: underline;
	}
	.login-form  .btn.btn-primary {
	  background: #f0ad4e none repeat scroll 0 0;
	  border-color: #f0ad4e;
	  color: #ffffff;
	  font-size: 14px;
	  width: 100%;
	  height: 50px;
	  line-height: 50px;
	  padding: 0;
	}
	.forgot {
	  text-align: center; margin-bottom:30px;
	}
	.botto-text {
	  color: #ffffff;
	  font-size: 14px;
	  margin: auto;
	}
	.login-form .btn.btn-primary.reset {
	  background: #ff9900 none repeat scroll 0 0;
	}
	.back { text-align: left; margin-top:10px;}
	.back a {color: #444444; font-size: 13px;text-decoration: none;}
	
	.checkid {
		margin-right:20px;
	}
	
	.checkpw {
		margin-right:20px;
	}
	
	.form-group input[type=radio]{
		display: none;
	}
	
	.form-group input[type=radio] + label{
		color: #8C8C8C;
		border-color: #f0ad4e;
	}
	
	.form-group input[type=radio]:checked + label{
	  background: #f0ad4e none repeat scroll 0 0;
	  border-color: #f0ad4e;
	  color: #ffffff;
	}
</style>
<!-- <script src="https://code.jquery.com/jquery-3.6.0.js"></script> -->
<script>
function login() {
	var LoginForm = document.createElement('form');
	var seller = document.getElementById("seller");
	var buyer = document.getElementById("buyer");
	var id = document.getElementById("id");
	var pw = document.getElementById("pw");
	var loginbtn = document.getElementById('login-btn');
	var input = document.createElement("input");
	input.value = $("input[type='radio']:checked").val();
	input.name = "mCode";
	/* set attribute (form) newForm.name = 'newForm'; */
	LoginForm.method = 'post';
	LoginForm.action = '';
	document.body.appendChild(LoginForm);
	LoginForm.appendChild(seller);
	LoginForm.appendChild(buyer);
	LoginForm.appendChild(id);
	LoginForm.appendChild(pw);
	LoginForm.appendChild(loginbtn);
	LoginForm.appendChild(input);
	LoginForm.submit();
}
</script>
</head>
<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


<html>
<head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<body id="LoginForm">
<div class="container">
	<h1 class="form-heading"></h1>
	<div class="login-form">
		<div class="main-div">
		    <div class="panel">
		   		<h2>로그인</h2>
		    </div>
		    <!-- <form action="" id="Login" method="post"> -->
				<div class="form-group" role="group" aria-label="Basic radio toggle button group">
			  		<input type="radio" class="btn-check" name="membertype" id="buyer" value="buyer" checked>
			  		<label class="btn btn-outline-warning" for="buyer">구매자</label>
			  		<input type="radio" class="btn-check" name="membertype" id="seller" value="seller">
			  		<label class="btn btn-outline-warning" for="seller">판매자</label>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="id" name="id" placeholder="ID">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" id="pw" name="pw" placeholder="Password">
				</div>
				<div class="forgot">
					<!-- <a href="product" class="checkid">ID 찾기</a> -->
					<a href="bmemjoin" class="checkpw">구매자 회원가입</a>
					<a href="smemjoin" class="join">판매자 회원가입</a>
				</div>
		    	<!-- <button type="submit" class="btn btn-primary">Login</button> -->
		    <!-- </form> -->
		    <input type="button" value="Login" id="login-btn" class="btn btn-primary" onclick="login()">
		</div>
	</div>
</div>


</body>
</html>


</body>
</html>
