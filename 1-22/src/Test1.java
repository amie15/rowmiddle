import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください

        Date date = new Date();
        System.out.println(date);
        
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。

        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date sb = sd.parse(shinyaBirthday);

            Date mb = sd.parse(minamiBirthday);
            
            boolean bl;
            bl = sb.before(mb);
            
            boolean bl2;
            bl2 = mb.before(sb);
            
            if(bl == true) {

                String str = new SimpleDateFormat("yyyy/MM/dd").format(sb);
            	System.out.println(str);
            }
            else if (bl2 == true) {

                String str1 = new SimpleDateFormat("yyyy/MM/dd").format(mb);
            	System.out.println(str1);
            }
            
        } catch(ParseException e) {
            e.printStackTrace();
        }
       
      
        	
        
        
		
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい]
		
		try {
			Date fb =sd.parse(furuyamaBirthday);

	        Calendar cl = Calendar.getInstance();

	        cl.setTime(fb);
	        
	        cl.add(Calendar.YEAR, +5);
	        cl.add(Calendar.MONTH, +2);
	        
	        fb = cl.getTime();

            String str3 = new SimpleDateFormat("yyyy/MM/dd").format(fb);
            System.out.println(str3);
	        

		}catch(ParseException e) {
            e.printStackTrace();
        }
       
      

		
	}
}


