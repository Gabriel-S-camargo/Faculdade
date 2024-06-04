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

    <h1>Listar</h1>

    <?php
    $queryUser = "SELECT nomeUsuario, sobrenomeUsuario, email FROM teste.usuario";
    $result = $pdo->prepare($queryUser);
    $result->execute();

    if ($result->rowCount() != 0) {
    ?>

        <table>
            <thead>
                <tr>Nome Usuario</tr>
                <tr>SobreNome</tr>
                <tr>Email</tr>
            </thead>
            <tbody>
                <?php
                while ($rowTable = $result->fetch(PDO::FETCH_ASSOC)) {
                ?>
                    <tr>
                        <td align="left"><?php echo $rowTable['nomeUsuario'] ?></td> 
                        <td align="left"><?php echo $rowTable['sobrenomeUsuario'] ?></td>
                        <td align="left"><?php echo $rowTable['email'] ?></td>
                    </tr>
                <?php } ?>
            </tbody>
        </table>
    <?php 
    } 
    
    else{
        echo "<p style='color:red'>Nenhum Registro Encontrado</p>";
    }
    
    ?>


</body>

</html>