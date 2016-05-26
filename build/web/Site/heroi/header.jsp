<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/jpg" href="../icon.png"/>
        <link rel="stylesheet" type="text/css" href="../style.css"/>
    </head>
    <body>
        <div class="banner">
            <img src="../banner.jpg" class="banner"/>
            <input type="submit" value="Pesquisar"/>
            <input type="text" placeholder=""/>
        </div>
        <div class="menu">
            <ul class="menu">
                <li id="active"><a href="index.jsp" target="_parent">HOME</a></li>
                <li><a>HERÓIS</a>
                    <ul class="submenu">
                        <li><a href="heroisdc.jsp">DC</a></li>
                        <li><a href="heroismarvel.jsp">Marvel</a></li>
                    </ul>
                </li>
                <li><a>ANTI-HERÓIS</a>
                    <ul class="submenu">
                        <li><a href="antiheroisdc.jsp">DC</a></li>
                        <li><a href="antiheroismarvel.jsp">Marvel</a></li>
                    </ul>
                </li>
                <li><a>VILÕES</a>
                    <ul class="submenu">
                        <li><a href="viloesdc.jsp">DC</a></li>
                        <li><a href="viloesmarvel.jsp">Marvel</a></li>
                    </ul>
                </li>
            </ul>
            <hr class="menu"/>
        </div>