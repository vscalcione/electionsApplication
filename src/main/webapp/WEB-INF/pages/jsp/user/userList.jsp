<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/pages/jsp/common/common.jsp" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="author" content="Scalcione Vincenzo">
        <meta name="description" content="page for Lista utenti">
        <title>Lista utenti</title>
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
        <div class="limiter">
            <div class="container-login100">
                <div class="cointer">
                    <table class="table table-dark">
                        <tr class="bg-primary">
                            <th>Id</th>
                            <th>Email</th>
                            <th>CodeLogin</th>
                            <th>Sent Code Login</th>
                            <th>Login Done </th>
                            <th>Sent Data Form </th>
                            <th>Actions</th>
                        </tr>
                        <c:forEach items="${userList}" var="user">
                            <tr>
                                <td>${user.id}</td>
                                <td>
                                    <a href="${ctx}user/${user.email}"> ${user.email} </a>
                                </td>
                                <td>${user.codeLogin}</td>
                                <td>${user.sentCodeLogin}</td>
                                <td>${user.loginDone}</td>
                                <td>${user.sentDataForm}</td>
                                <td class="hidden">
                                    <a href="${ctx}user/${user.email}/edit">Modifica</a> |
                                    <a href="${ctx}dipendente/${dipendente.idMatricola}/delete" onclick="return confirm('Vuoi eliminare?');">Elimina</a> |
                                    <a href="${ctx}dipendente/${dipendente.idMatricola}/assegnaAttivita">Assegna attivit&agrave;</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>



