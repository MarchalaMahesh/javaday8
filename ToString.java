package javaday8;

public class ToString {
	int a=10;
	int b=20;
public static void main(String[] args) {
	
	
	ToString t = new ToString();
	ToString t1 = new ToString();
	
	System.out.println(t);
	
	System.out.println(t.toString());
	
	System.out.println(t.equals(t1));
	
}

	
public String toString()
{
	return " "+" a = "+a+" "+" b = "+b;
}

}
