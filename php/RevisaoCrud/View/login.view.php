<?php require_once "../Model/login.php" ;



?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>

<body>
    <nav>
        <a href="../index.php">Home</a>
        <a href="login.view.php">Login</a>
        <a href="cadastrar.view.php">Cadastre-se</a>
        <a href="produtos.view.php">Produtos</a>
    </nav>
    <h1>login</h1>

    <form method="POST">
        <label> Login</label>
        <input type="text" id="username" name="username" placeholder="Digite seu login">
        <br>
        <label>Senha</label>
        <input type="text" name="password" id="password" placeholder="Digite sua senha">
        <input type="submit">
    </form>

    <?php if ($erro != null) { ?>
        <p><?php echo $erro; ?></p>
    <?php } ?>

</body>

</html>