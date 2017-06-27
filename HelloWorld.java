
class Hello
{
	String str;
	Hello(String str)
	{
		this.str = str;
	}

	void print()
	{
		System.out.println("Hello my name is: " + str);
	}
}

public class HelloWorld {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      //System.out.println("Hello, World");

		Hello h = new Hello("sagar");
		h.print();
   }
}
