<?php 
session_start();
require_once "../Core/connect.php";
$erro = null;

$queryAll = $conn->prepare("SELECT * FROM products");
$queryAll->execute();
$result = $queryAll->get_result();

