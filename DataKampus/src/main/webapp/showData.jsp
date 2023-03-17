
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>List Dosen</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<!-- validasi delete -->
<script type="text/javascript">
	function checkdelete() {
		return confirm('Delete this?');
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
	<div class="container">
		<table class="table table-striped table-hover table-borderd mt-5">
			<tr>
				<th>Kode Dosen</th>
				<th>Nama Dosen</th>
				<th colspan="2">Action</th>
			</tr>
			<c:forEach items="${list}" var="dosen">
				<tr>
					<td><c:out value="${dosen.kodeDosen}" /></td>
					<td><c:out value="${dosen.namaDosen}" /></td>
					<td><a
						href="dataUpdate?kodeDosen=<c:out value='${dosen.kodeDosen}'/>" class='btn btn-sm btn-warning'>Edit</a></td>
					<td><a
						href="deleteData?kodeDosen=<c:out value='${dosen.kodeDosen}'/>" class='btn btn-sm btn-danger'
						onclick="return checkdelete();">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="index" class="btn btn-primary btn-md">Home</a>
	</div>
</body>
</html>