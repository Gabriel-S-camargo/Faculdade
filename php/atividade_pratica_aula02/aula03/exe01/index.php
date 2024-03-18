<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula02</title>
</head>

<body>

    <form action="index.php" method="post" >
        <label>informe nota 01: </label>
        <input type="text" name="nota01"><br>

        <label>informe nota 02: </label>
        <input type="text" name="nota02"><br>


        <input type="submit" name="enviar">
        <br>
    </form>

    <?php
    if(isset($_POST['nota01']) && isset($_POST['nota02'])) {
        
        $nota1 = $_POST['nota01'];

        $nota2 = $_POST['nota02'];
        
        $media = ($nota1 + $nota2) / 2;

        if($media < 4){
            echo'Aluno reprovado :( <br>';
        }
        else if($media >= 4 && $media <6){
            echo'Aluno aguardando substitutiva :| <br>';
        }
        else if($media >= 6 && $media < 9.9){
            echo 'Aluno aprovado :)<br>';
        }
        else if($media == 10){
            echo 'Aluno aprovado sem dificuldade :) <br>';
        }
        else{
            echo 'informe valores válidos para media<br>';
        }

        echo gettype($media);
        


    } else {
        echo'informe Valor para as notas';
    }
    ?>

</body>
</html>
