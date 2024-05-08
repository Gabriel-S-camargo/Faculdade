<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <form action="index.php" method="POST">

        <span>Digite seu nome: </span> <br> <br>
        <input type="text" name="nomeUser" placeholder="Digite seu nome">

        <br> <br>

        <span>Digite seu email: </span> <br> <br>
        <input type="text" name="emailUser" placeholder="Digite seu email">

        <br> <br>

        <span>Digite seu assunto: </span> <br> <br>
        <input type="text" name="assuntoUser" placeholder="Digite assunto">

        <br> <br>

        <span>Digite valor Custo: </span> <br> <br>
        <input type="text" name="valorCusto" placeholder="Digite valor Custo">

        <br> <br>

        <span>Digite valor Venda: </span> <br> <br>
        <input type="text" name="valorVenda" placeholder="Digite valor Venda">

        <br> <br>

        <span>Digite seu conteudo: </span> <br> <br>
        <input type="text" name="conteudoUser" placeholder="Digite conteudo">

        <button type="submit">submit</button>



    </form>



</body>

</html>


<?php

if (isset($_POST["nomeUser"]) && $_POST["emailUser"] && $_POST["assuntoUser"] && $_POST["valorCusto"] && $_POST["valorVenda"] && $_POST["conteudoUser"]) {

    $nomeUser = $_POST["nomeUser"];

    $emailUser = $_POST["emailUser"];

    $assuntoUser = $_POST["assuntoUser"];

    $valorCusto = $_POST["valorCusto"];

    $valorVenda = $_POST["valorVenda"];

    $conteudoUser = $_POST["conteudoUser"];
        
    if ($valorVenda < $valorCusto) {
        echo "<br>Valor de venda não pode ser menor que o valor de custo :)";
    } 

    if (strstr($emailUser, "@") == false) {
        echo "<br><br>Email inválido";
    } 
    
    
    
} else {
    echo "<br>Digite valores não nulos para os campos";
}


?>