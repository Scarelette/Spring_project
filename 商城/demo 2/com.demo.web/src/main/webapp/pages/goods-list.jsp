<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>

<c:forEach items="${goodsAll}" var="pro">
    <tr>
        <td>${pro.goodsid }</td>
        <td>${pro.goodsname}</td>
        <td>${pro.price }</td>
        <td class="text-center">
            <a href="${pageContext.request.contextPath}/pay/paygoods.do?goodsId=${pro.goodsid}">点击购买</a>
        </td>
    </tr>
</c:forEach>
</body>
</html>
