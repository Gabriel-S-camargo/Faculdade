<?php

require_once "../Core/connect.php";

$erro = null;

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $username = $_POST['username'];
    $password = $_POST['password'];

    if (empty($username) == true && empty($password) == true) {
        $erro = "Digite valores válidos";
    } else {

        $query = $conn->prepare("SELECT * FROM users WHERE username = ? AND password = ?");
        $query->bind_param('ss', $username, $password);
        $query->execute();
        $result = $query->get_result();

        if ($result->num_rows > 0) {
            $_SESSION['username'] = $username;

            setcookie("username", $username, time() + (86400 * 30), "/"); // 86400 = 1 day

            header("Location: ../View/produtos.view.php");
        } else {
            $erro = "Usuario ou senha inválido";
        }
    }
}
