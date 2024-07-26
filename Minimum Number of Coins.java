import java.util.*;

public class Main
{
    static Scanner s = new Scanner(System.in);
    
	public static void main(String[] args) {
        int amt = s.nextInt();
        
        CalculateDenominations(amt);
	}
	
	static int FindDenomination(int amt) {
	    int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

	    for(int denomination : denominations) {
	        if(denomination <= amt) {
	            return denomination;
	        }
	    }
	    return 0;
	}
	
	static void CalculateDenominations(int amt) {
	    while(amt > 0) {
	        int possible_denomination = FindDenomination(amt);
	        System.out.print(possible_denomination + "  ");
	        amt = amt - possible_denomination;
	    }
	}
}
