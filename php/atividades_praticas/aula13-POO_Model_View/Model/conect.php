<?php 
    class Conexao{
        public static function conectar(){
            try {
                $conn = new PDO('mysql:host=localhost;dbaname=teste', 'root', '1234');
                $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                echo"Conexão Realizada com sucesso";
                return $conn;
            } catch (PDOException $erro) {
                echo "ERRO => " . $erro->getMessage();
                return null;
            }
        }
    }