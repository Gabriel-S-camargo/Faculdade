<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>aula07 - exemplo</title>
</head>
<body>

    <h1>Informe seus dados</h1>

    <form method="POST" action="cadastro.php">
        <span>Digite seu nome: </span> <br><br>
        <input type="text" placeholder="Digite seu nome" name="userNome"> <br><br>
        
        <span>Digite seu Sobrenome: </span> <br> <br>
        <input type="text" name="userSobrenome" placeholder="Digite seu Sobrenome"> <br><br>
        
        <input type="submit" value="Enviar" name="enviar">
    </form>
    
</body>
</html>
