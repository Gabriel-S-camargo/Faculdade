<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula02</title>
</head>
<body>

    <form action="index.php" method="post" >
        <label>inform Radius: </label>
        <input type="text" name="radius"><br>
        <input type="submit" name="calculate">
        <br>
    </form>


</body>
</html>

<?php

    $_radius = $_POST["radius"];
    $_area = null;
    $_circunference = null;

    $_area = pi() * pow($_radius, 2);
    $_area = round($_area, 2);

    $_circunference = 2 * pi() * $_radius;
    $_circunference = round($_circunference, 2);

    $_volume = 4/3 * pi() * pow($_radius,3);
    $_volume = round($_volume,2);

    echo"Area = {$_area}cm^2 <br>";
    echo "Circunference = {$_circunference}cm <br>";
    echo "Volume = {$_volume}cm^3 <br>";
?>