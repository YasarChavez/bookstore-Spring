let $anio = document.querySelector('#anio');
let fecha = new Date();
let anio = fecha.getFullYear();

$anio.innerHTML = anio;
console.log(anio);
