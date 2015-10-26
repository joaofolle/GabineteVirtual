<%@include file="cabecalho.jsp" %>

<form name="abrirChamado" id="abrirChamado" method="post" action="">
    <label for="nomeSolicitante">Nome</label>
    <input type="text" name="nome" id="nome" placeholder="Informe seu nome" >
    
    <label for="selPerfilSolicitante">Selecione seu perfil</label>
    <select name="selPerfilSolicitante" id="selPerfilSolicitante">
        <option value="aluno">Aluno</option>
        <option value="comunidadeExterna">Comunidade Externa</option>
        <option value="pais">Pais</option>
        <option value="servidor">Servidor</option>
    </select>
    
    <label for="email">E-mail</label>
    <input type="text" name="email" id="email" placeholder="Informe seu e-mail" >    
    
    <label for="telefone">Telefone</label>
    <input type="text" name="telefone" id="telefone" placeholder="Informe seu telefone">        
    
    <label for="descricao">Descrição da Solicitação</label>
    <textarea name="descricao" id="descricao" rows="5" cols="30" ></textarea>
    
    <label for="anexos">Documentos em anexo</label>
    <input type="file" name="anexos" id="anexos" placeholder="Documentos em anexo">
    
    <input type="submit" onclick="validarFormulario('abrirChamado');">
    <input type="reset" value="Limpar">
</form>

<%@include file="rodape.jsp" %>