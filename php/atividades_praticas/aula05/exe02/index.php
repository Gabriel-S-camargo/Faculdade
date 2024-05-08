<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<h1>Testador de valores negativos</h1>
    
</body>
</html>

<?php
function testaValorNegativo($a, $b) {
    $soma = $a + $b;
    if ($soma >= 0) {
        echo"<br>O resultado eh: " . $soma;

    } else {
        echo "<br>O resultado eh: 0";
    }

    
}

testaValorNegativo(-5, 3);

testaValorNegativo(10, 3);


?>