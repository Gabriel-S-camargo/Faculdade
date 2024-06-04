<?php

// Aqui a classe Products pega herança da Classe controller dentro da pasta core/Controller.php

class Products extends Controller{
    // Aqui é uma função base que chama a Home controller com os valores que ele irá receber um array
    public function index($a = '',$b = '', $c = '' ){

        echo "This is the Products Controller";
        // Ainda chamando o metodo herdado, mas com o nome da view num folder
        // Assim voce pode colocar as view num folder, nesse caso chamado view, deste modo podendo organizar mais 
        $this->view('products/products');
    }

}

