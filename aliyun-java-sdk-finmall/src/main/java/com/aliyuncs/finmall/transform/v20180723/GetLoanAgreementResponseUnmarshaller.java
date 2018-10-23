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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetLoanAgreementResponse;
import com.aliyuncs.finmall.model.v20180723.GetLoanAgreementResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoanAgreementResponseUnmarshaller {

	public static GetLoanAgreementResponse unmarshall(GetLoanAgreementResponse getLoanAgreementResponse, UnmarshallerContext context) {
		
		getLoanAgreementResponse.setRequestId(context.stringValue("GetLoanAgreementResponse.RequestId"));
		getLoanAgreementResponse.setCode(context.stringValue("GetLoanAgreementResponse.Code"));
		getLoanAgreementResponse.setMessage(context.stringValue("GetLoanAgreementResponse.Message"));

		Data data = new Data();
		data.setUrl(context.stringValue("GetLoanAgreementResponse.Data.Url"));
		data.setReturnCode(context.stringValue("GetLoanAgreementResponse.Data.ReturnCode"));
		data.setDownloadUrl(context.stringValue("GetLoanAgreementResponse.Data.DownloadUrl"));
		data.setViewUrl(context.stringValue("GetLoanAgreementResponse.Data.ViewUrl"));
		getLoanAgreementResponse.setData(data);
	 
	 	return getLoanAgreementResponse;
	}
}