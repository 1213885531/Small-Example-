package ���Ҳ���;

import java.util.*;
public class FindIndex{
		public static void main(String[] args) {
			System.out.println("��������Ҫ�жϵ��ַ���:");
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
			System.out.println( "���ַ���:"+arr+ "  ������Ϊ:"+max);
			
		System.out.print("�±�Ϊ��");
		for(d=0;d<str.length();d++){
			if(str.charAt(d)==arr){
				
				System.out.print( d+1 +" ");
			}
		}
}
}