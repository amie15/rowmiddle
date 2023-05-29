import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		//Ctrl + Shift + R
        
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		//Alt + Shift + V or R or T
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		//ブレークポイントの設定
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
		//言語機能、API
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、
		//入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		Scanner scn1 = new Scanner(System.in);
		int n;
		int t ;
		System.out.print("入場者数を入力してください　＝ ");
		n = scn1.nextInt();
		if(n < 10) {
			t = 1000*n;
		}
		else if(n<20) {
			t = 820 * n;
		}
		else {
			t = 700 * n;
		}
		
		System.out.println("入場料は" + t + "円です。");
		
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		//scannerで得点を入力し入力された数値をint型のscore配列に順に格納していく
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}


			//score配列の中身を順に足して特典の合計をint型のsumに格納
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			//得点合計のsumを得点の回数（score.length)で割って平均値を計算 double型のaveに格納
			ave = sum / (double)score.length;
			//得点の平均値を出力
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
		Logger logger = Logger.getLogger("checkTest log");

        String path =  System.getProperty("user.dir"); path = new File(path, "checktest.log").getPath();

		logger.setLevel(Level.CONFIG);	
//        
        System.out.println(path);
		String message = "Hello World!";

		try {
		
		FileHandler fh = new FileHandler("checktest.log");
        logger.addHandler(fh);

        fh.setFormatter(new java.util.logging.SimpleFormatter());
        logger.addHandler(fh);

		logger.setLevel(Level.INFO);

		throw new NullPointerException();

		}catch(NullPointerException | SecurityException | IOException e){

			logger.log(Level.INFO,"The message is: " + message, e);
			
		}

		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。
		//ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）

        
        try{
    		Scanner scn2 = new Scanner(System.in);
            String str ;
            System.out.print("整数を入力してください　= ");

    		str = scn2.nextLine();
    		
            int number = Integer.parseInt(str);
            System.out.println(number); // output = 25
            
        }
        catch(NullPointerException e){
			System.out.println("nullです。");
		}
        catch (NumberFormatException e2){
            System.out.println("変換できません");
        }
        catch(Exception e3) {
            System.out.println("Exceptionが発生しました。");
            
        }
		    
		
		
		
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//チェックテスト問８がわかりませんでした。
		//調べながらですが進めることができてよかったです。
		//基本的な所だと思うので、調べなくてもコード描けるようになりたいと思います。』
	}
}
