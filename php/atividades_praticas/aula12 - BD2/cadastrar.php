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
    <title>Aula 12 - CRUD</title>
</head>

<body>

    <header>
        <nav>
            <ul>
                <a href="listar.php">
                    <li>Listar</li>
                </a>
                <br>
                <a href="cadastrar.php">
                    <li>Cadastrar</li>
                </a>
                <br>
                <a href="excluir.php">
                    <li>Excluir</li>
                </a>
                <br>
                <a href="editar.php">
                    <li>Editar</li>
                </a>
            </ul>
        </nav>
    </header>

    <h1>Cadastrar</h1>

    <?php

    $dados = filter_input_array(INPUT_POST, FILTER_DEFAULT);

    if (!empty($dados['cadastrarUsuario'])) {

        $empty_input = false;
        $dados = array_map('trim', $dados);

        if (in_array("", $dados)) {
            $empty_input = true;

            echo "<p style='color:red'>Existem campos em brancos</p>";
        } elseif (!filter_var($dados['email'], FILTER_VALIDATE_EMAIL)) {

            $empty_input = true;
            echo "<p style='color:red'>Email informado Inválido</p>";
        } else if ($empty_input == false) {

            $queryUserInsert = "INSERT INTO teste.usuario (nomeUsuario, sobrenomeUsuario, email) VALUES 
                ('" . $dados['nome'] . "', '" . $dados['sobrenome'] . "', '" . $dados['email'] . "')";

            $cadastrarUsuario = $pdo->prepare($queryUserInsert);

            $cadastrarUsuario->execute();

            if ($cadastrarUsuario->rowCount()) {
                echo "<p style='color:green'>Usuario Cadastrado com sucesso</p>";
                unset($dados);
            }
        } else {
            echo "<p style='color:red'>Erro Usurio não cadastado</p>";
        }
    }

    ?>

    <form action="cadastrar.php" method="POST" name="cadastrarUsuario">
        <label>Nome:</label>
        <input type="text" name="nome" id="nome" placeholder="Digite seu nome"> <br><br>

        <label>Sobrenome:</label>
        <input type="text" name="sobrenome" id="sobrenome" placeholder="Digite seu sobrenome"> <br><br>

        <label>Email:</label>
        <input type="text" name="email" id="email" placeholder="Digite seu email"> <br><br>

        <input type="submit" name="cadastrarUsuario">

    </form>

</body>

</html>