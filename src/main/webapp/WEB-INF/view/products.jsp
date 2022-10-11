<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Product page</h1>

<ul>
    <c:forEach var="list" items="${products}" varStatus="iter"><tr>
        <td>${list}</td>
    </tr></c:forEach>
</ul>

</body>
</html>