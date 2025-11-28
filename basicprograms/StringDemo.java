package basicprograms;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Selenium";
		s=s+"Training";
		System.out.println(s);
		String s1="Hello";
		System.out.println("Length of the string is: "+s1.length());
		System.out.println("Character at index 2: " + s1.charAt(2));
		String s2 = "hello";
        System.out.println(s1.equals(s2));            
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        String data="Hi,Hello,How,Are,You";
        String words[]=data.split(",");
        for(String f:words) {
        	System.out.println(f);
        	
        //frequency of the characters
        
        }
	}

}
