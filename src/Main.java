public class Main {
    public static void main(String[] args) {
        int numbers[] = {47,75,14,2,97};

        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);



        int n = numbers.length;
        int smallest1 = Integer.MAX_VALUE;
        // traversing the array to find
        // smallest element.
        for (int i = 0; i < n; i++) {
            if (numbers[i] < smallest1) {
                smallest1 = numbers[i];
            }
        }
        System.out.println("smallest element is: "
                + smallest1);

        int second_smallest = Integer.MAX_VALUE;

        // traversing the array to find second smallest
        // element
        for (int i = 0; i < n; i++) {
            if (numbers[i] < second_smallest
                    && numbers[i] > smallest) {
                second_smallest = numbers[i];
            }
        }
        System.out.println("second smallest element is: "
                + second_smallest);

        System.out.println(calculateNumbers(1,2));;

    }
    public static double calculateNumbers(double numX, double numY) {
        return Math.pow(numX,2) + Math.pow(((4*numY)/5) -numX, 2);
    }
}




