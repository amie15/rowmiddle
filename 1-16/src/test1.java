public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:新しいBankAccountインスタンス：「yamada」を作成し、名前(山田)と初期残高(10万円)を設定し「残高」を出力してください。
		BankAccount yamada = new BankAccount("山田", 100000.0);
		double b = yamada.getBalance();
		System.out.println(b);
	
		//改行
		System.out.println("問２");
		//問題2:BankAccountインスタンス「yamada」の残高3万円を預金して「残高」を出力してください。
		
		yamada.deposit(30000.0);
		double deposit1 = yamada.getBalance();
		System.out.println(deposit1);
		
		//改行
		System.out.println("問３");
		//問題3:BankAccountインスタンス「yamada」の残高より8万円引き落として「残高」を出力してください。
		
		yamada.withdraw(80000.0);
		double withdraw1 = yamada.getBalance();
		System.out.println(withdraw1);
		
		
		//改行
		System.out.println("問４");
		//問題4:新しいPersonインスタンス：「sato」を作成し、名前(佐藤)、年齢(25)、性別(男性)を設定し「性別」を出力してください。
		
		Person sato = new Person("佐藤",25,"男性");
		String boy = sato.getGender();
		System.out.println(boy);
		
		//改行
		System.out.println("問５");
		//問題5:Personインスタンス：「sato」の年齢を変更しようとして「無効な年齢です１」と出力させてください。
		
		sato.setAge(-9);
		
		//改行
		System.out.println("問６");
		//問題6:Personインスタンス：「sato」の性別を「男性」→「女性」に変更して性別を出力してください。
		
		sato.setGender("女性");

		String girl = sato.getGender();
		System.out.println(girl);
		
	}

		// TODO 自動生成されたメソッド・スタブ
		
	}

