/*
 * � Copyright WebGate Consulting AG, 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.xpt.library;

import org.openntf.xpt.core.config.ConfiguationProvider;

import com.ibm.xsp.library.AbstractXspLibrary;

public class XPTLibrary extends AbstractXspLibrary {

	@Override
	public String getLibraryId() {
		return "org.openntf.xpt.library";
	}

	@Override
	public String[] getXspConfigFiles() {
		return ConfiguationProvider.getInstance().getXspConfigFiles();
	}

	@Override
	public String getPluginId() {
		return "org.openntf.xpt";
	}

	public String[] getFacesConfigFiles() {
		return ConfiguationProvider.getInstance().getFacesConfigFiles();
	}

	public String[] getDependencies() {
        return new String[] {
            "com.ibm.xsp.core.library",     // $NON-NLS-1$
            "com.ibm.xsp.extsn.library",    // $NON-NLS-1$
            "com.ibm.xsp.domino.library",   // $NON-NLS-1$
            "com.ibm.xsp.extlib.library",   // $NON-NLS-1$
        };
    }

}
