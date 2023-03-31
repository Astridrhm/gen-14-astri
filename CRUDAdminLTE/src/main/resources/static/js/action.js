function sukses(result) {
	$("#msg").html("<span style='color: green'>Company added successfully</span>");
	setTimeout(function() {
		$("#modal-default").modal('hide');
		$("#name").val('');
		$("#email").val('');
		$("#address").val('');
		$("#msg").html("");
	}, 1000);
	tampil();
}

function tampil() {
	$('#list').empty();
	$.getJSON('http://localhost:8080/companyList',{myInput: $("#myInput").val()}, function(json) {
		var tr = [];
		tr.push('<thead>');
		tr.push('<tr>');
		tr.push('<td> ID </td>');
		tr.push('<td> Name </td>');
		tr.push('<td> Email </td>');
		tr.push('<td> Address </td>');
		tr.push('<td> Button </td>');
		tr.push('</tr>');
		tr.push('</thead>');
		tr.push('<tbody id="list2">');
		for (var i = 0; i < json.length; i++) {
			tr.push('<tr>');
			tr.push('<td>' + json[i].id + '</td>');
			tr.push('<td>' + json[i].name + '</td>');
			tr.push('<td>' + json[i].email + '</td>');
			tr.push('<td>' + json[i].address + '</td>');
			tr.push('<td><a class=\'btn btn-warning edit\'> Edit</a>&nbsp;&nbsp;<a class=\'btn btn-danger delete\' id=' + json[i].id + '> Delete</a></td>');
			tr.push('</tr>');
		}
		tr.push('</tbody>');
		$('table').append($(tr.join('')));
	});
}

$(document).ready(function() {
	$('#myInput').on('keyup', function() {
		tampil();
	});
	
	tampil();
	
	$("#tombolAddModal").click(function() {
		$("#modal-default").modal('show');
	})

	$("#closeTombol").click(function() {
		$("#msg").html("");
	})
	$(".close").click(function() {
		$("#msg").html("");
	})
	
	$(document).delegate('#addNew', 'click', function(event) {
		event.preventDefault();

		var name = $('#name').val();
		var email = $('#email').val();
		var address = $('#address').val();

		if (name == "" || email == "" || address == "") {
			$("#msg").html("<span style='color: red'>Data is required</span>");
		}
		if (name != "" && email != "" && address != "") {
			$.ajax({
				type: "POST",
				contentType: "application/json; charset=utf-8",
				url: "http://localhost:8080/company/save",
				data: JSON.stringify(
					{
						'name': name,
						'email': email,
						'address': address
					}),
				cache: false,
				success: sukses,
				error: function(err) {
					$("#msg").html("<span style='color: red'>Name is required</span>");
				}
			});
		}
	});

	$(document).delegate('.delete', 'click', function() {
		if (confirm('Do you really want to delete record?')) {
			var id = $(this).attr('id');
			var parent = $(this).parent().parent();
			$.ajax({
				type: "DELETE",
				url: "http://localhost:8080/company/delete/" + id,
				cache: false,
				success: function() {
					parent.fadeOut('slow', function() {
						$(this).remove();
					});
					location.reload(true)
				},
				error: function() {
					$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error deleting record').fadeIn().fadeOut(4000, function() {
						$(this).remove();
					});
				}
			});
		}
	});

	$(document).delegate('.edit', 'click', function() {
		var parent = $(this).parent().parent();

		var id = parent.children("td:nth-child(1)");
		var name = parent.children("td:nth-child(2)");
		var email = parent.children("td:nth-child(3)");
		var address = parent.children("td:nth-child(4)");
		var buttons = parent.children("td:nth-child(5)");

		name.html("<input type='text' id='name' value='" + name.html() + "'/>");
		email.html("<input type='text' id='email' value='" + email.html() + "'/>");
		address.html("<input type='text' id='address' value='" + address.html() + "'/>");
		buttons.html("<a id='save' class='btn btn-info'>Save</a>&nbsp;&nbsp;<a class=\'btn btn-danger delete\' id='" + id.html() + "'>Delete</a>");
	});

	$(document).delegate('#save', 'click', function() {
		var parent = $(this).parent().parent();

		var id = parent.children("td:nth-child(1)");
		var name = parent.children("td:nth-child(2)");
		var email = parent.children("td:nth-child(3)");
		var address = parent.children("td:nth-child(4)");
		var buttons = parent.children("td:nth-child(5)");

		$.ajax({
			type: "POST",
			contentType: "application/json; charset=utf-8",
			url: "http://localhost:8080/company/save",
			data: JSON.stringify(
				{
					'id': id.html(),
					'name': name.children("input[type=text]").val(),
					'email': email.children("input[type=text]").val(),
					'address': address.children("input[type=text]").val()
				}),
			cache: false,
			success: function() {
				name.html(name.children("input[type=text]").val());
				email.html(email.children("input[type=text]").val());
				address.html(address.children("input[type=text]").val());
				buttons.html("<a class=\'btn btn-warning edit\' id='" + id.html() + "'> Edit</a>&nbsp;&nbsp;<a class=\'btn btn-danger delete\' id='" + id.html() + "'> Delete</a>");
			},
			error: function() {
				$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error updating record').fadeIn().fadeOut(4000, function() {
					$(this).remove();
				});
			}
		});
	});

});