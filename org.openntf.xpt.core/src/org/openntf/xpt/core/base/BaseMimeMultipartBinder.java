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
package org.openntf.xpt.core.base;

import java.lang.reflect.Method;

import com.ibm.xsp.http.MimeMultipart;

public class BaseMimeMultipartBinder {
	public BaseMimeMultipartBinder() {
		super();
	}

	public String getValue(Object objCurrent, String strJavaField) {
		try {
			Method mt = objCurrent.getClass().getMethod("get" + strJavaField);
			MimeMultipart mm = (MimeMultipart) mt.invoke(objCurrent);
			
			return mm.getHTML();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
}
