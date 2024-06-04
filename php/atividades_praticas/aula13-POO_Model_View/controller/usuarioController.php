<?php

require_once('../Model/usuario.php');

class UsuarioController{
    
    public function processaUser($acao){
        if($acao == "C"){
            $novoUsuario = new Usuario();

            $novoUsuario->setNomeUsuario($_POST['nome']);
            $novoUsuario->setEstadoCivil($_POST['estadoCivil']);
            $novoUsuario->setDataNascimento($_POST['dataNascimento']);
            $novoUsuario->setEstadoNascimento($_POST['estadoNascimento']);
            $novoUsuario->setCpf($_POST['cpf']);
            $novoUsuario->setProfissao($_POST['profissao']);
            // Chama a funcao para cadastrar o usuario
            $novoUsuario->cadastrarUsuario();

            echo $novoUsuario->getNomeUsuario();


        }
    }
    

}