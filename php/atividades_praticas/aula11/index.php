   <?php

    try {
        $pdo = new PDO('mysql:host=localhost;dbaname=teste', 'root', '1234');
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    } catch (PDOException $erro) {
        echo "ERRO => " . $erro->getMessage();
    }

    ?>
   <!DOCTYPE html>
   <html lang="en">

   <head>
       <meta charset="UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <title>Document</title>
   </head>

   <body>
       <h1>Cadastrar User</h1>

       <?php

        $dados = filter_input_array(INPUT_GET, FILTER_DEFAULT);

        if (!empty($dados['cadastrarUsuario'])) {
            $queryUser = "INSERT INTO teste.tab_usuario (nameUser, estadoCivil, cpf, profissao) VALUES ('" . $dados['nome'] . "', '" . $dados['estadoCivil'] . "', '" . $dados['cpf'] . "', '" . $dados['profissao'] . "')";

            $cadastrarUsuario = $pdo->prepare($queryUser);

            $cadastrarUsuario->execute();

            // rowCount -> Retorna o numero de linhas afetadas pelo comando sql
            if($cadastrarUsuario->rowCount()){
                echo"<p style='green';> Usuário Cadastrado Com sucesso</p>";
            }else{
                echo "<p style='red';>Erro! Usuário não cadastrado</p>";
            }

        } else {
            echo "Preencha valores nos campos";
        }

        ?>

       <form name="cadastrarUsuario" action="index.php" method="GET">

           <label>Nome:</label>
           <input type="text" name="nome" id="nome" placeholder="Nome Completo">
           <br><br>

           <label>Estado Civil:</label>
           <select name="estadoCivil" id="estadoCivil">
               <option>Escolha uma opcao</option>
               <option value="Casado">Casado</option>
               <option value="Solteiro">Solteiro</option>
               <option value="naoInformado">Prefiro Nao informar(tu é baitola)</option>
           </select>
           <br><br>

           <label>CPF:</label>
           <input type="text" name="cpf" id="cpf" placeholder="Informe cpf">
           <br><br>

           <label>Profissao:</label>
           <input type="text" name="profissao" id="profissao" placeholder="Informe profissao">
           <br><br>

           <input type="submit" name="cadastrarUsuario" value="cadastrar">


       </form>

   </body>

   </html>