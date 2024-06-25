<?php
require_once "../Core/connect.php";

$erro = null;

$id = $_GET['id'];

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $nomeProdutoUp = $_POST['nomeProdutoUp'];
    $descricaoProdutoUp = $_POST['descricaoProdutoUp'];
    $precoProdutoUp = $_POST['precoProdutoUp'];

    if (empty($precoProdutoUp) == true || empty($nomeProdutoUp) == true || empty($descricaoProdutoUp) == true) {
        $erro = "Insira valores válidos";
    } else {
        $queryAlterarProd = $conn->prepare("UPDATE products SET name = ?, description = ?, price = ? WHERE id = ?");
        $queryAlterarProd->bind_param("ssdi", $nomeProdutoUp, $descricaoProdutoUp, $precoProdutoUp, $id);
        $queryAlterarProd->execute();

        if ($queryAlterarProd->affected_rows > 0) {
            header("Location: ../View/produtos.view.php");
        } else {
            $erro = "ERRO na alteração do produto";
        }
    }
}
