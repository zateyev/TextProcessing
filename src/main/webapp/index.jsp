<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
  <title>INDEX.JSP</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/main" method="post">
  <textarea name="text" id="text" cols="80" rows="30"></textarea>
  <div><button type="submit">Submit</button></div>
</form>
</body>
</html>