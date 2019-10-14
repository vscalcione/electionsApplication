<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/pages/jsp/common/common.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="/WEB-INF/pages/jsp/common/head.jsp" %>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="author" content="Scalcione Vincenzo">
        <meta name="description" content="page for email allowedEmail form">
        <title>AllowedEmail form</title>
        <link rel="icon" type="image/png" href="/WEB-INF/pages/web-resources/images/icons/favicon.ico" />

        <!-- Link css -->
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/animate/animate.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/css-hamburgers/hamburgers.min.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/resources/vendor/select2/select2.min.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/css/util.css" />
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/css/main.css" />
        <style type="text/css">
            .hidden{
                visibility: hidden;
            }
        </style>

        <!-- Link js -->
        <script type="text/javascript" src="/WEB-INF/pages/web-resources/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="/WEB-INF/pages/web-resources/vendor/bootstrap/js/popper.js"></script>
        <script type="text/javascript" src="./WEB-INF/pages/web-resources/vendor/select2/select2.min.js"></script>
        <script type="text/javascript" src="/WEB-INF/pages/web-resourcesvendor/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="/WEB-INF/pages/web-resources/js/main.js"></script>

    </head>
    <body>
        <jsp:include page="/WEB-INF/pages/jsp/common/navbar.jsp">
            <jsp:param name="active" value="allowedEmail"/>
        </jsp:include>
        <div class="limiter">
            <div class="container-login100">
                <div class="container">
                    <a href="${ctx}dipendente">Indietro</a> <br>
                    <hr>
                    <c:choose>
                        <c:when test="${not empty allowedEmail.idAllowedEmail}">
                            <c:url value="/allowedEmail/${allowedEmail.idAllowedEmail}/edit" var="saveUrl" />
                        </c:when>
                        <c:otherwise>
                            <c:url value="/allowedEmail/new" var="saveUrl" />
                        </c:otherwise>
                    </c:choose>
                    <form action="${saveUrl}" method="post">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <c:if test="${not empty allowedEmail.idAllowedEmail}">
                            <label>Id:</label>
                            ${allowedEmail.idAllowedEmail} <input type="hidden" name="idAllowedEmail" value="${alloweddEmail.idAllowedEmail}">
                            <br>
                        </c:if>
                        <label>Indirizzo Email:</label>
                        <input type="email" name="allowedEmail-email" value="${allowedEmail.email}"> <br>
                        <input type="reset" value="Cancella"> <input type="submit" value="Salva">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>