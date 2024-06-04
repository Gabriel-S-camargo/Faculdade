<?php

// Cria uma classe APP para colocar as funções de management do app de maneira encapsulada e organizada
class App{

    private $controller = 'Home';
    private $method = 'index';

    // ?? -> Se o operrador da direita for null or undefined ele atribui a varialvel $URL = 'home'
    private function splitUrl(){
        
        $URL = $_GET['url'] ?? 'home';
        // Explode -> Retira as barras ('/'), e separa dos itens do array url
        $URL = explode("/", $URL);
        return $URL;    
    }
    
    public function loadController(){
        // no php ao inves de ponto usa a flecha
        $URL = $this->splitUrl();
        
        // ucfirst() - > transforma a primeira letra da string em Maiscula
        $fileName = "../app/controllers/".ucfirst($URL[0]).".php";
        
        if(file_exists($fileName)){
            require $fileName;
            $this->controller = ucfirst($URL[0]);


        }else{
            $fileName = "../app/controllers/_404.php";
            require $fileName;

            $this->controller = "_404";
        }

        $controller = new $this->controller;
        call_user_func([$controller, $this->method], []);
        
    }
}


