<%@include file="cabecalho.jsp" %>
<h2><label for="cadastroUsuario">Cadastro Usuários</label></h2>
<hr>
<form action="UsuariosControl" method="post">
    
    <label for="cpf">CPF:</label>
    <input type="text" id="cpf" name="cpf" placeholder="Digite o CPF">
    
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" placeholder="Digite o Nome">
    
    <label for="fone">Telefone:</label>
    <input type="text" id="fone" name="fone" placeholder="Digite o Telefone">
    
    <label for="email">E-mail:</label>
    <input type="text" id="email" name="email" placeholder="Digite o E-mail">
    
    <input type="submit" value="Enviar">
    <input type="reset" value="Limpar">

</form>
<%@include file="rodape.jsp" %>