<?php 
    session_start();

    // configurando o fuso horario padrão utilizado pro todas as funçoes de data e hora
    date_default_timezone_set('America/Sao_Paulo');

    echo 'Agora estamos na página 02 <br><br>';
    echo "Hoje é dia {$_SESSION['data']}, são " . date('H:i:s', $_SESSION['hora']) . "horas. Estamos na aula de " . $_SESSION['aula'] . "<br>";

