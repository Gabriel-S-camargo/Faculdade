<?php require_once "../Model/produto.php" ;
      require_once "../Model/produtoDelete.php";
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
    <h1>Produtos Delete</h1>
        <form method="POST">
            <label>Deseja Realmente Excluir esse produto ? </label>
            <label>Sim</label>
            <input type="radio" id="opcao" name="opcao" value="1">
            <label>Não</label>
            <input type="radio" id="opcao" name="opcao" value = "0">
            <input type="submit">
        </form>
    </table>

    <?php if ($erro != null) { ?>
        <p><?php echo $erro; ?></p>
    <?php } ?>

</body>

</html>