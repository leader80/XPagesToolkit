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
package org.openntf.xpt.core.dss.encryption;

import java.security.MessageDigest;

import javax.crypto.spec.SecretKeySpec;

import com.ibm.xsp.extlib.util.ExtLibUtil;

public class UNIDKeyProvider implements IEncryptionKeyProvider {

	@Override
	public SecretKeySpec getKey() {
		try {
			String passphrase = ExtLibUtil.getCurrentDatabase().getReplicaID();
			MessageDigest digest = MessageDigest.getInstance("SHA");
			digest.update(passphrase.getBytes());
			return new SecretKeySpec(digest.digest(), 0, 16, "AES");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
