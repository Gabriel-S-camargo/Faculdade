<?php

// Aqui a classe home pega herança da Classe controller dentro da pasta core/Controller.php

class Home extends Controller{
    // Aqui é uma função base que chama a Home controller com os valores que ele irá receber um array
    public function index($a = '',$b = '', $c = '' ){

        $model = new Model;
        $arr['id'] = 1;
        $result = $model->where($arr);

        echo $result;
        
        echo "This is the home Controller";
        // Aqui chama o metodo herdado do core para poder carregar a view desejada
        $this->view('home');
    }

}

