<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- <!DOCTYPE html> -->
<html>
<head>
<!-- <meta charset="ISO-8859-1"> -->
<title>Employee details</title>
<link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css"/>
</head>
<body>

	<div class="container">
		<h1>Employee List</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Employee id</th>
					<th>Employee Name</th>
					<th>Employee Salary</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employeeList}" var="employee">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.empName}</td>
						<td>${employee.empSal}</td>
						<td><a type="button" class="btn btn-success" href="/update-emp?id=${employee.id}">update</td>
						<td><a type="button" class="btn btn-warning" href="/delete-emp?id=${employee.id}">delete</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a type="button" class="btn btn-success" href="/add-emp">Add Employee</a>
	</div>

<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>

</body>
</html>