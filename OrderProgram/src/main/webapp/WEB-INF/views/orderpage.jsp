<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>당근당근 발주하기</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> <!-- 글씨체 -->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
        body {
            margin: 0;
            padding: 0;
        }

        a.navbar-brand {
            float: left;
            height: 50px;
            padding: 15px 15px;
            font-size: 18px;
            line-height: 20px;
            text-decoration: none;
            color: white;
            font-family: cursive;
            color: green;
            font-weight: 700;
			margin-top: 8px;
            margin-bottom: 7px;
            margin-left: 20px;
        }

        nav.main-navigation {
            position: relative;
            background-color: orange;
            /* border: 3px solid orange;
            border-top: none;
            border-right: none;
            border-left: none; */
            box-shadow: 3px 3px 3px 2px #FFCA6C;
        }

        nav.main-navigation ul.nav-list {
            margin: 0;
            padding: 0;
            list-style: none;
            position: relative;
            text-align: right;
        }

        .nav-list li.nav-list-item {
            display: inline-block;
            line-height: 40px;
            margin-right: 20px;
            margin-top: 7px;
            margin-bottom: 7px;
        }

        a.nav-link {
            text-decoration: none;
            font-size: 18px;
            font-family: sans-serif;
            font-weight: 500;
            cursor: pointer;
            position: relative;
            color: green;
        }

        @keyframes FadeIn {
            0% {
                opacity: 0;
                -webkit-transition-duration: 0.8s;
                transition-duration: 0.8s;
                -webkit-transform: translateY(-10px);
                -ms-transform: translateY(-10px);
                transform: translateY(-10px);
            }


            100% {
                opacity: 1;
                -webkit-transform: translateY(0);
                -ms-transform: translateY(0);
                transform: translateY(0);
                pointer-events: auto;
                transition: cubic-bezier(0.4, 0, 0.2, 1);
            }
        }

        .nav-list li {
            animation: FadeIn 1s cubic-bezier(0.65, 0.05, 0.36, 1);
            animation-fill-mode: both;
        }

        .nav-list li:nth-child(1) {
            animation-delay: .3s;
        }

        .nav-list li:nth-child(2) {
            animation-delay: .6s;
        }

        .nav-list li:nth-child(3) {
            animation-delay: .9s;
        }

        .nav-list li:nth-child(4) {
            animation-delay: 1.2s;
        }

        .nav-list li:nth-child(5) {
            animation-delay: 1.5s;
        }

        /* Animation */

        @keyframes fadeInUp {
            from {
                transform: translate3d(0, 40px, 0)
            }

            to {
                transform: translate3d(0, 0, 0);
                opacity: 1
            }
        }

        @-webkit-keyframes fadeInUp {
            from {
                transform: translate3d(0, 40px, 0)
            }

            to {
                transform: translate3d(0, 0, 0);
                opacity: 1
            }
        }

        .animated {
            animation-duration: 1s;
            animation-fill-mode: both;
            -webkit-animation-duration: 1s;
            -webkit-animation-fill-mode: both
        }

        .animatedFadeInUp {
            opacity: 0
        }

        .fadeInUp {
            opacity: 0;
            animation-name: fadeInUp;
            -webkit-animation-name: fadeInUp;
        }
        table, th, tr, td {
        	border-collapse: collapse;
        	border : 1px gray solid;
        	font-size: 14px;
        	padding: 3px;
        }
        th {text-align: center;}
</style>
<script>
	function basket(pcode,index) {
		var form = document.createElement('form');
		var amountid= "amount"+index;
		var amount = document.getElementById(amountid).value;
		console.log(pcode);
		console.log(amount);
		form.action = "basket";
		form.method = "post";
		var inputpcode = document.createElement('input');
		var inputamount = document.createElement('input');
		var bid = document.createElement('input');
		inputpcode.value = pcode;
		inputpcode.name = 'jpcode';
		inputpcode.type = 'hidden';
		inputamount.value = amount;
		inputamount.name = 'jamount';
		inputamount.type = 'hidden';
		document.body.appendChild(form);
		form.appendChild(inputpcode);
		form.appendChild(inputamount);
		form.submit();
	}
</script>
</head>
<body>
	<nav class="main-navigation">
        <div class="navbar-header animated fadeInUp">
            <a class="navbar-brand" href="home">당근당근</a>
        </div>
        <ul class="nav-list">
            <li class="nav-list-item">
                <a href="orderpage" class="nav-link">발주하기</a>
            </li>
            <li class="nav-list-item">
                <a href="orderview" class="nav-link">발주조회</a>
            </li>
            <li class="nav-list-item">
                <a href="bmypage" class="nav-link">마이페이지</a>
            </li>
            <li class="nav-list-item">
                <a href="logout" class="nav-link">Logout</a>
            </li>
            <li class="nav-list-item">
                <a href="basket" class="nav-link">장바구니</a>
            </li>
        </ul>

    </nav>
    <span style="text-align: right; font-size: 13px;">${sessionScope.loginMember}님 반갑습니다.</span>
    <table>
    	<tr>
    		<th>선택</th>
    		<th>품목명</th>
    		<th>마감</th>
    		<th>원산지</th>
    		<th>단가</th>
    		<th>유통기한</th>
    		<th>판매처</th>
    		<th>수량</th>
    		<th>장바구니</th>
    	</tr>
    	<c:forEach var="product" varStatus="status" items="${productList}">
    		<tr>
    			<td style="text-align:center"><input type="checkbox" name="product" id="pcode${status.count}" value="${product.pcode}"></td>
    			<td>${product.pname}</td>
    			<td>${product.pdate}</td>
    			<td>${product.pcountry}</td>
    			<td style="text-align:right">${product.pprice}</td>
    			<td>${product.pexdate}</td>
    			<td>${product.sname}</td>
    			<td><input type="number" name="quan" id="amount${status.count}" min="1" max="100" step="1"></td>
    			<td style="text-align:center"><input type="button" value="담기" onclick="basket('${product.pcode}','${status.count}')"></td>
    		</tr>
    	</c:forEach>
    </table>
</body>
</html>