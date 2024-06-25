<?php
require_once "../Core/connect.php";

if($_SERVER['REQUEST_METHOD'] == "POST"){
    $nomeProduto = $_POST['nomeProduto'];
    $descricaoProduto = $_POST['descricaoProduto'];
    $precoProduto = $_POST['precoProduto'];

    $queryAdicionarProd = $conn->prepare("INSERT INTO products (name, description, price) VALUES (?, ?, ?)");
    $queryAdicionarProd->bind_param("ssd", $nomeProduto, $descricaoProduto, $precoProduto);

    if ($queryAdicionarProd->execute()) {
        echo "Produto adicionado com sucesso.";
        header("Location: '../View/produtos'");
    } else {
        echo "Erro ao adicionar produto.";
    }

    $queryAdicionarProd->close();
}