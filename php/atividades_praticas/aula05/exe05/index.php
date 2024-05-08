<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calcula fatorial</title>
</head>
<body>

    <h1>Calcula Fatorial</h1>
    
</body>
</html>


<?php

function calcularFatorial($number) {
    if ($number < 0) {
        return "<br>Error! Não existe fatorial de numeros negativos.";
    }

    if ($number == 0 || $number == 1) {
        return 1;
    }

    $result = 1;
    for ($i = 2; $i <= $number; $i++) {
        $result *= $i;
    }

    return "<br>!{$number} = {$result}";
}

$number = 5;
$result = calcularFatorial($number);
echo $result; 

$number = -3;
$result = calcularFatorial($number);
echo $result; 

?>