
<%@ page import="placement.Placement_opportunity" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'placement_opportunity.label', default: 'Placement_opportunity')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-placement_opportunity" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-placement_opportunity" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list placement_opportunity">
			
				<g:if test="${placement_opportunityInstance?.applications}">
				<li class="fieldcontain">
					<span id="applications-label" class="property-label"><g:message code="placement_opportunity.applications.label" default="Applications" /></span>
					
						<span class="property-value" aria-labelledby="applications-label"><g:fieldValue bean="${placement_opportunityInstance}" field="applications"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${placement_opportunityInstance?.company_name}">
				<li class="fieldcontain">
					<span id="company_name-label" class="property-label"><g:message code="placement_opportunity.company_name.label" default="Companyname" /></span>
					
						<span class="property-value" aria-labelledby="company_name-label"><g:fieldValue bean="${placement_opportunityInstance}" field="company_name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${placement_opportunityInstance?.job_title}">
				<li class="fieldcontain">
					<span id="job_title-label" class="property-label"><g:message code="placement_opportunity.job_title.label" default="Jobtitle" /></span>
					
						<span class="property-value" aria-labelledby="job_title-label"><g:fieldValue bean="${placement_opportunityInstance}" field="job_title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${placement_opportunityInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="placement_opportunity.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${placement_opportunityInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${placement_opportunityInstance?.id}" />
					<g:link class="edit" action="edit" id="${placement_opportunityInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
