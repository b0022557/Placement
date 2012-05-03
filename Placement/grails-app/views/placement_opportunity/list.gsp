
<%@ page import="placement.Placement_opportunity" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'placement_opportunity.label', default: 'Placement_opportunity')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-placement_opportunity" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-placement_opportunity" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="applications" title="${message(code: 'placement_opportunity.applications.label', default: 'Applications')}" />
					
						<g:sortableColumn property="company_name" title="${message(code: 'placement_opportunity.company_name.label', default: 'Companyname')}" />
					
						<g:sortableColumn property="job_title" title="${message(code: 'placement_opportunity.job_title.label', default: 'Jobtitle')}" />
					
						<g:sortableColumn property="status" title="${message(code: 'placement_opportunity.status.label', default: 'Status')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${placement_opportunityInstanceList}" status="i" var="placement_opportunityInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${placement_opportunityInstance.id}">${fieldValue(bean: placement_opportunityInstance, field: "applications")}</g:link></td>
					
						<td>${fieldValue(bean: placement_opportunityInstance, field: "company_name")}</td>
					
						<td>${fieldValue(bean: placement_opportunityInstance, field: "job_title")}</td>
					
						<td>${fieldValue(bean: placement_opportunityInstance, field: "status")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${placement_opportunityInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
