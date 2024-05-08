<?php
$textoIncorreto = "&u gosto d& estudar a linguag&m PHP &m finais de semana";

// tem outro jeito sem o string replace ?? 

$textoCorrigido = str_replace(array("&u", "d&", "&m"), array("eu", "de", "em"), $textoIncorreto);

echo "Texto corrigido: " . $textoCorrigido;
?>
