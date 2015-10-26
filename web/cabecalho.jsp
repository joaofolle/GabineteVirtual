<%-- 
    Document   : cabecalho
    Created on : 19/10/2015, 19:52:21
    Author     : DTI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">		
	<link rel="stylesheet" href="css/style.css">
        <script type="text/javascript" src="js/recepcao.js"></script>
</head>

<body>

	<div class="container">
		<div class="menu-login">
			<ul>
				<li><a href="www.google.com">Meus Dados</a></li>
				<li><a href="www.google.com">Sair</a></li>
			</ul>
		</div>
		<header class="header">
			<a href="index.html"><div class="banner"></div></a>

			<ul class="menu"> <!-- Esse é o 1 nivel ou o nivel principal -->
				<li><a href="#">Cadastros</a>
					<ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
						<li><a href="cadastrousuario.html">Usuário</a></li>
						<li><a href="pesquisarcadastro.html">Pesquisar</a></li>
						<li><a href="incluircadastro.html">Incluir</a></li>
					</ul>
				</li>
				<li><a href="#">Recepção</a>
					<ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
						<li><a href="#">Submenu 1</a></li>
						<li><a href="#">Submenu 2</a></li>
					</ul>
				</li>
				<li><a href="#">Emissão Documentos</a>
					<ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
						<li><a href="#">Submenu 1</a></li>
						<li><a href="#">Submenu 2</a></li>
					</ul>
				</li>
				<li><a href="#">Agendamento Eventos</a>
					<ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
						<li><a href="#">Submenu 1</a></li>
						<li><a href="#">Submenu 2</a></li>
					</ul>
				</li>
				<li><a href="#">Reserva Salas</a>
					<ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
						<li><a href="#">Submenu 1</a></li>
						<li><a href="#">Submenu 2</a></li>
					</ul>
				</li>
			</ul>
		</header>