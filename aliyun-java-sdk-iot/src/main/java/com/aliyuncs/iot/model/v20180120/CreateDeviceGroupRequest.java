/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceGroupRequest extends RpcAcsRequest<CreateDeviceGroupResponse> {
	
	public CreateDeviceGroupRequest() {
		super("Iot", "2018-01-20", "CreateDeviceGroup");
	}

	private String groupDesc;

	private String superGroupId;

	private String groupName;

	public String getGroupDesc() {
		return this.groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
		if(groupDesc != null){
			putQueryParameter("GroupDesc", groupDesc);
		}
	}

	public String getSuperGroupId() {
		return this.superGroupId;
	}

	public void setSuperGroupId(String superGroupId) {
		this.superGroupId = superGroupId;
		if(superGroupId != null){
			putQueryParameter("SuperGroupId", superGroupId);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<CreateDeviceGroupResponse> getResponseClass() {
		return CreateDeviceGroupResponse.class;
	}

}
