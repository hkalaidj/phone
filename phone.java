package stringdemo3;
import java.util.Scanner;
public class phone {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
				
		System.out.print("Enter a letter : ");
		String c=input.nextLine();
		String x= c.toLowerCase();
		if (x.contains("a")||x.contains("b")||x.contains("c"))
			System.out.println("the corresponding number is 2");
		else if (x.contains("d")||x.contains("e")||x.contains("f"))
			System.out.println("the corresponding number is 3");
		else if (x.contains("g")||x.contains("h")||x.contains("i"))
			System.out.println("the corresponding number is 4");
		else if (x.contains("j")||x.contains("k")||x.contains("l"))
			System.out.println("the corresponding number is 5");
		else if (x.contains("m")||x.contains("n")||x.contains("o"))
			System.out.println("the corresponding number is 6");
		else if (x.contains("p")||x.contains("q")||x.contains("r")||x.contains("s"))
			System.out.println("the corresponding number is 7");
		else if (x.contains("t")||x.contains("u")||x.contains("v"))
			System.out.println("the corresponding number is 8");
		else if (x.contains("w")||x.contains("x")||x.contains("y")||x.contains("z"))
			System.out.println("the corresponding number is 9");
		else
			System.out.println(c+" is an invalid input ");
	}
	

}
