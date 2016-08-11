<!-- Header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp" />

<!-- Main Content Area -->
<div id="maincontent">
	<center>
		<table border="2">
			<tr>
				<th>Sno</th>
				<th>Sname</th>
				<th>Fee</th>
				<th>Course</th>
			</tr>
			<c:forEach var="studentDTO" items="${studentlist}">
				<tr>
					<td>${studentDTO.sno}</td>
					<td>${studentDTO.sname}</td>
					<td>${studentDTO.age}</td>
					<td>${studentDTO.course}</td>
				</tr>
			</c:forEach>
		</table>
	</center>

</div>

<!-- Footer -->
<jsp:include page="footer.jsp" />