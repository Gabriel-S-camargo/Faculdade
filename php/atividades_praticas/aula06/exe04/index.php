<?php
function removerCaracteresRepetidos($string) {
    $tamanho = strlen($string);
    $caracteresUnicos = "";
    
    for ($i = 0; $i < $tamanho; $i++) {
        $caractereAtual = $string[$i];

        // achei a função strpos na internet para verificação de ocorrencia em uma string

        if (strpos($caracteresUnicos, $caractereAtual) === false) {
            // se o caracter unico for diferente do caracter atual ele itera esse caracter atual no caracter unico
            // com isso é como se pegasse um array e comparrase seus elementos para poder inserir os diferentes 
            // em um segundo array
            
            $caracteresUnicos .= $caractereAtual;
        }
    }

    return $caracteresUnicos;
}


$palavra = "Codigo php";

$palavraSemRepeticao = removerCaracteresRepetidos($palavra);

echo "Palavra sem caracteres repetidos: " . $palavraSemRepeticao;
?>
