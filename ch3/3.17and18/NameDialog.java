// fig 3.18
// this class is use to take input form user in dialogbox
// and show the output in dailogbox

// import library strat
import javax.swing.JOptionPane;
// import library end
public class NameDialog { // class body start
	
	public static void main(String[] args){
		
		// promtbox to enter value by user
		String name = JOptionPane.showInputDialog("what is your name ???");
		
		//formating string 
		String message = String.format("welcome %s to java programing", name);
		
		//displaying message in dialogbox
		JOptionPane.showMessageDialog(null , message);
	}
	
}// class body end