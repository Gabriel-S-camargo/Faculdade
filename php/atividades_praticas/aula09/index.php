    <?php

    session_start();

    $_SESSION['usuario'] = "Professor";
    echo "Essa página foi visualizada pelo {$_SESSION['usuario']}";


    ?>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Aula09</title>
    </head>

    <body>
        <?php
        $_SESSION['aula'] = "Linguagem php";
        $_SESSION['data'] = date('d/m/Y');
        $_SESSION['hora'] = time();

        echo '<br> <a href ="apresentacaoDeDados.php">Clique aqui para ir para a página 2</a>';
        ?>
    </body>

    </html>