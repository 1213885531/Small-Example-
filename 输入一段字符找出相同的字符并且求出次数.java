package 自我测试;

import java.util.*;
public class FindIndex{
		public static void main(String[] args) {
			System.out.println("请输入你要判断的字符串:");
			int a,b,d,temp,max=0;
			char arr='a';
			Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			
			for(a = 0; a<str.length(); a++)
		{
					int c=0;
			for(b=0;b<str.length();b++)
			{
				if(str.charAt(a) == str.charAt(b))
					{
						c++;
					}
					if(max < c)
					{
						max=c;
						arr=str.charAt(a);
					}
			}				
		}
			System.out.println( "该字符是:"+arr+ "  最大次数为:"+max);
			
		System.out.print("下标为：");
		for(d=0;d<str.length();d++){
			if(str.charAt(d)==arr){
				
				System.out.print( d+1 +" ");
			}
		}
}
}