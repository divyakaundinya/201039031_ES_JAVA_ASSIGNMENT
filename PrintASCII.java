public class PrintASCII
{
	public static void main(String args[]){
		int ch = 'A';
		while(ch <= 'Z'){
			char letter = (char)ch;
			System.out.println(letter+" : "+ch);
			ch = ch + 1;
		}
		ch = '0';
		while(ch <= '9'){
			char letter = (char)ch;
			System.out.println(letter+" : "+ch);
			ch = ch + 1;
		}
		ch = 'a';
		while(ch <= 'z'){
			char letter = (char)ch;
			System.out.println(letter+" : "+ch);
			ch = ch + 1;
		}
	}
}