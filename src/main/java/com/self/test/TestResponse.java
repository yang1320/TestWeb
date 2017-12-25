package com.self.test;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestResponse {
	
	@RequestMapping("/html")
	public void reponseHtml(HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		//		response.getWriter().println("<h1>标题11</h1>");
		
		StringBuilder sb=new StringBuilder();
		sb.append("<form><input name='ss' type='button' value='anniu'/></form>");
		response.getOutputStream().write(sb.toString().getBytes());
	}
	
	
	@RequestMapping("/adress")
	public void getAdress(HttpServletRequest request) throws IOException{
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		System.out.println(ip);
		System.out.println("adress:\t"+request.getRemoteAddr());
	}
	
	@RequestMapping("/adress2")
	public String getIp2(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        System.out.println(ip);
        ip=request.getRemoteAddr();
        return ip;
    }
	

}
