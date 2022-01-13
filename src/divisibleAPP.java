import javax.swing.JOptionPane;
public class divisibleAPP {

	public static void main(String[] args) {
		
	String var1=JOptionPane.showInputDialog("Introduce un número ");
	System.out.println("El número introducido es "+var1);
	//Pasamos el String a int
	int num1=Integer.parseInt(var1);
	//Comprovamos si es divisible entre 2, si el resto es 0
	if (num1%2==0) {
		System.out.println("El número "+num1+" es divisible entre 2");
	}
	else {
		System.out.println("El número "+num1+" NO es divisible entre 2");
	}
	}
}
