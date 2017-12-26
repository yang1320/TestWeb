import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;





public class TestDateFormat {
	public static void main(String[] args) {
		Object obj=null;
		System.out.println(String.valueOf(obj));
		System.out.println(obj.toString());
		System.out.println((HashMap<String,Object>)null);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhh24mm");
		System.out.println(sdf.format(new Date()));
		
//		String requestTime = DateUtil.getDateFormat(new Date(),"yyyyMMddHHmmss");
//		System.out.println(requestTime);
//		（yyyyMMddhh24mmss），如requestTime=20160701172420

	}
	

}
//20160701172420
//2017112402240638
//
//20161015150432
//
//"requestTime": "20161015150432", 	
