package 自我测试;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MathTest {
	public static void main(String[] args) {
		double i = 65.6261;
		long j= Math.round(i);//返回四舍五入的整数
		double a= Math.floor(i);//返回小于参数的最大整数
		double b=Math.ceil(i);	//返回大于参数的最小整数
		double x =Math.random();//返回[0，1)之间的随机数浮点数
		System.out.println("j="+j+"  a="+a+"  b="+b+"  x="+x);
		
		//时间：法一
		Calendar  c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("当前日期為："+year+"-"+month+"-"+day+"   "+hour+":"+minute+":"+second);
		
		System.out.println();
		
		//法二
		Calendar  time= Calendar.getInstance();
	 	Date date = time.getTime();
	 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 	String now = sdf.format(date);
		System.out.println("当前时间：" + now);
	}
}