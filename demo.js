function myfun(){
    var myname = document.getElementById("uname1").value;
    var myname2 = document.getElementById("uname2").value;
    
    if(myname == myname2){
        alert("Both are equal");
    }else{
       alert("Both are not equal"); 
    }
}