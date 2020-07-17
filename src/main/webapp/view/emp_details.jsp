<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Employee details</title>
	<link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css"/>
</head>
<body>

<div class="container">
	<h1>${operation}</h1>
	<form:form method="post" modelAttribute="employee">
<!-- 		<fieldset class="form-group"> -->
<%-- 			<form:label path="id">Id</form:label> --%>
<%-- 			<form:input type="text" path="id" class="form-control" required="required"/> --%>
<!-- 		</fieldset> -->
		<form:hidden path="id"></form:hidden>
		<fieldset class="form-group">
			<form:label path="empName">Name</form:label>
			<form:input type="text" path="empName" class="form-control" required="required"/>
		</fieldset>
		<fieldset class="form-group">
			<form:label path="empSal">Salary</form:label>
			<form:input type="text" path="empSal" class="form-control" required="required"/>
		</fieldset>
		
		<button type="submit" class="btn btn-success">Save</button>
	</form:form>
	
</div>


<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>