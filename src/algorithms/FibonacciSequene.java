package algorithms;

import javax.swing.JOptionPane;

public class FibonacciSequene {
	int a = 0;
	int b = 1;
	int c = 0;
	public static void main(String[] args) {
		FibonacciSequene fb = new FibonacciSequene();
		String number = JOptionPane.showInputDialog("How many numbers of the Fibonacci Sequence dp you want to print?");
		int num = Integer.parseInt(number);
		System.out.println("0 \n1");
		for (int i = 0; i < num; i++) {
			fb.Sequence();
		}
		
	}
	FibonacciSequene(){
		
	}
	public void Sequence(){
		c = a + b;
		System.out.println(""+c);
		a = b;
		b = c;
	}
}
