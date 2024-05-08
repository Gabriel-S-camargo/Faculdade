<!DOCTYPE html>
<html>
<head>
	<title>Math Operations</title>
</head>
<body>
	<h1>Math Operations</h1>

	<form method="post">
		<label for="operation">Escolha operacao</label>
		<select name="operation" id="operation">
			<option value="subtraction">Subtracao</option>
			<option value="addition">Adicao</option>
			<option value="multiplication">Multiplicacao</option>
			<option value="exponentiation">Exponenciacao</option>
			<option value="division">Divisao</option>
		</select><br><br>

		<label for="number1">Numero 1:</label>
		<input type="number" name="number1" id="number1"><br><br>

		<label for="number2">Numero 2:</label>
		<input type="number" name="number2" id="number2" ><br><br>

		<input type="submit" value="Calculate">
	</form>

	<?php

	function calculateMathOperation($operation, $number1, $number2) {
		switch ($operation) {
			case 'subtraction':
				$result = $number1 - $number2;
				break;
			case 'addition':
				$result = $number1 + $number2;
				break;
			case 'multiplication':
				$result = $number1 * $number2;
				break;
			case 'exponentiation':
				$result = pow($number1, $number2);
				break;
			case 'division':
				if ($number2 == 0) {
					return "Error! divisão por 0.";
				}
				$result = $number1 / $number2;
				break;
			default:
				return "Error! operacao inválida.";
		}

		return "Resultado: {$result}<br>Operacao: {$operation}";
	}

   // $_SERVER['REQUEST_METHOD'] == 'POST'

	if (isset($_POST['number1']) && isset($_POST['number2'])) {
		$operation = $_POST['operation'];
		$number1 = $_POST['number1'];
		$number2 = $_POST['number2'];

		$result = calculateMathOperation($operation, $number1, $number2);
		echo $result;
    }else {
        echo 'Erro! Prencha valores nos campos';
    }

	?>
</body>
</html>