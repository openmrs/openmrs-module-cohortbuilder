/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.cohortbuilder.web.dwr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;

public class DefinitionListItem {
	
	protected Log log = LogFactory.getLog(getClass());
	
	private Integer definitionId;
	
	private String name;
	
	private String uuid;
	
	public DefinitionListItem(CohortDefinition definition) {
		definitionId = definition.getId();
		name = definition.getName();
		uuid = definition.getUuid();
	}
	
	/**
	 * @return the definitionId
	 */
	public Integer getDefinitionId() {
		return definitionId;
	}
	
	/**
	 * @param definitionId the definitionId to set
	 */
	public void setDefinitionId(Integer definitionId) {
		this.definitionId = definitionId;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	
	/**
	 * @param the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
