<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>memberjoin</title>
<style>
	body#LoginForm{ background-image:url("https://hdwallsource.com/img/2014/9/blur-26347-27038-hd-wallpapers.jpg"); background-repeat:no-repeat; background-position:center; background-size:cover; padding:10px;}
	
	.form-heading { color:#fff; font-size:23px;}
	.panel h2{ color:#444444; font-size:30px; margin:0 0 25px 0;}
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
	  margin: 15% auto 15%;
	  max-width: 45%;
	  padding: 50px 70px 70px 71px;
	}
	
	.login-form .form-group {
	  margin-bottom:10px;
	}
	.panel { text-align:center;}
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
	.form-group span { text-align: left;  font-size: 13px;}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	function idcheck() {
    	var exp = /^(?=.*[a-z])(?=.*\d)[a-z\d]{6,10}$/;
		var id = document.getElementById('sid').value;
		var idcheck = document.getElementById('idcheck');
		console.log(id);
		$.ajax({
			type : 'post', 
			url : 'sidcheck', 
			data : {'sid' : id}, 
			dataType : 'text',
			success : function(abc) {
				console.log('된다!');
				console.log('리턴값'+abc);
				if(id.length == 0) {
					idcheck.style.color = 'red';
		        	idcheck.innerHTML = '필수 정보입니다.';
				} else if(abc=="ok") {
					idcheck.style.color = 'green';
			      	idcheck.innerHTML = '사용가능한 아이디 입니다.';
				} else {
					idcheck.style.color = 'red';
					idcheck.innerHTML = '이미 사용중인 아이디 입니다.';
				}
			},
			error: function(){
				console.log('왜안대!');
			}
			
		});
		
	}

function pwcheck() {
    var exp = /^(?=.*[a-z])(?=.*\d)(?=.*[!#$*])[a-z\d!#$*]{8,16}$/;
    var pw = document.getElementById('pw').value;
    var pwcheck = document.getElementById('pwcheck');
    if(pw.length == 0) {
        pwcheck.innerHTML = '필수 정보입니다.';
        pwcheck.style.color = 'red';
    } else if(pw.match(exp)) {
        pwcheck.innerHTML = '유효한 형식입니다.';
        pwcheck.style.color = 'green';
    } else {
        pwcheck.innerHTML = '8~16자 영문 소문자, 숫자, 특수문자(!#$*)를 사용하세요.';
        pwcheck.style.color = 'red';
    }            
}

function pwresult() {
    var pw = document.getElementById('pw').value;
    var check = document.getElementById('pwc').value;
    var pwresult = document.getElementById('pwresult');
    if(pw == check) {
        pwresult.innerHTML = '비밀번호가 일치합니다';
        pwresult.style.color = 'green';
    } else {
        pwresult.innerHTML = '비밀번호가 일치하지 않습니다';
        pwresult.style.color = 'red';
    }
}

function rncheck() {
    var exp = /^\d{10}$/; 
    var rnb = document.getElementById('rnb').value;
    var rncheck = document.getElementById('rncheck');
    if(rnb.length == 0) {
        rncheck.innerHTML = '필수 정보입니다.';
        rncheck.style.color = 'red';
    } else if(rnb.match(exp)) {
        rncheck.innerHTML = '유효한 형식입니다.';
        rncheck.style.color = 'green';
    } else {
        rncheck.innerHTML = '- 를 제외한 10자리 숫자만 입력하세요';
        rncheck.style.color = 'red';
    }            
}


function namecheck() {
    var exp = /^[가-힣a-zA-Z0-9]+$/;
    var name = document.getElementById('name').value;
    var namecheck = document.getElementById('namecheck');
    if(name.length == 0) {
        namecheck.innerHTML = '필수입력입니다';
        namecheck.style.color = 'red';
    } else if(name.match(exp)) {
        namecheck.innerHTML = '';
        namecheck.style.color = 'green';
    } else {
        namecheck.innerHTML = '한글과 영문 대 소문자 숫자를 사용하세요. (특수기호 사용 불가)';
        namecheck.style.color = 'red';
    }
}

function phonecheck() {
    var exp = /^\d{11}$/;
    var phone = document.getElementById('phone').value;
    var phonecheck = document.getElementById('phonecheck');
    if(phone.length == 0) {
        phonecheck.innerHTML = '필수입력 항목입니다';
        phonecheck.style.color = 'red';
    } else if(phone.match(exp)) {
        phonecheck.innerHTML = '';
        phonecheck.style.color = 'green';
    } else {
        phonecheck.innerHTML = '- 를 제외한 11자리 숫자만 입력하세요';
        phonecheck.style.color = 'red';
    }
}

function addcheck() {
    var address = document.getElementById('sample4_postcode').value;
    var addcheck = document.getElementById('addcheck');
    if(address.length == 0) {
        addcheck.innerHTML = '필수입력 항목입니다';
        addcheck.style.color = 'red';
    } else {
    	addcheck.innerHTML = '';
    }
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
		   		<h2>판매자 회원가입</h2>
		    </div>
		    <form action="smemberjoin" id="Login" method="post">
				<div class="form-group">
					<input type="text" class="form-control" name="sid" id="sid" placeholder="아이디" onblur="idcheck()">
					<span id="idcheck"></span>
				</div>
				
				<div class="form-group">
					<input type="password" class="form-control" name="spassword" id="pw" placeholder="비밀번호" onblur="pwcheck()">
					<span id="pwcheck"></span>
				</div>
				
				<div class="form-group">
					<input type="password" class="form-control" name="spasswordcheck" id="pwc" placeholder="비밀번호 확인" onblur="pwresult()">
					<span id="pwresult"></span>
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" name="srnumber" id="rnb" placeholder="사업자등록번호" onblur="rncheck()">
					<span id="rncheck"></span>
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" name="sname" id="name" placeholder="업체명" onblur="namecheck()">
					<span id="namecheck"></span>
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" name="sphone" id="phone" placeholder="연락처" onblur="phonecheck()">
					<span id="phonecheck"></span>
				</div>
				
				<!-- 다음주소 -->
				<div class="form-group">
					<input type="text" class="form-control" id="sample4_postcode" name="saddress" placeholder="우편번호" onblur="addcheck()">
					<span id="addcheck"></span>
					<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" id="sample4_jibunAddress" name="saddress" placeholder="지번주소">
					<span id="guide" class="form-control" style="color:#999;display:none"></span>
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" id="sample4_extraAddress" name="saddress" placeholder="참고항목">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" id="sample4_roadAddress" name="saddress" placeholder="도로명주소">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" id="sample4_detailAddress" name="saddress" placeholder="상세주소">
				</div>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
		    
		    <button type="submit" class="btn btn-primary">가입하기</button>
		
		    </form>
		    </div>
		</div>
	</div>


</body>
</html>


</body>
</html>
