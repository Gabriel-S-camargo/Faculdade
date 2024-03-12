<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula02</title>
</head>

<body>

    <form action="index.php" method="post" >
        <label>informe raio: </label>
        <input type="text" name="raio"><br>
        <input type="submit" name="calculate">
        <br>
    </form>

    <?php
    if(isset($_POST['raio'])) {
        $_radius = $_POST['raio'];

        $_radius = (float) $_radius;

        $_area = null;
        $_circunference = null;

        $_radius = (float) $_radius;
        $_area = (float) $_area;
        $_circunference = (float) $_circunference;

        $_area = pi() * pow($_radius, 2);
        $_area = round($_area, 2);

        $_circunference = 2 * pi() * $_radius;
        $_circunference = round($_circunference, 2);

        echo "Area = {$_area}cm^2 <br>";
        echo "Circunferencia = {$_circunference}cm <br>";
    } else {
        echo "<br>Informe valor para o raio";
    }
    ?>

</body>
</html>
