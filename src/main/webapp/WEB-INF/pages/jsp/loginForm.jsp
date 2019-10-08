<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Login Votazioni</title>
    </head>
    <body>
        <div id="container">
            <form>
                <div class="form-group row">
                    <label for="emailAllowed" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="emailAllowed" placeholder = "..." />
                    </div>
                </div>
                <div class="form-group row">
                    <label for="passwordAutorizedSection" class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="passwordAutorizedSection" placeholder = "..." />
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Verifica Accesso</button>
                        <button type="reset" class="btn btn-danger">Cancella dati</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>