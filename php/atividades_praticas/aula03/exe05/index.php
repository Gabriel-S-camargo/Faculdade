<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>exe05</title>
</head>
<body>
    
    <form action="index.php" method ="post">
        <label>Informe numero: </label>
        <input type="text" name="num01"><br><br>

        <button name="operacao" value="cubo">Calcular Cubo</button> <br><br>

        <button name="operacao" value="dobro" >Calcular dobro</button> <br><br>

        <button name="operacao" value="raiz">Calcular raiz quadadra</button> <br><br>

    </form>



</body>
</html>

<?php 
    if(isset($_POST['num01'])){

        $num01 = $_POST['num01'];
        function calcularCubo($num01){
            $valor_cubo = pow($num01, 3);
            return $valor_cubo;
        }

        function calcularDobro($num01){
            $valor_dobro = $num01 * 2;
            return $valor_dobro;
        }

        function calcularRaiz($num01){
            $valor_raiz = sqrt($num01);
            return $valor_raiz;
        }

       if($_POST['operacao'] == 'cubo'){
        
            echo calcularCubo($num01);
        } 
        else if($_POST['operacao'] == 'dobro'){
            echo calcularDobro($num01);
        }
        else{
            echo calcularRaiz($num01);
        }

    }else{
        echo 'Informe num1 e calculo ';
    }


?>