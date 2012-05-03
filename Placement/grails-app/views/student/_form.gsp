<%@ page import="placement.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'applications', 'error')} ">
	<label for="applications">
		<g:message code="student.applications.label" default="Applications" />
		
	</label>
	<g:textField name="applications" value="${studentInstance?.applications}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'course_code', 'error')} ">
	<label for="course_code">
		<g:message code="student.course_code.label" default="Coursecode" />
		
	</label>
	<g:textField name="course_code" value="${studentInstance?.course_code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${studentInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'notes', 'error')} ">
	<label for="notes">
		<g:message code="student.notes.label" default="Notes" />
		
	</label>
	<g:textField name="notes" value="${studentInstance?.notes}"/>
</div>

