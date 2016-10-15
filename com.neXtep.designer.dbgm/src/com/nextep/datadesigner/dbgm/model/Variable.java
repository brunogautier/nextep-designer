/*******************************************************************************
 * Copyright (c) 2011 neXtep Software and contributors.
 * All rights reserved.
 *
 * This file is part of neXtep designer.
 *
 * NeXtep designer is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or any later version.
 *
 * NeXtep designer is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     neXtep Softwares - initial API and implementation
 *******************************************************************************/
package com.nextep.datadesigner.dbgm.model;


/**
 * Default {@link IVariable} implementation.
 * 
 * @author Christophe Fondacci
 *
 */
public class Variable implements IVariable {

	private String name;
	private String datatypeName;
	public Variable(String name, String datatypeName) {
		setName(name);
		setDatatypeName(datatypeName);
	}
	public Variable(String name) {
		setName(name);
	}
	/**
	 * @see com.nextep.datadesigner.dbgm.model.IVariable#getDatatypeName()
	 */
	@Override
	public String getDatatypeName() {
		return datatypeName;
	}

	/**
	 * @see com.nextep.datadesigner.dbgm.model.IVariable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	/**
	 * @see com.nextep.datadesigner.dbgm.model.IVariable#setDatatypeName(java.lang.String)
	 */
	@Override
	public void setDatatypeName(String name) {
		this.datatypeName = name;		
	}
	/**
	 * @see com.nextep.datadesigner.dbgm.model.IVariable#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name= (name != null ? name.toLowerCase() : null);
	}

}