<html>
<head>
<title>CRUD Dosen</title>
<!-- bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<!-- validasi form -->
<script type="text/javascript">
	function validate() {
		var kode = document.myForm.newKode.value;
		var nama = document.myForm.newNama.value;
		if (kode == "" || nama == "") {
			alert("data tidak boleh kosong");
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
		<h2>Data Dosen</h2>
		<form action="getDataKampus" method="post" name="myForm"
			onsubmit="return validate();">
			<label for="kode">Kode Dosen</label> 
			<input type="text"
				name="newKode" class="form-control"><br> 
				<label
				for="nama">Nama Dosen</label> 
				<input type="text" name="newNama"
				class="form-control"><br> <input type="submit"
				value="Submit" class="btn btn-success"> <br>
		</form>
	</div>
</body>


</html>
