<?php

$url = strtoupper($_GET['url']);

if($url == "CADASTRO"){
    require_once("view/cadastrar.php");
}else if($url=="cadastrarUsuario"){
    require_once("controller/usuarioController.php");
    $controle = new UsuarioController();
    $controle->processaUser("C");

    
}