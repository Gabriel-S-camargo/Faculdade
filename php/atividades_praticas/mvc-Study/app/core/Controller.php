<?php 

class Controller{

   // Função para verificar se a viu desse controller existe, caso não da o 404  
    public function view($name){
        $fileName = "../app/views/".$name.".view.php";
        
        if(file_exists($fileName)){
            require $fileName;
        }else{
            $fileName = "../app/views/404.view.php";
            require $fileName;
        }
    }


}