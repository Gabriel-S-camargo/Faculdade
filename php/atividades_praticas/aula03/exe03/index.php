<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula02</title>
</head>

<body>

    <form action="index.php" method="post" >
        <label>informe num: </label>
        <input type="text" name="num01"><br><br>
        <input type="submit" name="enviar"><br>
        <br>
    </form>

    <?php
    if(isset($_POST['num01'])) {

        
        $num01 = $_POST['num01'];

        if($num01 %2 == 0) {
            echo'este num é par!';
        } 
        else{
            echo 'Este numero é impar!';
        }
    }else {
        echo "<br>Informe valor para o num";
    }
    ?>

</body>
</html>
