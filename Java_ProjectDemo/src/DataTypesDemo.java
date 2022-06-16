
public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primitives
		boolean flagSet = false;//0 or 1
		System.out.println("boolean flagSet ="+flagSet);
		
		byte range;//-128 to 127
		range = 127;
		
		System.out.println("byte range ="+range);
		
		
		short temperature;//-32768 to 32767
		temperature = -200;
		System.out.println("short temperature ="+temperature);
		
		
		int val = -425550;//-2^31 to 2^31-1(32bit)
		System.out.println("int val ="+val);
		
		
		long testlg = -43322000000L;//-2^63 to 2^63-1
		System.out.println("long testlg ="+testlg);
		
		char c ='t';// 1 bit (16 bit)
		System.out.println("char  c ="+c);
		
		
		String strLetter = "Java Programming";//Non Primitive Types
		System.out.println("String  strLetter ="+strLetter);
		
		
	}

}
