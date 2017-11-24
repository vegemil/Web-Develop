<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>

<c:forEach var="api" items="${lists}" varStatus="idx">
title:${api.title} id:${api.id} apiKey:${api.apiKey}
</c:forEach>
</body>
</html>
