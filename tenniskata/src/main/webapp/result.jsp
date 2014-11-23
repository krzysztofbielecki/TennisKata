<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>
	<strong> Przebieg meczu:</strong>
	<br><br>
	<table border="1">
		<c:forEach var="result" items="${competitionResult}" >
		<tr border="0">
			<td>${result}</td>
		</tr>
	</c:forEach>
	</table>
	<a href="letsPlay.do">jeszcze raz?</a>
</body></html>