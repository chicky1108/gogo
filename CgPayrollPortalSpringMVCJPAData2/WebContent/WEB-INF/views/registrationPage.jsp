<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Registration</title>
<style>
.error{
color:red;
font-weight:bold;
}
</style>
</head>
<body>
	<form:form name="registerForm" action="registerAssociate" method="post" modelAttribute="associate">
		<h3 align="center">ASSOCIATE REGISTRATION FORM</h3>
		<table align="center" cellpadding="10">
			<tr>
				<td>FIRST NAME</td>
				<td><form:input path="firstName" maxlength="30" /></td>
				<td><form:errors path="firstName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>LAST NAME</td>
				<td><form:input path="lastName" maxlength="30" /></td>
				<td><form:errors path="lastName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>EMAIL ID</td>
				<td><form:input path="emailId" maxlength="100" /></td>
				<td><form:errors path="emailId" cssClass="error"/></td>
			</tr>
			<tr>
				<td>DEPARTMENT</td>
				<td><form:input path="department" maxlength="100" /></td>
				<td><form:errors path="department" cssClass="error"/></td>
			</tr>
			<tr>
				<td>DESIGNATION</td>
				<td><form:input path="designation" maxlength="100" /></td>
				<td><form:errors path="designation" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PANCARD</td>
				<td><form:input path="pancard" maxlength="100" /></td>
				<td><form:errors path="pancard" cssClass="error"/></td>
			</tr>
			<tr>
				<td>YEARLY INVESTMENT UNDER 80C</td>
				<td><form:input path="yearlyInvestmentUnder80C" maxlength="100" /></td>
				<td><form:errors path="yearlyInvestmentUnder80C" cssClass="error"/></td>
			</tr>
			<tr>
				<td>BASIC SALARY</td>
				<td><form:input path="salary.basicSalary" maxlength="100" /></td>
				<td><form:errors path="salary.basicSalary" cssClass="error"/></td>
			</tr>
			<tr>
				<td>EPF</td>
				<td><form:input path="salary.epf" maxlength="100" /></td>
				<td><form:errors path="salary.epf" cssClass="error"/></td>
			</tr>
			<tr>
				<td>COMPANY PF</td>
				<td><form:input path="salary.companyPf" maxlength="100" /></td>
				<td><form:errors path="salary.companyPf" cssClass="error"/></td>
			</tr>
			<tr>
				<td>ACCOUNT NO</td>
				<td><form:input path="bankDetails.accountNumber" maxlength="100" /></td>
				<td><form:errors path="bankDetails.accountNumber" cssClass="error"/></td>
			</tr>
			<tr>
				<td>BANK NAME</td>
				<td><form:input path="bankDetails.bankName" maxlength="100" /></td>
				<td><form:errors path="bankDetails.bankName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>IFSC CODE</td>
				<td><form:input path="bankDetails.ifscCode" maxlength="100" /></td>
				<td><form:errors path="bankDetails.ifscCode" cssClass="error"/></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>