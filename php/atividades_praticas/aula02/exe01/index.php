<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Atividade_prática_aula_02</title>
</head>
<body>

</body>
</html>

<?php

$a = 2;
$b = 4;
$c = 6;
$m = (($c + $b) / 2) ** (--$c);
$t = --$c ** ($b + $a);
$x = --$c + $b;
$y = $b++ + $a;
$z = $a - $b--;

echo "<br>Valores antes da conversão: <br>";
echo "\$a = $a <br>";
echo "\$b = $b <br>";
echo "\$c = $c <br>";
echo "\$m = $m <br>";
echo "\$t = $t <br>";
echo "\$x = $x <br>";
echo "\$y = $y <br>";
echo "\$z = $z <br>";

$a = (double) $a;
$b = (double) $b;
$c = (string) $c;

echo "<br> Valores depois da conversão: <br>";
echo "\$a = $a <br>";
echo "\$b = $b <br>";
echo "\$c = $c <br>";
echo "\$m = $m <br>";
echo "\$t = $t <br>";
echo "\$x = $x <br>";
echo "\$y = $y <br>";
echo "\$z = $z <br>";




?>