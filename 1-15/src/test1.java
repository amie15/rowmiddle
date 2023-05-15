import java.util.Arrays;
import java.util.Comparator;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		
		q1 (5,10);
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		q2 ("しんぶんし");
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		Toi3.q3(i);
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		Toi4.q4(k);
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	
	public static void q1(int num1 ,int num2) {
		int num3 = num1 + num2;
		System.out.println(num3);
	}
	
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	
	public static void q2(String kaibun) {
		
		String result = new StringBuilder(kaibun).reverse().toString();
		
//
//		System.out.println(kaibun);
//		System.out.println(result);
		System.out.println(result.equals(kaibun));
//		if (result == kaibun) {
//			System.out.println("この文字列は回文です");
//		}
//		
//		else {
//			System.out.println("この文字列は回文ではありません");
//		}
//		
	}
	
	
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)

	class Toi3{
		static void q3(Integer[] a) {
			Arrays.sort(a, Comparator.reverseOrder());
			System.out.println( Arrays.toString(a));
		}
	}
	
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	class Toi4{
		static void q4(int[] b) {
			int n = 0;
			for(int i =0; i<b.length; i++) {
				if(b[i]==0) {
					n = i;
				}
				else if(b[i]<b[n]) {
					n = i;
				}
				
			}
			System.out.println(n);
		}
	
	}
	
}


