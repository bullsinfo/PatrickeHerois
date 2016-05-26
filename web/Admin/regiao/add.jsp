<%@include file="../cabecalho.jsp"%>
        <div>
            <h1 class="centro">Cadastro de Região</h1>
            
            <div>
                
                <form action="add-ok.jsp" method="post">
                    <label>Nome:</label><input type="text" name="txtNome" readonly/><br />
                    <label>Codigo:</label><input type="text" name="txtCodigo"/><br />
                    <label>Descrição:</label><input type="textDescricao"/><br />
                    <input type="reset" value="Limpar" />
                    <input type="submit" value="Salvar" />
                </form>
            </div>
        </div>



    </body>
</html>
