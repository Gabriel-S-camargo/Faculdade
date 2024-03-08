<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula02</title>
</head>
<body>

    <form action="index.php" method="get" >
        <label>quantity</label>
        <input type="text" name="quantity"><br>
        <input type="submit" name="submit">
    </form>


</body>
</html>

<?php

    $item = "pizza";
    $price = "5.99";
    $quantity = $_GET["quantity"];
    $total = null;

    $total = $quantity * $price;

    echo "you have ordered {$quantity} x {$item}/s <br>";
    echo "your total is: \${$total}";


?>