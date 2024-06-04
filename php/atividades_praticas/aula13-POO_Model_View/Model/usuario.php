<?php

include_once('Model/conect.php');

class Usuario{
    private $idUsuario;
    private $nomeUsuario;
    private $estadoCivil;
    private $dataNascimento;
    private $estadoNascimento;
    private $cpf;
    private $profissao;

    public function cadastrarUsuario(){

        try{

            $conn = Conexao::conectar();
            $sql = $conn->prepare("INSERT INTO teste.usuariomvc (nomeUsuario ,estadoCivil, dataNascimento, estadoNascimento, cpf, profissao)values (:nomeUsuario , :estadoCivil, :dataNascimento, :estadoNascimento, :cpf, :profissao)");

            $nomeUsuario = $this->nomeUsuario;
            $estadoCivil = $this->estadoCivil;
            $dataNascimento = $this->dataNascimento;
            $estadoNascimento = $this->estadoNascimento;
            $cpf = $this->cpf;
            $profissao = $this->profissao;
            
            $sql->bindParam("nomeUsuario", $nomeUsuario);
            $sql->bindParam("estadoCivil", $estadoCivil);
            $sql->bindParam("dataNascimento", $dataNascimento);
            $sql->bindParam("estadoNascimento", $estadoNascimento);
            $sql->bindParam("cpf", $cpf);
            $sql->bindParam("profissao", $profissao);


            $sql->execute();


        }catch(PDOException $erro){
            echo "Cadastro falhou". $erro->getMessage();
        }


    }


    public function getIdUsuario(){
        return $this->idUsuario;
    }

    public function setIdUsuario($idUsuario){
        $this->idUsuario = $idUsuario;
    }

    public function getNomeUsuario(){
        return $this->nomeUsuario;
    }

    public function setNomeUsuario($nomeUsuario){
        $this->nomeUsuario = $nomeUsuario;
    }

    public function getEstadoCivil(){
        return $this->estadoCivil;
    }

    public function setEstadoCivil($estadoCivil){
        $this->estadoCivil = $estadoCivil;
    }

    public function getDataNascimento(){
        return $this->dataNascimento;
    }

    public function setDataNascimento($dataNascimento){
        $this->dataNascimento = $dataNascimento;
    }

    public function getEstadoNascimento(){
        return $this->estadoNascimento;
    }

    public function setEstadoNascimento($estadoNascimento){
        return $this->estadoNascimento = $estadoNascimento;
    }

    public function getCpf(){
        return $this->cpf;
    }

    public function setCpf($cpf){
        $this->cpf = $cpf;
    }

    public function getProfissao(){
        return $this->profissao;
    }

    public function setProfissao($profissao){
        $this->profissao = $profissao;
    }

}