<?php
require_once "../Core/connect.php";

$id = $_GET['id'];

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $opcao = $_POST['opcao'];

    if ($opcao == 1) {
        // Prepare a declaração SQL com parâmetros
        $queryDeleteProd = $conn->prepare("DELETE FROM products WHERE id = ?");
        $queryDeleteProd->bind_param("i", $id);
        $queryDeleteProd->execute();

        // Verifique se a execução foi bem-sucedida
        if ($queryDeleteProd->affected_rows > 0) {
            echo "Produto deletado com sucesso.";
        } else {
            echo "Erro ao deletar o produto.";
        }
        $queryDeleteProd->close();
    }

    // Redirecione em ambos os casos
    header("Location: ../View/produtos.view.php");
    exit;
}
