<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>exe03</title>
</head>
<body>
    <form action="index.php" method="post">

        <label>informe num 1: </label>
        <input type="text" name="num1">
        <br>

        <br>
        <label>informe num 2: </label>
        <input type="text" name="num2">
        <br>

        <br>
        <input type="submit" name="calcular">
        <br>


    </form>
    
</body>
</html>


<?php 

    if(isset($_POST['num1']) && isset($_POST['num2'])) {

        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
       
        $num1 = (float) $num1;
        $num2 = (float) $num2;

        $soma = $num1 + $num2;
        $subtracao = $num1 - $num2;
        $multi = $num1 * $num2;

        if($num2 != 0){
            $div = $num1 / $num2;
            $resto = $num1 % $num2;
        } else {
            $div = "erro!, divisão por 0";
            $resto = "Erro! divisão por 0";
        }

        $abs = abs($num1 - $num2);
        $expo = $num1 ** $num2;
        $raiz = round(sqrt($num1 + $num2), 2);
        $media = ($num1 + $num2) / 2;


        echo "Soma: $soma <br>";
        echo "Subtração: $subtracao <br>";
        echo "Multiplicação: $multi <br>";
        echo "Divisão: $div <br>";
        echo "Resto: $resto <br>";
        echo "Absoluto: $abs <br>";
        echo "Exponenciação: $expo <br>";
        echo "Raiz: $raiz <br>";
        echo "Média: $media <br>";

    } else {
        echo "<br>Informe Valor para num1 e num2";
    }
?>
