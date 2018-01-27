import java.util.Scanner;

public class CharSet{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入一段字符：");
		String str = in.nextLine();
		char[] c = str.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(Character.isUpperCase(c[i]))
				System.out.print(c[i]);
			else if(Character.isDigit(c[i]))
				System.out.print(c[i]);
		}
		System.out.println();
		String str2 = "";
		System.out.println(str2.length());
		System.out.println(Short.MAX_VALUE);
	}
}