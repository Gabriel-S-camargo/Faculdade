<!DOCTYPE html>

<?php 
    setcookie("nomeCookie", "teste02", time()+ 3600);
?>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        echo $_COOKIE['nomeCookie'];
    ?>
    
</body>
</html>