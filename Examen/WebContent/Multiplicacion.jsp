<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
</head>
<body bgcolor="#c0c0c0">

<script>
function val(){
	var a = document.forms["Multiplicacion"]["a"].value;
	var b = document.forms["Multiplicacion"]["b"].value;
	if(!a){alert("Error Introduce dato");return false;
	}else if(!b){alert("Error Introduce dato");return false;
	}return true;
}
</script>
<form name="Multiplicacion" method="POST" action="Multiplicacion" onsubmit="return validation()">
A:<input type="text" name="a" value="b"><br>
B:<input type="text" name="b" value="a"><br>
<input type="submit" name="calcular" value="calcular" id="calcular">
</form>
</body>
</html>