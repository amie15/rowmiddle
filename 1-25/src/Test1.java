import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1{
	public static void main(String[] args){
		//改行
		System.out.println("問１");
		//問題1:下記条件になるようログの出力を行いなさい。
		
		//条件１　例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		//条件２　"middleskill log"という名前のログのインスタンスを生成する事
		//条件３　srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
		//条件４　ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
		//条件５　格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
		

		Logger middleskill = Logger.getLogger("middleskill log");

		middleskill.setLevel(Level.CONFIG);	
		
		try {
			
//			ConsoleHandler src = new ConsoleHandler();
//			middleskill.addHandler(src);
//			
//			FileHandler src = new FileHandler();
//			src.setFormatter(new SimpleFormatter());
//			middleskill.addHandler(src);
			middleskill.setLevel(Level.INFO);
//            LogManager manager = LogManager.getLogManager();
//            manager.readConfiguration(new FileInputStream("logging.properties"));
			
			throw new NullPointerException();
			
		}catch(NullPointerException e){
			
			middleskill.log(Level.INFO,"ミドルスキルログが発生しました。", e);
 
		}
		
	}
}

