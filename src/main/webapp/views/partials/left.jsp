<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="categoriesWithDetails" scope="request" type="java.util.List<com.ute.day11.beans.Category>"/>

<div class="card">
    <h4 class="card-header">
        Categories
    </h4>
    <div class="list-group list-group-flush">
        <c:forEach items="${categoriesWithDetails}" var="c">
            <a href="${pageContext.request.contextPath}/Product/ByCat?id=${c.catID}" class="list-group-item list-group-item-action">
                <i class="fa fa-caret-right" aria-hidden="true"></i>
                ${c.catName}
            </a>
        </c:forEach>
<%--        <a href="#" class="list-group-item list-group-item-action active">--%>
<%--            Cras justo odio--%>
<%--        </a>--%>
    </div>
</div>
<%--<div class="card mt-3">--%>
<%--    <h4 class="card-header">--%>
<%--        Featured--%>
<%--    </h4>--%>
<%--    <div class="list-group list-group-flush">--%>
<%--        <a href="#" class="list-group-item list-group-item-action active">--%>
<%--            Cras justo odio--%>
<%--        </a>--%>
<%--        <a href="#" class="list-group-item list-group-item-action">Dapibus ac facilisis in</a>--%>
<%--        <a href="#" class="list-group-item list-group-item-action">Morbi leo risus</a>--%>
<%--        <a href="#" class="list-group-item list-group-item-action">Porta ac consectetur ac</a>--%>
<%--        <a href="#" class="list-group-item list-group-item-action disabled">Vestibulum at eros</a>--%>
<%--    </div>--%>
<%--</div>--%>
