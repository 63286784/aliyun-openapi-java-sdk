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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerListAccessGatewayServersRequest extends RpcAcsRequest<InnerListAccessGatewayServersResponse> {
	
	public InnerListAccessGatewayServersRequest() {
		super("Smartag-inner", "2018-03-13", "InnerListAccessGatewayServers", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String instanceId;

	private String locationId;

	private String resourceUid;

	private Integer pageSize;

	private String resourceBid;

	private String loopbackExternalIp;

	private Integer pageNumber;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
		if(locationId != null){
			putQueryParameter("LocationId", locationId);
		}
	}

	public String getResourceUid() {
		return this.resourceUid;
	}

	public void setResourceUid(String resourceUid) {
		this.resourceUid = resourceUid;
		if(resourceUid != null){
			putQueryParameter("ResourceUid", resourceUid);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getResourceBid() {
		return this.resourceBid;
	}

	public void setResourceBid(String resourceBid) {
		this.resourceBid = resourceBid;
		if(resourceBid != null){
			putQueryParameter("ResourceBid", resourceBid);
		}
	}

	public String getLoopbackExternalIp() {
		return this.loopbackExternalIp;
	}

	public void setLoopbackExternalIp(String loopbackExternalIp) {
		this.loopbackExternalIp = loopbackExternalIp;
		if(loopbackExternalIp != null){
			putQueryParameter("LoopbackExternalIp", loopbackExternalIp);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<InnerListAccessGatewayServersResponse> getResponseClass() {
		return InnerListAccessGatewayServersResponse.class;
	}

}
