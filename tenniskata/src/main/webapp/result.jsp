<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: center;
}
</style>
</head>
<body>
	<table align="center" border="1">
		<caption>Przebieg meczu:</caption>
		<tr>
		    <th>Gracz A</th>
		    <th>Gracz B</th>		
		</tr>
		<c:forEach var="result" items="${competitionResult}" >
		<tr>
			<td colspan="2">${result}</td>
		</tr>
	</c:forEach>
	</table>
	<a href="letsPlay.do"><p style="text-align:center"><img src="images/refresh.jpg" height="42" width="42"></p></a>
</body></html>