<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula02</title>
</head>

<body>

    <form action="index.php" method="post">
        <label>informe lado 1: </label>
        <input type="text" name="lado1"><br><br>

        <label>informe lado 2: </label>
        <input type="text" name="lado2"><br><br>

        <label>informe lado 3: </label>
        <input type="text" name="lado3"><br><br>

        <input type="submit" name="calcular">
        <br>
    </form>

    <?php
    if (isset($_POST['lado1']) && isset($_POST['lado2']) && isset($_POST['lado3'])) {

        $lado1 = $_POST['lado1'];
        $lado2 = $_POST['lado2'];
        $lado3 = $_POST['lado3'];

        $soma1_2 = $lado1 + $lado2;

        $soma1_3 = $lado1 + $lado3;

        $soma2_3 = $lado2 + $lado3;

        if ($soma1_2 < $lado3 || $soma2_3 < $lado1 || $soma1_3 < $lado2) {
            echo 'As medidas informadas não formam um triangulo <br>';

        }
        else if($lado1 == $lado2 && $lado1 == $lado3 && $lado2 == $lado3) {
            echo 'É um triangulo equilátero <br>';
        }
        else if($lado1 != $lado2 && $lado1 != $lado3 && $lado2 != $lado3){
            echo 'Isto é um triangulo escaleno! <br>';
            
        }else{
            echo 'Isto é um triangulo isoscéles! <br>';
        }
    } 
    else{
        echo "<br>Informe valor para os lado do trinagulo";
    }
    ?>

</body>

</html>