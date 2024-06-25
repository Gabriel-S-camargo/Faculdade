<?php
session_start();
require_once "../Core/connect.php";

$erro = null;

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $username = $_POST['usernameInsert'];
    $password = $_POST['passwordInsert'];

    // Preparar a primeira consulta para verificar se o usuário já existe
    $query = $conn->prepare("SELECT * FROM users WHERE username = ?");
    $query->bind_param('s', $username);
    $query->execute();
    $result = $query->get_result();

    // Verificar se o usuário já existe
    if ($result->num_rows == 0) {
        // Fechar a primeira consulta antes de preparar e executar a segunda
        $query->close();

        // Preparar a segunda consulta para inserir o novo usuário
        $queryInsert = $conn->prepare("INSERT INTO users (username, password) VALUES (?, ?)");
        $queryInsert->bind_param('ss', $username, $password);
        if ($queryInsert->execute()) {
            // Redirecionar ou dar uma mensagem de sucesso
            header("Location: ../View/login.view.php"); // ou outra página de sucesso
            exit;
        } else {
            $erro = "Erro ao inserir novo usuário.";
        }
        $queryInsert->close();
    } else {
        $erro = "Usuário já existe.";
    }
    $result->close();
}
