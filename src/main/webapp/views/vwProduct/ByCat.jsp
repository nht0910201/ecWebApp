<%--
  Created by IntelliJ IDEA.
  User: Tri
  Date: 11/16/2021
  Time: 11:39 AM
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
            <h4 class="card-header">
                Product
            </h4>
            <c:choose>
                <c:when test="${products.size()==0}">
                    <div class="card-body">
                        <p class="card-text">No data</p>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="row">
                        <c:forEach items="${products}" var="p">
                            <div class="col-sm-4 mb-3">
                                <div class="card h-100">
                                    <img class="card-img-top" src="${pageContext.request.contextPath}/public/imgs/sp/${p.proID}/main_thumbs.jpg" alt="${p.proName}" title=${p.proName} >
                                    <div class="card-body">
                                        <h6 class="card-title">${p.proName}</h6>
                                        <h5 class="card-title text-danger">
                                            <fmt:formatNumber value="${p.price}" type="number" />
                                        </h5>
                                        <p class="card-text">${p.tinyDes}</p>
                                    </div>
                                    <div class="card-footer text-muted">
                                        <a class="btn btn-outline-primary" href="${pageContext.request.contextPath}/Product/Detail?id=${p.proID}" role="button">
                                            <i class="fa fa-eye" aria-hidden="true"></i>
                                            Detail
                                        </a>
                                        <a class="btn btn-outline-success" href="#" role="button">
                                            <i class="fa fa-cart-plus" aria-hidden="true"></i>
                                            Add to cart
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </c:otherwise>
            </c:choose>
        </div>
    </jsp:body>
</t:main>