package ���Ҳ���;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MathTest {
	public static void main(String[] args) {
		double i = 65.6261;
		long j= Math.round(i);//�����������������
		double a= Math.floor(i);//����С�ڲ������������
		double b=Math.ceil(i);	//���ش��ڲ�������С����
		double x =Math.random();//����[0��1)֮��������������
		System.out.println("j="+j+"  a="+a+"  b="+b+"  x="+x);
		
		//ʱ�䣺��һ
		Calendar  c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("��ǰ���ڞ飺"+year+"-"+month+"-"+day+"   "+hour+":"+minute+":"+second);
		
		System.out.println();
		
		//����
		Calendar  time= Calendar.getInstance();
	 	Date date = time.getTime();
	 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 	String now = sdf.format(date);
		System.out.println("��ǰʱ�䣺" + now);
	}
}