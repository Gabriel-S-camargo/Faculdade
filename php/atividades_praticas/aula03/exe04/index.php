<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>exe04</title>
</head>

<body>

    <form action="index.php" method="post" >
        <label>informe seu ano de nascimento: </label>
        <input type="text" name="user_idade"><br><br>
        <input type="submit" name="enviar"><br>
        <br>
    </form>

    <?php
    if(isset($_POST['user_idade'])) {

        $ano_nascimento = $_POST['user_idade'];

        $ano_atual = 2024;

        $idade = $ano_atual - $ano_nascimento;

        if( $idade >= 16) {
            echo'pode votar este ano!';
        }
        else{
            echo 'Não pode votar esse ano';
        }

        
    }
    else {
        echo "<br>Informe valor para o seu ano de nascimento";
    }
    ?>

</body>
</html>
