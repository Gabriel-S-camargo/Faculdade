<?php require_once "../Model/produto.php" ;
      require_once "../Model/produtoAdicionar.php";
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Produtos</title>
</head>

<body>
    <nav>
        <a href="../index.php">Home</a>
        <a href="login.view.php">Login</a>
        <a href="cadastrar.view.php">Cadastre-se</a>
        <a href="produtos.view.php">Produtos</a>
    </nav>
    <h1>Produtos Adicionar</h1>

    <form method="POST">
        <label>Nome Produto</label>
        <input type="text" name="nomeProduto" id="nomeProduto">
        <label>Descrição Produto</label>
        <input type="text" name="descricaoProduto" id="descricaoProduto">
        <label>Preco Produto</label>
        <input type="number" name="precoProduto" id="precoProduto">
        <input type="submit">
    </form>

    </table>

    <?php if ($erro != null) { ?>
        <p><?php echo $erro; ?></p>
    <?php } ?>

</body>

</html>