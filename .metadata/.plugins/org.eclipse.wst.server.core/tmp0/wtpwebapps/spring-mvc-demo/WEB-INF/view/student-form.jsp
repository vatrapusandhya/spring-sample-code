<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName"/>
	
	<br><br>
	
	Last name: <form:input path="lastName"/>
	
	<br><br>
	
	Country: <form:select path="country">
	<!-- <form:option value="India" label="Brazil"/> -->
		<form:options items= "${student.countryOptions}"/>
	</form:select>
	<br><br>
	Favorite Programming Language:
	<br>
	Java <form:radiobutton path="favoriteLanguage" value="JAVA"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
	<!-- if using Hashmap from java then follow below spring JSP -->
	<!-- here favoriteLanguageOptions is getter method name -->
	<!-- form:radiobuttons path="favoriteLanguage" items="{student.favoriteLanguageOptions}" -->
	
	
	
	<br><br>
	Operating Systems:
	
	<!--Windows<form:checkbox path="operatingSystem" value="Windows"/>  -->
	<form:checkboxes items="${student.operatingSystems}" path="OperatingSystem"/>
	
	
	<br><br>
	<input type="submit" value="Submit">
	
	</form:form>




</body>
</html>