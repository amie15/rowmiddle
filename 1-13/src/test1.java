//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//public class test1 {
//	public static void main(String[] args) {
//		//改行
//		System.out.println("問１");
//		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
//		//		例）
//		//		for() {
//		//			for() {
//		//				for() {
//		//					
//		//				}
//		//			}
//		//		}
//		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
//		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
//		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
//		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
//		List<String> strArray2 = new ArrayList<String>();
//		List<String> strArray3 = new ArrayList<String>();
//		List<String> strArray4 = new ArrayList<String>();
//
//		for(int i = 2; i < strArray1.size(); i++) {
//
//			strArray2.add(strArray1.get(i));
//
////			if(i == (strArray1.size() - 1)) {
//
//				for(int a = i-2; a < strArray2.size(); a++) {
//					//			for(String str2 : strArray2) {
//
//					if(strArray2.get(a) == "k" || strArray2.get(a) == "a" || strArray2.get(a) == "o") {
//						strArray3.add(strArray2.get(a));
//					
////						if(a == (strArray2.size() - 1)) {
//
//							for(int b = 0; b < strArray3.size(); b++) {
//
//								if( b == 0 || b == 4 || b ==5 || b == 6 || b == 11) {
//									strArray4.add(strArray3.get(b));
//								}
////								else if(strArray3.get(b) == "a" && b == 1) {
////									strArray4.add(strArray3.get(b));
////								}
////
////								else if(strArray3.get(b) == "k" && b == 2) {
////									strArray4.add(strArray3.get(b));
////								}
////
////								else if(strArray3.get(b) == "a" && b == 3) {
////									strArray4.add(strArray3.get(b));
////								}
////
////								else if(strArray3.get(b) == "o" && b == 5){
////									strArray4.add(strArray3.get(b));
////								}
//							
//
////						}
//					}
//
//				}
//			}
//		}
//
//
//		System.out.println(strArray4.toString());
//
//	}
//}
//
//



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
//		例）
//		for() {
//			for() {
//				for() {
//					
//				}
//			}
//		}
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();
		
		for(int i = 2; i < strArray1.size(); i++) {

			strArray2.add(strArray1.get(i));
			
			if(i == (strArray1.size() - 1)) {
		
			for(int a = 0; a < strArray2.size(); a++) {
//			for(String str2 : strArray2) {
				
				if(strArray2.get(a) == "k" || strArray2.get(a) == "a" || strArray2.get(a) == "o") {
					strArray3.add(strArray2.get(a));
					
					if(a == (strArray2.size() - 1)) {
				
						for(int b = 0; b < strArray3.size(); b++) {
							
							if(strArray3.get(b) == "k" && b == 0 ) {
								strArray4.add(strArray3.get(b));
							}
								else if(strArray3.get(b) == "a" && b == 1) {
									strArray4.add(strArray3.get(b));
								}

								else if(strArray3.get(b) == "k" && b == 2) {
									strArray4.add(strArray3.get(b));
								}

								else if(strArray3.get(b) == "a" && b == 3) {
									strArray4.add(strArray3.get(b));
								}
								
								else if(strArray3.get(b) == "o" && b == 5){
									strArray4.add(strArray3.get(b));
								}
						}
						
				}
				}
				
			}
			}
		}
		

		System.out.println(strArray4.toString());
		
	}
}

