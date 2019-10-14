<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/pages/jsp/common/common.jsp"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="author" content="Scalcione Vincenzo">
        <meta name="description" content="page for detail allowedEmail">
        <title>AllowedEmail Details</title>
        <link rel="icon" type="image/png" href="/WEB-INF/pages/web-resources/images/icons/favicon.ico"/>

        <!-- Link css -->
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/animate/animate.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/css-hamburgers/hamburgers.min.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/vendor/select2/select2.min.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/css/util.css">
        <link rel="stylesheet" type="text/css" href="/WEB-INF/pages/web-resources/css/main.css">

        <!-- Link js -->
        <script src="/WEB-INF/pages/web-resources/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script src="/WEB-INF/pages/web-resources/vendor/bootstrap/js/popper.js"></script>
        <script src="/WEB-INF/pages/web-resources/vendor/select2/select2.min.js"></script>
        <script src="/WEB-INF/pages/web-resources/vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="/WEB-INF/pages/web-resources/js/main.js"></script>
        <style media="screen">
            .hidden{ visibility: hidden;}
            .spread {display:flex; align-items:center;}
            .field {display:flex; position:relative;}
            .button-customized {border-radius: 20px; color: white;}
        </style>
        <%@ include file="/WEB-INF/pages/jsp/common/head.jsp" %>

    </head>
    <body>
    <jsp:include page="/WEB-INF/pages/jsp/common/navbar.jsp">
        <jsp:param name="active" value="attivita" />
    </jsp:include>
    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30" style="width:800px; height:720px;">
                <div class="container">
                    <form>
                        <div class="form-group">
                            Dettaglio AllowedEmail <button type="button" class="btn btn-primary" style="float: right;" onclick="window.location.href='${ctx}allowedEmail'">Indietro</button>
                            <br><br>
                            <button class="button-customized"><a href="${ctx}user">Indietro</a> </button><br>
                            <label for="allowedEmail-id"> Id </label>
                            <input type="text" class="form-control no-click" value="${allowedEmail.idAllowedEmail}" name="allowedEmail-id" id="allowedEmail-id">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>



