import java.util.Random;

public class Crack{
	public static int FROM_ZERO = 48;
	public static int TO_NINE = 57;
	public static int FROM_A = 65;
	public static int TO_Z = 90;
	public static int FROM_a = 97;
	public static int TO_z = 122;
	public static int SIZE1 = 62;
	public static char[] c = new char[SIZE1];
	public static int WEISHU = 10;
	
	public static void main(String[] args){
		Crack crack = new Crack();
		crack.Char(c);
		String sec = crack.getString(WEISHU);
		System.out.println(sec);
		String sec1 = "";
		for(int x = 0; x < WEISHU; x++){
			for(int y = 0; y < SIZE1; y++){
				if(sec.charAt(x) == c[y]){
					System.out.println("匹配到了第" + (x+1) + "位密码：" + c[y]);
					sec1 += c[y];
				}
				continue;
			}
		}
		System.out.println("密码破解了：" + sec1);
	}
	
	public static void Char(char[] c){
		for(int i = FROM_ZERO,j = 0; i < TO_NINE+1; i++, j++)
			c[j] = (char)i;

		for(int x = FROM_A, y = 10; x < TO_Z+1; x++, y++)
			c[y] = (char)x;
		
		for(int a = FROM_a, b = 36; a < TO_z+1; a++, b++)
			c[b] = (char)a;
	}
	
	public String getString(int num){
		String str = "";
		for(int j = 0; j < num; j++)
			str += Character.toString(c[new Random().nextInt(SIZE1)]);
		return str;
	}
}