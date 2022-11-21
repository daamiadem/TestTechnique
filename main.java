import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Dimension de la grille :");
	    System.out.println("x=");
	    int x = myObj.nextInt();  
	    System.out.println("y=");
	    int y = myObj.nextInt();
	    System.out.println("Position initiale de l’aspirateur :");
	    System.out.println("x=");
	    int xi = myObj.nextInt();  
	    System.out.println("y=");
	    int yi = myObj.nextInt();
	    System.out.println("orientation=");
	    String O = myObj.next();
	    System.out.println("Instructions :");
	    String Ii = myObj.next();
	    
	    for (int i =0 ;i<Ii.length();i++) {
	    	if (Ii.charAt(i)=='A') {
	    		if (O.equals("N")) {
	    			yi=yi+1;
	    		}
	    		else if (O.equals("E")) {
	    			xi=xi+1;
	    		}
	    		else if (O.equals("W")) {
	    			xi=xi-1;
	    		} 
	    		else if (O.equals("S")) {
	    			yi=yi-1;
	    		}
	    	}
	    	else if (Ii.charAt(i)=='D') {
	    		if (O.equals("N")) {
	    			O="E";
	    		}
	    		else if (O.equals("E")) {
	    			O="S";
	    		}
	    		else if (O.equals("W")) {
	    			O="N";
	    		}
	    		else if (O.equals("S")) {
	    			O="W";
	    		}
	    	}
	    	else if (Ii.charAt(i)=='G') {
	    		if (O.equals("N")) {
	    			O="W";
	    		}
	    		else if (O.equals("E")) {
	    			O="N";
	    		}
	    		else if (O.equals("W")) {
	    			O="S";
	    		}
	    		else if (O.equals("S")) {
	    			O="E";
	    		}
	    	}
	    }
	    System.out.println("x="+xi+" y="+yi+" orientation="+O);
	    
	    
	    
	    
	}

}
