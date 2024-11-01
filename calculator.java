<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="one">
        <button onclick="calc=calc+'1'; console.log(calc)">1</button>
        <button onclick = "calc=calc+'2'; console.log(calc)">2</button>
        <button onclick = "calc=calc+'3'; console.log(calc)">3</button>
        <button onclick = "calc=calc+'4'; console.log(calc)">4</button><br>
        <button onclick = "calc=calc+'5'; console.log(calc)">5</button>
        <button onclick = "calc=calc+'6'; console.log(calc)">6</button>
        <button onclick = "calc=calc+'7'; console.log(calc)">7</button>
        <button onclick = "calc=calc+'8'; console.log(calc)">8</button><br>
        <button onclick = "calc=calc+'9'; console.log(calc)">9</button>
        <button onclick = "calc=calc+'0'; console.log(calc)">0</button>
        <button onclick = "calc=calc+'+'; console.log(calc)">+</button>
        <button onclick = "calc=calc+'-'; console.log(calc)">-</button><br>
        <button onclick = "calc=calc+'*'; console.log(calc)">*</button>
         <button onclick = "calc=calc+'/'; console.log(calc)">/</button>
        <!-- <button onclick = "calc=calc+'C'; console.log(calc)">C</button> -->
        <button onclick = "console.log(eval(calc))">=</button>
        </div>
        <script> let calc = ''</script>



    
</body>
</html>
