<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina de cadastro</title>
</head>
<body>

    <h1>Usuarios cadastrados</h1>
    
</body>
</html>

<?php 

    if(isset($_POST["userNome"]) && $_POST["userSobrenome"]){

        $nome = $_POST['userNome'];
    
        $sobrenome = $_POST['userSobrenome'];
    
        echo"Usuário cadastrado com sucesso!!<br>";

        echo"{$nome} {$sobrenome}";

    }else{
        echo"Digite seus dados";
    }


?>