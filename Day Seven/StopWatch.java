public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int[] numbers = { 12, 7, 9, 13, 11, 19, 8, 3, 1, 10 };

        // before sort
        System.out.println("Before sort");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // do a selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            int smallestNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallestNumber;
        }

        // After sort
        System.out.println("After selection sort");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        stopWatch.stop();

        System.out.println();

        System.out.print("This operation took ");
        System.out.print(stopWatch.getElapsedTime() + " milliseconds");
        System.out.println();
    }
}
