<?php require_once "../Model/cadastrar.php"?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar</title>
</head>

<body>
    <nav>
        <a href="../index.php">Home</a>
        <a href="login.view.php">Login</a>
        <a href="cadastrar.view.php">Cadastre-se</a>
        <a href="produtos.view.php">Produtos</a>
    </nav>
    <h1>Cadastre-se</h1>

    <form method="POST">
        <label> Login</label>
        <input type="text" id="usernameInsert" name="usernameInsert" placeholder="Digite seu login">
        <br>
        <label>Senha</label>
        <input type="text" name="passwordInsert" id="passwordInsert" placeholder="Digite sua senha">
        <input type="submit">
    </form>

    <?php if ($erro != null) { ?>
        <p><?php echo $erro; ?></p>
    <?php } ?>
</body>

</html>