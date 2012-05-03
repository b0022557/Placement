<%@ page import="placement.Placement_opportunity" %>



<div class="fieldcontain ${hasErrors(bean: placement_opportunityInstance, field: 'applications', 'error')} ">
	<label for="applications">
		<g:message code="placement_opportunity.applications.label" default="Applications" />
		
	</label>
	<g:textField name="applications" value="${placement_opportunityInstance?.applications}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placement_opportunityInstance, field: 'company_name', 'error')} ">
	<label for="company_name">
		<g:message code="placement_opportunity.company_name.label" default="Companyname" />
		
	</label>
	<g:textField name="company_name" value="${placement_opportunityInstance?.company_name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placement_opportunityInstance, field: 'job_title', 'error')} ">
	<label for="job_title">
		<g:message code="placement_opportunity.job_title.label" default="Jobtitle" />
		
	</label>
	<g:textField name="job_title" value="${placement_opportunityInstance?.job_title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placement_opportunityInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="placement_opportunity.status.label" default="Status" />
		
	</label>
	<g:textField name="status" value="${placement_opportunityInstance?.status}"/>
</div>

