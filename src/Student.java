import java.awt.Component;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.Icon;

public class Student implements Icon {

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values division");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a/b;

        System.out.println("Quotient of "+a+" and "+b+" is "+s);

	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform addition");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a+b;

        System.out.println("Sum of "+a+" and "+b+" is "+s);
		return 0;
	}

	@Override
	public int getIcon() {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform substraction");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a-b;

        System.out.println("Difference of "+a+" and "+b+" is "+s);
		return 0;
	}
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values to perform substraction");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a-b;

        System.out.println("Difference of "+a+" and "+b+" is "+s);
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.add();
		s1.sub();
		s1.mul();
	s1.div();
	}

}
