<%@include file="../cabecalho.jsp"%>
        <div>
            <h1 class="centro">Alteração de Jogador</h1>
            
            <div>
                
                <form action="upd-ok.jsp" method="post">
                    <label>Nome:</label><input type="text" name="txtNome" readonly/><br />
                    <label>Codigo:</label><input type="text" name="txtCodigo"/><br />
                    <label>Login:</label><input type="text"/><br />
                    <label>E-mail:</label><input type="text"/><br />
                    <label>Senha:</label><input type="text"/><br />
                    <input type="reset" value="Limpar" />
                    <input type="submit" value="Salvar" />
                </form>
            </div>
        </div>



    </body>
</html>

