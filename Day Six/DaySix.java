import java.util.Scanner;

public class DaySix {
    private int[] list = { 12, 28, 30, 40, 44 };
    private int start = 0; 
    private int end = list.length -1;

    /**
     * 
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * 
     * @return end 
     */
    public int getEnd() {
        return end;
    }

    /**
     * 
     * @param target
     * @param start
     * @param end
     * @return -1 if the target is not found else return the found target
     */
    int binarySearch(int target, int start, int end) {
        int middle;

        if (end < start) {
            return -1;
        }

        middle = (start + end) / 2;
        
        if (list[middle] > target) {
            return binarySearch(target, start, middle - 1);
        } else if (list[middle] < target) {
            return binarySearch(target, middle + 1, end);
        } else {
            return list[middle];
        }
    }

    /**
     * 
     * @param input
     * @return true if the input is found
     */
    boolean checkInput(int input) {
        int res = binarySearch(input, start, end);
        return res != -1;
    }

    /**
     * Driver function
     * 
     * @param args
     */
    public static void main(String[] args) {
        boolean isInputValid;
        int target;
        Scanner scanner = new Scanner(System.in);
        DaySix daySix = new DaySix();

        do {
            // display all the values in the list
            for (int i = (daySix.list.length - 1); i >= 0; --i) {
                System.out.print(daySix.list[i] + " ");
            }

            System.out.println();

            System.out.println("Choose a number from the above list to return their actual positions");

            // store the user input in target
            target = scanner.nextInt();

            // call checkInput function to show if the number is valid or not
            isInputValid = daySix.checkInput(target);
        } while (!isInputValid);

        int result = daySix.binarySearch(target, daySix.getStart(), daySix.getEnd());

        if (result != -1) {
            System.out.println("Number is found");
        } 

        scanner.close();
    }
}