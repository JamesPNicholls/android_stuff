function rollem(){
    total = 0; 
    n = document.getElementById('num').value;
    p = document.getElementById('output').innerHTML;

    if ((n>10) || (n < 1)) {
        
        alert("You can roll 1 to 10 dice.")
        return;
    }
    
    
    // Default value for 'document.getElementById('output').innerHTML'
    if ((p != "" )){
        p = p.concat("<hr>"); 
    }

    else{
        p = p.concat('<button id="clear" onclick="clearme()" style="float:right;">Clear</button>')
    }


 

    for (let i = 0; i < n; i++) {
        r = Math.ceil(Math.random()*6);
        total += r;
        p = p + '<span><img src="' + r + '.jpg" alt="face ' + r +'" width="50" height="50"></img></span>';
    }

    p = p + "<br> Total: " + total
    document.getElementById('output').innerHTML = p; 
    return;
}

function clearme(){
   document.getElementById('output').innerHTML = "";
}