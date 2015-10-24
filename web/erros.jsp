<%@include file="cabecalho.jsp" %>

<h2>Erro no Processamento</h2>
<hr>
Erro:<%= request.getAttribute("msg")%>
        

<%@include file="rodape.jsp" %>