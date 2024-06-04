<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar</title>
</head>

<body>
    <h1>Cadastrar</h1>

    <form action="cadastrarUsuario" method="POST" type="submit">
        <label>Nome:</label>
        <input type="text" name="nome" id="nome" placeholder="Digite seu nome"> <br><br>

        <label for="estadoCivil">Estado Civil</label>
        <select name="estadoCivil" id="estadoCivil">
            <option value="opcao">Escolha uma opção</option>
            <option value="Casado">Casado</option>
            <option value="Solteiro">Solteiro</option>
            <option value="Divorciado">Divorciado</option>
        </select>

        <br><br>

        <label>Data de nascimento</label>
        <input type="text" name="dataNascimento" id="dataNascimento" placeholder="Digite sua data de Nascimento"> <br><br>

        <label>Estado de Nascimento</label>
        <input type="text" name="estadoNascimento" id="estadoNascimento" placeholder="Digite seu estado de nascimento"> <br><br>

        <label>CPF</label>
        <input type="text" name="cpf" id="cpf" placeholder="Digite o seu CPF"> <br><br>

        <label>Profissao</label>
        <input type="text" name="profissao" id="profissao" placeholder="Digite sua profissao"> <br><br>

        <input type="submit" name="cadastrarUsuario">
    </form>

</body>

</html>