<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>exe05</title>
</head>
<body>
    <form action="index.php" method="post">

        <label>informe valor para A: </label>
        <input type="text" name="valorA">
        <br>

        <br>
        <label>informe valor para B:</label>
        <input type="text" name="valorB">
        <br>

        <br>
        <label>informe valor para C:</label>
        <input type="text" name="valorC">
        <br>

        <br>
        <input type="submit" name="calcular">
        <br>
    </form>

</body>
</html>

<?php 
    if(isset($_POST['valorA']) && isset($_POST['valorB']) && isset($_POST['valorC'])) {
        
        $valorA = $_POST['valorA'];
        $valorB = $_POST['valorB'];
        $valorC = $_POST['valorC'];

        $valorA = (float) $valorA;
        $valorB = (float) $valorB;        
        $valorC = (float) $valorC;

        $R = pow(($valorA +$valorB), 2);

        $S = pow(($valorB + $valorC), 2);

        $D = ($R + $S) / 2;

        echo "<br>Valor R: $R";

        echo "<br>Valor S: $S";

        echo "<br>Valor D: $D";


    }else{
        echo'<br>Informe Valores para A, B e C';
    }

?>