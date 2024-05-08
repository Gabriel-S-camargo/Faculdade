<?php

$carros = array(
    array("nome" => "Mustang", "fabricante" => "Ford", "cor" => "Vermelho", "ano" => 2022),
    array("nome" => "Argo", "fabricante" => "Fiat", "cor" => "Branco", "ano" => 2023),
    array("nome" => "Onix", "fabricante" => "GM", "cor" => "Prata", "ano" => 2024),
    array("nome" => "Corolla", "fabricante" => "Toyota", "cor" => "Preto", "ano" => 2020),
    array("nome" => "Versa", "fabricante" => "Nissan", "cor" => "Cinza", "ano" => 2018),
    array("nome" => "HB20", "fabricante" => "Hyundai", "cor" => "Marrom", "ano" => 2023),
    array("nome" => "Prius", "fabricante" => "Toyota", "cor" => "Prata", "ano" => 2024),
    array("nome" => "Endeavor", "fabricante" => "Mitsubishi", "cor" => "Azul", "ano" => 2019),
    array("nome" => "Lamborghini Revuelto", "fabricante" => "Lamborghini", "cor" => "Amarelo", "ano" => 2024),
    array("nome" => "Impreza", "fabricante" => "Subaru", "cor" => "Azul", "ano" => 2019)
);


echo "<h2>Todos os registros:</h2>";
foreach ($carros as $carroTodos) {
    echo "Nome: " . $carroTodos['nome'] . ", Fabricante: " . $carroTodos['fabricante'] . ", Cor: " . $carroTodos['cor'] . ", Ano: " . $carroTodos['ano'] . "<br><br>";
}


echo "<h2>Registros com carros fabricados antes de 2023:</h2>";
foreach ($carros as $carro2023) {
    if ($carro2023['ano'] >= 2023) {
        echo "Nome: " . $carro2023['nome'] . ", Fabricante: " . $carro2023['fabricante'] . ", Cor: " . $carro2023['cor'] . "<br><br>";
    }
}
?>
