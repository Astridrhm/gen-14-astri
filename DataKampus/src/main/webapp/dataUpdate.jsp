<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script type="text/javascript">
	function validate() {
		var nama = document.myForm.namadosen.value;
		if (nama == "") {
			alert("nama tidak boleh kosong");
			return false;
		} else {
			return true;
		}
	}
</script>

</head>

<body>
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Data Dosen</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
				aria-controls="navbarNavAltMarkup" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link" href="showData">Lihat Data</a>
				</div>
			</div>
		</div>
	</nav>
	<div class="w-50 mx-auto mt-3">
	<h2>Data Baru</h2>
	<form action="UpdateController" method="post" name="myForm" onsubmit="return validate();">
		<label for="kode">Kode Dosen</label>
		<input type="text"
			class="form-control" name="kodedosen" value="${dosen.kodeDosen}" readonly><br>
		<label for="name">Nama Dosen</label>
		<input type="text"
			class="form-control" name="namadosen" value="${dosen.namaDosen}"><br> 
			<input
			type="submit" class="btn btn-success">
	</form>
</body>
</html>