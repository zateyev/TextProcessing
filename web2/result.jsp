<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="text" scope="request" type="com.epam.textprocessing.entity.Paragraph"/>
<html>
<head>
  <title>RESULT.JSP</title>
</head>
<body>
Sentences: ${text.toSourceString()}
<p>Sentences amount: ${text.sentenceAmount}</p>
</body>
</html>
