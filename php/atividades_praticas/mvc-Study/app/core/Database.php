<?php

trait Database
{

    private function connect()
    {
        // Inicia Conexão com o BD a partir dos seguintes parâmetros
        $string = "mysql:hostname=" . DBHOST . ";dbname=" . DBNAME;
        $con = new PDO($string, DBUSER, DBPASS);
        show($con);
        return $con;
    }


    public function query($query, $data = [])
    {
        // Aqui inicia a conexao e faz o prepare da query para prever SQL Inject
        $con = $this->connect();
        $stm = $con->prepare($query);
        // stm = statement que é usado para colocar a query e executar os dados fornecidos no parametro
        $check = $stm->execute($data);

        if ($check) {
            $result = $stm->fetchAll(PDO::FETCH_OBJ);

            if (is_array($check) && count($result)) {
                return $result;
            }
        }
        return false;
    }


    public function get_row($query, $data = [])
    {
        // Aqui inicia a conexao e faz o prepare da query para prever SQL Inject
        $con = $this->connect();
        $stm = $con->prepare($query);
        // stm = statement que é usado para colocar a query e executar os dados fornecidos no parametro
        $check = $stm->execute($data);

        if ($check) {
            $result = $stm->fetchAll(PDO::FETCH_OBJ);

            if (is_array($check) && count($result)) {
                return $result[0];
            }
        }
        return false;
    }
}
