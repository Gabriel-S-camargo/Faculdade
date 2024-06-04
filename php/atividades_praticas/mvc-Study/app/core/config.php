<?php

// Assim voce pode definir o seu root a partir o seu tipo de conexão

if($_SERVER['SERVER_NAME'] == 'localhost'){

    // Config do Banco de dados
    define('DBNAME', 'my_database');
    define('DBHOST', 'localhost');
    define('DBUSER', 'root');
    define('DBPASS', '1234');
    define('DBDRIVER', '');

    // Versao LocalHost
    define('ROOT', 'http://localhost/php/mvc-Study/public');
}else{

    // Config do BD

    define('DBNAME', 'my_database');
    define('DBHOST', 'localhost');
    define('DBUSER', 'root');
    define('DBPASS', '1234');
    define('DBDRIVER', '');


    // Versão online para poder colocar a imagem
    define('ROOT', 'https://www.yourwebsite.com');

    
}

