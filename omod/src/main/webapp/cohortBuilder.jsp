<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<openmrs:htmlInclude file="/moduleResources/cohortbuilder/OpenmrsAutoComplete.js" />

<%@ include file="template/localHeader.jsp"%>
<openmrs:htmlInclude file="/dwr/interface/DWRCohortBuilderService.js" />

<script type="text/javascript">

$j(document).ready( function() {
	new AutoComplete('definition_search', new CreateCallback().definitionCallback(), {
		select: function(event, ui) {
			//jquerySelectEscaped(formFieldId).val(ui.item.object[valueField]);
			if (ui.item.object && callBack) {
				// only call the callback if we got a true selection, not a click on an error field
				callBack(ui.item.object);
			}
		},
		placeholder: "<spring:message code="general.search" />"
	});
});
</script>

<fieldset>
	<legend><spring:message code="general.search" /></legend>
	<input id="definition_search" type="text" value="" />
</fieldset>
<br /><br />
<fieldset>
	<legend><spring:message code="general.search.history" /></legend>
	<input type="button" value="<spring:message code="general.clear" />" />
</fieldset>

<%@ include file="/WEB-INF/template/footer.jsp"%>