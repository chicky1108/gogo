<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>GET ASSOCIATE DETAILS</title>
<style>
.error{
color:red;
font-weight:bold;
}
</style>
</head>
<body>
<form name="getAssociateDetails" action="associateDetails" method="post">
		<h3 align="center">GET ASSOCIATE DETAILS</h3>
		<table align="center" cellpadding="10">
			<tr>
				<td>ASSOCIATE ID</td>
				<td><input type="text" name="associateId"maxlength="30" /></td>
			</tr>
				<tr>
				<td colspan="2" align="center"><input type="submit"
					value="submit" /></td>
			</tr>
			<tr>
			<td><a href="index">Home</a></td>
			</tr>
			</table>
	</form>
<div align="center" class="error">${errorMessage }</div>
<br>
<br>
<div align="center">
<table>
<tr>
<th>AssociateId</th>
<th>FirstName</th>
<th>LastName</th>
<th>EmailID</th>
</tr>
<tr>
<td>${associate.associateId}</td>
<td>${associate.firstName }</td>
<td>${associate.lastName }</td>
<td>${associate.emailId }</td>
</tr>
</table>
</div>
</body>
</html>