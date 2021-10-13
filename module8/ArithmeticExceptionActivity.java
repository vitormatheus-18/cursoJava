import javax.swing.JOptionPane;

public class ArithmeticExceptionActivity {
	//1 - Type main method and call catchMe with 10 and 0
	public static void main(String[] args) {
		catchMe(6,0);
		catchMe(10, 2);
	}

	static void catchMe(int num1, int num2)
	{
	
		try {
			int result=num1/num2;
            JOptionPane.showMessageDialog(null, "Result: " + result, "FINISH", JOptionPane.PLAIN_MESSAGE);
		} catch(ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "Cannot divide by 0", "ERROR" , JOptionPane.ERROR_MESSAGE);
		} finally {

            JOptionPane.showMessageDialog(null, "Thank you for using this program", "FINISH", JOptionPane.PLAIN_MESSAGE);
		}
		 
		
	}

}