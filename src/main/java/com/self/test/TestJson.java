package com.self.test;

import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

			

	@Test
	public void testJsonConvert(){
		StringBuilder sb=new StringBuilder();
		sb.append("{");			
		sb.append(" 'p4_Cur':'CNY',");		
		sb.append(" 'p0_Cmd':'Buy',");		
		sb.append(" 'p3_Amt':'8888.88',");			
		sb.append("'p2_Order':'201711201714490519917630',");			
		sb.append(" 'hmac':'36b238e2c8758e4c55d4c4ad9e5dabb3',");			
		sb.append(" 'p8_Url':'http://101.95.101.118:10225/asyn/rechargeCallBack',");			
		sb.append("'p1_MerId':'10015688478',");			
		sb.append(" 'pd_FrpId':'03010000',");			
		sb.append(" 'pb_ServerNotifyUrl':'http://58.23.16.244:2080/sunpay-rest/v1/pay_result_notify/051',");			
		sb.append("'url':'https://www.yeepay.com/app-merchant-proxy/node'");			
		sb.append("}");
		String data="{'errorMsg':'网关充值申请失败！'}";
		Map<String,Object> dataMap=JSON.toJavaObject(JSON.parseObject(sb.toString()), Map.class);
		
		
		System.out.println(dataMap.get("p1_MerId"));
		StringBuilder sb1=new StringBuilder();
		sb1.append("<form action='"+dataMap.get("url")+"' method='post'>");
		sb1.append("<input type='text' name='p4_Cur' value='"+dataMap.get("p4_Cur")+"' > ");                        
		sb1.append("<input type='text' name='p0_Cmd' value='"+dataMap.get("p0_Cmd")+"' > ");                        
		sb1.append("<input type='text' name='p3_Amt' value='"+dataMap.get("p3_Amt")+"' > ");                        
		sb1.append("<input type='text' name='p2_Order' value='"+dataMap.get("p2_Order")+"' > ");                    
		sb1.append("<input type='text' name='hmac' value='"+dataMap.get("hmac")+"' > " );                           
		sb1.append("<input type='text' name='p8_Url' value='"+dataMap.get("p8_Url")+"' > " );                       
		sb1.append("<input type='text' name='p1_MerId' value='"+dataMap.get("p1_MerId")+"' > ");                    
		sb1.append("<input type='text' name='pd_FrpId' value='"+dataMap.get("pd_FrpId")+"' > ");                    
		sb1.append("<input type='text' name='pb_ServerNotifyUrl' value='"+dataMap.get("pb_ServerNotifyUrl")+"' > ");
		sb1.append("</form>");
		
		
		System.out.println(sb1);

	}
}
