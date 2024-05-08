<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>medias</title>
</head>
<body>

    <h1>Medias</h1>
    
</body>
</html>

    <?php

    function calculaMedia($name, $grade1, $grade2, $grade3, $grade4)
    {
        $average = ($grade1 + $grade2 + $grade3 + $grade4) / 4;
        if ($average >= 6) {
            $status = "Aprovado :)";
        } elseif ($average >= 4) {
            $status = "Recuperação :|";
        } else {
            $status = "Reprovado :(";
        }
        echo "<p>Estudante: {$name}<br>Media: {$average}<br>Situação: {$status}</p>";
    }

    calculaMedia("Pedro", 8, 7, 6, 7);
    calculaMedia("Henrique", 5, 5, 4, 5);
    calculaMedia("Gabriel", 9, 8, 8, 8);

    ?>
</body>

</html>