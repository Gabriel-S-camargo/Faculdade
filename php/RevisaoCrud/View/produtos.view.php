<?php require_once "../Model/produto.php" ?>

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
    <h1>Produtos</h1>

    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Preco</th>

        </tr>
        <?php
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                echo "<tr>";
                echo "<td>" . $row['id'] . "</td>";
                echo "<td>" . $row['name'] . "</td>";
                echo "<td>" . $row['description'] . "</td>";
                echo "<td>" . $row['price'] . "</td>";
                echo "<td>
                        <a href='produtoUpdate.view.php?id=" . $row['id'] . "'>Edit</a> | 
                        <a href='produtoDelete.view.php?id=" . $row['id'] . "'>Delete</a>
                    </td>";
                echo "</tr>";
            }
        } else {
            echo "<tr><td colspan='5'>Nenhum produto encontrado</td></tr>";
        }
        ?>
    </table>

    <a href="produtoAdicionar.view.php">Adicionar Produto</a>

    <?php if ($erro != null) { ?>
        <p><?php echo $erro; ?></p>
    <?php } ?>

</body>

</html>