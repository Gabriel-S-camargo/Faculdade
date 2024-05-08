<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>exe01</title>
</head>

<body>

    <h1>Digite 5 números:</h2>


        <form method="post">
            <?php

            $numeros = [];
            if ($_SERVER["REQUEST_METHOD"] == "POST") {

                for ($i = 1; $i <= 5; $i++) {
                    $numero = isset($_POST["numero$i"]) ? $_POST["numero$i"] : '';
                    echo "<input type='number' name='numero$i' value='$numero' placeholder='Número $i'><br>";


                    if ($numero !== '') {
                        $numeros[] = $numero;
                    }
                }


                if (count($numeros) == 5) {

                    $maior = $numeros[0];
                    for ($i = 1; $i < count($numeros); $i++) {
                        if ($numeros[$i] > $maior) {
                            $maior = $numeros[$i];
                        }
                    }


                    echo "<h3>O maior número digitado é: $maior</h3>";
                }
            }else{

                for ($i = 1; $i <= 5; $i++) {
                    echo "<input type='number' name='numero$i' placeholder='Número $i'><br>";
                }
            }
            ?>
            <br>
            <input type="submit" name="submit" value="Enviar">
        </form>

</body>

</html>