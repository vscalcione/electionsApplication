<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/pages/jsp/common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="/WEB-INF/pages/jsp/common/head.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/pages/jsp/common/navbar.jsp" />

<div class="container">
  <!-- Content here -->
  <h1>Hello ${username}</h1>
</div>
</body>
</html>
