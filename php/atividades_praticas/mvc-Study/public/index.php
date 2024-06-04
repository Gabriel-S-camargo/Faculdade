<?php
// isso cria uma sessão no projeto
session_start();

// Assim vai puxar a pagina init e precarregar tudo quando a sessão do site iniciar 
require "../app/core/init.php";

// Starta uma classe do App para podermos usar os métodos
$app = new App;
// chama o controller a partir da URL chamada no Site 
$app->loadController();