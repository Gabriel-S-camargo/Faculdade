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

    <h1>Excluir</h1>

    <?php
    $queryUser = "SELECT nomeUsuario, sobrenomeUsuario, email FROM teste.usuario";
    $result = $pdo->prepare($queryUser);
    $result->execute();

    if(!empty($_REQUEST['idUsuario'])){
        $id = $_REQUEST['idUsuario'];
        $queryUserConsultarDelete = "SELECT * FROM teste.usuario WHERE idUsuario = $idUsuario";
        $resultConsultarDelete = $pdo->prepare($queryUserConsultarDelete);
        $resultConsultarDelete->execute();

        if($resultConsultarDelete->rowCount() >0){
            $sqlDelete = "DELETE FROM teste.usuario WHERE idUsuario = $idUsuario";
            $resultDelete = $pdo->prepare($sqlDelete);
            $resultDelete->execute();
            header("Refresh:1");
        }


    }

    if ($result->rowCount() != 0) {
        ?>
    
            <table>
                <thead>
                    <tr>Nome Usuario</tr>
                    <tr>SobreNome</tr>
                    <tr>Email</tr>
                    <tr>Excluir</tr>
                </thead>
                <tbody>
                    <?php
                    while ($rowTable = $result->fetch(PDO::FETCH_ASSOC)) {
                    ?>
                        <tr>
                            <td align="left"><?php echo $rowTable['nomeUsuario'] ?></td> 
                            <td align="left"><?php echo $rowTable['sobrenomeUsuario'] ?></td>
                            <td align="left"><?php echo $rowTable['email'] ?></td>
                            <td align="left">
                            <a href="excluir.php?id=<?php echo $rowTable['idUsuario']?>"> excluir</a>
                            </td>
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