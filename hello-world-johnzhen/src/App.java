import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//version 1.10-- zhiyizhen
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc-development 1.10");
		DateFormat formatter;
		Date saleDateFrom = new Date();
		Date saleDateTo = new Date();
		formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			saleDateFrom = (Date) formatter.parse("01-01-2011");
			saleDateTo = (Date) formatter.parse("01-08-2011");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
