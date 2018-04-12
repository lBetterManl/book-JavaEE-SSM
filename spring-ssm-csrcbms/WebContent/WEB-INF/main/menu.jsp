<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<ul id="menu"> 
	<c:choose>
		<c:when test="${currentModule==0 }">
			<li><a href="${pageContext.request.contextPath }/login/toIndex" class="index_on"></a></li>
		</c:when>
		<c:otherwise>
			<li><a href="${pageContext.request.contextPath }/login/toIndex" class="index_off"></a></li>
		</c:otherwise>
	</c:choose>
	
	<c:forEach items="${allModules }" var="module">
		<c:if test="${module.moduleId==1 }">
			<c:choose> 
				<c:when test="${currentModule==1 }">
					<li><a href="${pageContext.request.contextPath }/role/findRole?currentPage=1" class="role_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/role/findRole?currentPage=1" class="role_off"></a></li>
				</c:otherwise>
			</c:choose>
		</c:if>
		<c:if test="${module.moduleId==2 }">
			<c:choose>
				<c:when test="${currentModule==2 }">
					<li><a href="${pageContext.request.contextPath }/admin/findAdmin?currentPage=1" class="admin_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/admin/findAdmin?currentPage=1" class="admin_off"></a></li>
				</c:otherwise>
			</c:choose>	
		</c:if>
		<c:if test="${module.moduleId==3 }">
			<c:choose>
				<c:when test="${currentModule==3 }">
					<li><a href="${pageContext.request.contextPath }/cost/findCost?currentPage=1&baseDurationSort=&baseCostSort=" class="fee_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/cost/findCost?currentPage=1&baseDurationSort=&baseCostSort=" class="fee_off"></a></li>
				</c:otherwise>
			</c:choose>
		</c:if>
		<c:if test="${module.moduleId==4 }">
			<c:choose>
				<c:when test="${currentModule==4 }">
					<li><a href="${pageContext.request.contextPath }/account/findAccount?currentPage=1" class="account_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/account/findAccount?currentPage=1" class="account_off"></a></li>
				</c:otherwise>
			</c:choose>
		</c:if>
		<c:if test="${module.moduleId==5 }">
			<c:choose>
				<c:when test="${currentModule==5 }">
					<li><a href="${pageContext.request.contextPath }/service/findService?currentPage=1" class="service_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/service/findService?currentPage=1" class="service_off"></a></li>
				</c:otherwise>
			</c:choose>
		</c:if>
	</c:forEach>
	<c:choose>
				<c:when test="${currentModule==8 }">
					<li><a href="${pageContext.request.contextPath }/userInfo/touserInfo" class="information_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/userInfo/touserInfo" class="information_off"></a></li>
				</c:otherwise>
			</c:choose>
 
			<c:choose>
				<c:when test="${currentModule==9 }">
					<li><a href="${pageContext.request.contextPath }/modifyPwd/toModifyPwd" class="password_on"></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath }/modifyPwd/toModifyPwd" class="password_off"></a></li>
				</c:otherwise>
			</c:choose>
</ul>