import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();
        
        char[] arr = new char[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextLine().charAt(0);
        }
        
        int K = scanner.nextInt();
        
        int maxThievesCaught = maxThieves(arr, K);
        
        System.out.println("Maximum thieves caught: " + maxThievesCaught);
        
        scanner.close();
    }

    private static int maxThieves(char[] arr, int K) {
        List<Integer> policemen = new ArrayList<>();
        List<Integer> thieves = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                policemen.add(i);
            } else if (arr[i] == 'T') {
                thieves.add(i);
            }
        }
        
        int i = 0, j = 0;
        int count = 0;
        
        while (i < policemen.size() && j < thieves.size()) {
            if (Math.abs(policemen.get(i) - thieves.get(j)) <= K) {
                count++;
                i++;
                j++;
            } else if (policemen.get(i) < thieves.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        
        return count;
    }
}
