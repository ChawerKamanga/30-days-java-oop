import java.util.Scanner;

public class DayFive {
    private int[] list = { 12, 28, 30, 40, 44 };

    /**
     * 
     * @param value
     * @return -1 if value is not found in the searched sorted array 
     */
    int binarySearch(int value) {
        int first = 0, last = list.length - 1, middle, position = -1;
        boolean isFound = false;

        while (!isFound && first <= last) {
            middle = (first + last) / 2;
            if (list[middle] == value) {
                isFound = true;
                position = middle;
            } else if (list[middle] > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return position;
    }

    /**
     * 
     * @param input
     * @return true if the input is found
     */
    boolean checkInput(int input) {
        int res = binarySearch(input);
        return res != -1;
    }

    public static void main(String[] args) {
        boolean isInputValid;
        int target;
        Scanner scanner = new Scanner(System.in);
        DayFive dayFive = new DayFive();

        // if the user does not enter the correct input they will be stuck in this do while loop forever
        do {
            // display all the values in the list
            for (int i = (dayFive.list.length - 1); i >= 0; --i) {
                System.out.print(dayFive.list[i] + " ");
            }

            System.out.println();

            System.out.println("Choose a number from the above list to return their actual positions");

            // store the user input in target
            target = scanner.nextInt();

            // call checkInput function to show if the number is valid or not
            isInputValid = dayFive.checkInput(target);
        } while (!isInputValid);

        int result = dayFive.binarySearch(target);

        if (result != -1) {
            System.out.println("Number is found at index " + result);
        }

        scanner.close();
    }
}