<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Votazioni</title>
    </head>
    <body>
        <div id="container">
            <form id="vote-form">
                <div class="form-group row">

                    <!-- Voto 1 -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="vote1" id="vote1" value="value1">
                        <labewl class="form-check-label" for="vote1">Voto 1</labewl>
                    </div>

                    <!-- Voto 2 -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="vote2" id="vote2" value="value12">
                        <labewl class="form-check-label" for="vote2">Voto 2</labewl>
                    </div>

                    <!-- Voto 3 -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="vote3" id="vote3" value="value3">
                        <labewl class="form-check-label" for="vote3">Voto 3</labewl>
                    </div>

                    <!-- Voto Nullo -->
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="votenull" id="votenull" value="value1">
                        <labewl class="form-check-label" for="votenull">Nesusno dei 3</labewl>
                    </div>

                    <!-- Invia dati e reset button -->
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Invia dati e termina votazione</button>
                        <button type="reset" class="btn btn-danger">Cancella dati</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>


