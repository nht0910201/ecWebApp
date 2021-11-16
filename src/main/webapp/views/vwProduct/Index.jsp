<%--
  Created by IntelliJ IDEA.
  User: Tri
  Date: 11/3/2021
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:useBean id="products" scope="request" type="java.util.List<com.ute.day11.beans.Product>"/>
<t:main>
    <jsp:body>
        <div class="card">
            <h4 class="card-header  d-flex justify-content-between">
                Product (Admin)
                <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/Admin/Product/Add" role="button">
                    <i class="fa fa-plus" aria-hidden="true"></i>
                    Add Product
                </a>
            </h4>

                <c:choose>
                    <c:when test="${products.size()==0}">
                        <div class="card-body">
                            <p class="card-text">No data</p>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>Product</th>
                                <th>Description</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>&nbsp;</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${products}" var="p">
                                <tr>
                                    <td scope="row">${p.proID}</td>
                                    <td>${p.proName}</td>
                                    <td>${p.tinyDes}</td>
                                    <td class="text-right">
                                        <fmt:formatNumber value="${p.price}" type="number" />
                                    </td>
                                    <td>${p.quantity}</td>
                                    <td class="text-right">
                                        <a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/Admin/Product/Edit?id=${p.proID}" role="button">
                                            <i class="fa fa-pencil" aria-hidden="true"></i>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </c:otherwise>
                </c:choose>

                <%--${category.catIO}-${category.catName}--%>

        </div>
    </jsp:body>
</t:main>
