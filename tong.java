
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Thông tin CV | Bài tập cá nhân</title>

</head>
<body>
	<p>
		<em>Họ tên:</em> <span id="hoten"></span>
	</p>
	<p>
		<em>Giới tính:</em> <span id="gioitinh"></span>
	</p>
	<p>
		<em>Điện thoại:</em> <span id="dienthoai"></span>
	</p>
	<p>
		<em>Địa chỉ:</em> <span id="diachi"></span>
	</p>
	<p>
		<em>Email:</em> <span id="email"></span>
	</p>
	<p>
		<em>Tin học, ngoại ngữ:</em> <span id="thnn"></span>
	</p>
	<p>
		<em>Kinh nghiệm:</em> <span id="kinhnghiem"></span>
	</p>
	<p>
		<em>Vị trí tuyển dụng:</em> <span id="vitri"></span>
	</p>
	<p>
		<em>Thông tin thêm:</em> <span id="thongtinthem"></span>
	</p>
	<p>
		<a href="nhapthongtin.html">Nhập lại thông tin CV</a>
	</p>
	<script>
		function replaceStr(str){
			str = unescape(decodeURI(str));
			var i, strEnd = "";
			for(i=0;i<str.length;i++){
				if(str[i]=='+') strEnd += ' ';
				else strEnd += str[i];
			}

			return strEnd;
		}

		var param = location.search.substring(1).split("&");
		var i;
		for(i=0;i<param.length;i++){
			var temp = param[i].split("=");
			document.getElementById(temp[0]).innerHTML = "<b>" + replaceStr(temp[1]) + "</b>";
		}

	</script>
</body>
</html>