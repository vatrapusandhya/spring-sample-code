<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation Form</title>
</head>
<body>
<i>Customer Details:</i>
<br>
Name: ${customer.firstName} ${customer.lastName}
<br>
Free Passes count: ${customer.freePasses}
<br>
Postal Code: ${customer.postalCode}
<br>
Course Code: ${customer.courseCode}
<br>
</body>
</html>