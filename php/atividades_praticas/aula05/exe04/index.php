<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checador de notas melhorado</title>
</head>
<body>

    <h1>Medias dos alunos</h1>
    
</body>
</html>


<?php

function calculateStudentApproval($grades) {
    $sum = array_sum($grades);
    $average = $sum / count($grades);

    if ($average > 10) {
        return "<br>Error, valores inválidso";
    }

    if ($average >= 6) {
        return "<br>Aprovado; Média: {$average}.";
    } else {
        return "<br>Reprovado; Média: {$average}.";
    }
}


$grades = [8, 7, 9, 6];
$result = calculateStudentApproval($grades);
echo $result; 

$grades = [11, 7, 9, 6];
$result = calculateStudentApproval($grades);
echo $result; 

$grades = [5, 4, 3, 2];
$result = calculateStudentApproval($grades);
echo $result; 

?>