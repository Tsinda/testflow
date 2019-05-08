<%@ include file="/WEB-INF/template/include.jsp"%>
<openmrs:require privilege="View HMIS Data Flow" otherwise="/login.htm" redirect="/patientDashboard.form" />

<span class="boxHeader"><spring:message code="mohdataflowmodule.patienthistory" /></span>
<!--
<center>
	<a href="${pageContext.request.contextPath}/module/mohdataflowmodule/outpatient.form?patientId=${param.patientId}">OPD Form</a> | <a href="${pageContext.request.contextPath}/module/mohdataflowmodule/inpatient.form?patientId=${param.patientId}">IPD Form</a>
</center>
-->
<br/>
<div class="box">
	<table width="100%">
		<thead>
			<tr>
				<th class="columnHeader"><b>#</b></th>
				<th class="columnHeader"><b>Diagnosis</b></th>
				<th class="columnHeader"><b>Clinician</b></th>
				<th class="columnHeader"><b>Date</b></th>
			</tr>
		</thead>
		<tbody>
		<c:if test="${empty model.dignosisList}">No diagnosis history found!</c:if>
		<c:forEach items="${model.dignosisList}" var="diagnosis" varStatus="status">
			<tr>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;"><b>${status.count}.</b></td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${diagnosis.value}</td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${diagnosis.provider.personName}</td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;"><openmrs:formatDate date="${diagnosis.obsDatetime}" type="medium" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
<br/>
<span class="boxHeader"><spring:message	code="mohdataflowmodule.laborder" /></span>
<div class="box">
	<table width="100%">
		<thead>
			<tr>
				<th class="columnHeader"><b>#</b></th>
				<th class="columnHeader"><b>Lab Test</b></th>
				<th class="columnHeader"><b>Value</b></th>
				<th class="columnHeader"><b>Date</b></th>
				<th class="columnHeader"><b>Lab Officer</b></th>
			</tr>
		</thead>
		<tbody>
		<c:if test="${empty model.labList}">No Laboratory history found!</c:if>
		<c:forEach items="${model.labList}" var="lab" varStatus="status">
			<tr>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;"><b>${status.count}. </b></td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${lab.labTest}</td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${lab.value}</td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;"> <openmrs:formatDate date="${lab.obsDatetime}" type="medium" /></td>
                <td class="rowValue" style="border-bottom: 1px solid cadetblue;">${lab.provider.familyName} ${lab.provider.givenName}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
<br/>
<span class="boxHeader"><spring:message
	code="mohdataflowmodule.drugorder" /></span>
<div class="box">
	<table width="100%">
		<tr>
			<th class="columnHeader">Drug orders</th>
			<th class="columnHeader">Dose</th>
			<th class="columnHeader">Frequency</th>
			<th class="columnHeader">Start Date</th>
			<th class="columnHeader">Stop Date</th>
			<th class="columnHeader">Comments</th>
		</tr>
		<c:if test="${empty model.drugList}">No Drug Orders history found !</c:if>
		<c:forEach items="${model.drugList}" var="order" varStatus="status">
			<tr>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${status.count}. ${order.drug.name}</td>	
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${order.dose}${order.units}</td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${order.frequency}</td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;"><openmrs:formatDate date="${order.startDate}" type="medium" /></td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;"><openmrs:formatDate date="${order.discontinuedDate}" type="medium" /></td>
				<td class="rowValue" style="border-bottom: 1px solid cadetblue;">${order.instructions}</td>
			</tr>
		</c:forEach>
		<!-- <tr>
			<td colspan="6"><hr/></td>	
		</tr> -->
	</table>
</div>