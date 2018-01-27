import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class RandomString{
	public static int FROM_ZERO = 48;
	public static int TO_NINE = 57;
	public static int FROM_A = 65;
	public static int TO_Z = 90;
	public static int FROM_a = 97;
	public static int TO_z = 122;
	public static int SIZE1 = 62;
	public static int SIZE2 = 8;
	
	
	public static void main(String[] args){
		char[] c = new char[SIZE1];
		String[] al = new String[SIZE2];
		for(int i = FROM_ZERO,j = 0; i < TO_NINE+1; i++, j++)
			c[j] = (char)i;

		for(int x = FROM_A, y = 10; x < TO_Z+1; x++, y++)
			c[y] = (char)x;
		
		System.out.println();
		for(int a = FROM_a, b = 36; a < TO_z+1; a++, b++)
			c[b] = (char)a;
		
		Scanner in = new Scanner(System.in);
		System.out.print("你想得到几位的随机字符串？");
		int value = in.nextInt();
		for(int num = 0; num < SIZE2; num++){
			String s2 = "";
		for(int d = value; d > 0; d--){
			int r = new Random().nextInt(SIZE1);
			String s1 = Character.toString(c[r]);
			s2 += s1;
		}
		al[num] = s2;
		}
		ArrayList<String> a = new ArrayList<String>(SIZE2);
		for(int h = 0; h < SIZE2; h++)
			a.add(al[h]);
		a.sort(new Comparator<String>(){
			public int compare(String s1, String s2){
				return s1.compareToIgnoreCase(s2);
			}
		});
		System.out.println(a);
	System.out.println();
		for(int e = 0; e < SIZE2 - 1; e++){
			for(int f = e + 1; f < SIZE2; f++){
				if((al[e].compareToIgnoreCase(al[f])) > 0){
					String temp = al[e];
					al[e] = al[f];
					al[f] = temp;
				}
			}
		}
		for(int g = 0; g < SIZE2; g++){
			System.out.print(al[g]);
			if(g == 7){
				System.out.println();
				
			}else{
				System.out.print(",\t");
			}
		
		}
	}
}