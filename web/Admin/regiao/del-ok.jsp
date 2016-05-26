<%
    if (request.getParameter("txtNome") == null){
        response.sendRedirect("index.jsp");
        return;
    }
    if (request.getParameter("txtNome").isEmpty()){
        response.sendRedirect("index.jsp");
        return;
    }
%>
<%@include file="../cabecalho.jsp"%>

         <h1 class="centro">Exclusão de Região</h1>
            
         <div>
             Registro excluído com sucesso.<br />
             
             <a href="index.jsp">Voltar para Listagem</a>
         </div>
    </body>
</html>

