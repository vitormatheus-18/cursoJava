import javax.swing.JOptionPane;

public class TryCatchFinallyActivity {
    	//Needs to be completed
	//The following program, when run, results in an exception.
	//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 
	public static void main(String[] args) {
		catchMeIfYouCan();
	}

	static void catchMeIfYouCan()
	{
		try {
			int [] arr={0,1,2,3,4,5,6,7,8,9};
		
			for(int i=0;i<=10;i++)
			{
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "The number of iterations that are looped is greater than the size of this array.", "ERROR" , JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "for(int i = 0; i < 10; i++)", "Correct to:", JOptionPane.PLAIN_MESSAGE);
		}
		
		
		
		
		System.out.println("This should get printed even if there is an exception");
		
	}
}
