import java.util.Scanner;
import java.util.LinkedList;
import java.time.Duration;
import java.time.Instant;


public class Menu {
    public static void main(String[] args){
        Menu.menu();
    }
    public static void menu() {


        String[] list = new String[] {"Option 1: Week 0 Challenge 2", "Option 2: Week 0 Challenge 3", "Option 3: Week 1 Challenge 1", "Option 4: Week 1 Challenge 2", "Option 5: Week 1 Challenge 3", "Option 6: Week 2 Challenge 1", "Option 7: Week 3 Merge sort", "Option 8: Week 3 Bubble Sort", "Option 9: Week 3 Selection Sort", "Option 10: Week 3 Insertion Sort"};

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
            System.out.println("-------------------------\n");
        }

        System.out.println("Enter your choice:");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        try {
            System.out.println(list[Integer.parseInt(input)-1]);
        } catch (NumberFormatException e) {
            System.out.println("Add choice");
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Enter number between 1 and " + list.length);
        }

        if(input.equals("1")){
            System.out.println("placeholder for week 0 assignment 2");
        }

        if(input.equals("2")){
            double first = 1.2, second = 2.4;

            System.out.println("Before");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);

            double temporary = first;

            first = second;

            second = temporary;

            System.out.println("After");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
        if(input.equals("3")){
            System.out.println("Placeholder for week 1 assignment 1");
        }
        if(input.equals("4"))
        {
            System.out.println("Placeholder for week 1 assignment 2");
        }
        if(input.equals("5"))
        {
            Week2Practice3 bob=new Week2Practice3();
            bob.queue = new LinkedList<Integer>();
            bob.queue.add(13);
            bob.queue.add(120);
            bob.queue.add(303);
            bob.queue.add(209);
            bob.queue.add(543);

            bob.reversequeue();
            bob.Print();
        }
        if(input.equals("6")) {
            Calculator obj = new Calculator();
            System.out.println("This is a calculator in RPN. Have fun!"); // prompt user to input
            System.out.print("% ");
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                obj.evaluate(s);
                System.out.print("% ");
            }
        }
            if(input.equals("7")){

                int arr[] = {7,44,23,62,23,11,8,22};

                System.out.println("Before Merge Sort");
                for(int n=0;n<8;n++)
                {
                    System.out.print(arr[n]+ ", ");
                }
                Mergesort obj1=new Mergesort();

                obj1.sort(arr, 0, arr.length - 1);

                System.out.println("\nAfter Merge Sort");
                obj1.printArray(arr);
            }
        if(input.equals("8")){

            Bubblesort obj2=new Bubblesort();
            int arr[] ={7,44,23,62,23,11,8,22};

            System.out.println("Before Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int time = 0;
            final Duration timeElapsed;
            Instant start = Instant.now();
            obj2.bubbleSort(arr);//sorting array elements using bubble sort
            Instant end = Instant.now();    // time capture -- end
            timeElapsed = Duration.between(start, end);
            System.out.println();
            System.out.println("Nanoseconds: " + timeElapsed.getNano());
            time += timeElapsed.getNano();
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);
            System.out.println("After Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }
        if(input.equals("9"))
        {
            Selectionsort obj3=new Selectionsort();
            int[] arr1 = {7,44,23,62,23,11,8,22};
            System.out.println("Before Selection Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println();
            int time = 0;
            final Duration timeElapsed;
            Instant start = Instant.now();
            obj3.selectionSort(arr1);//sorting array using selection sort

            Instant end = Instant.now();    // time capture -- end
            timeElapsed = Duration.between(start, end);
            System.out.println();
            System.out.println("Nanoseconds: " + timeElapsed.getNano());
            time += timeElapsed.getNano();
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);

            System.out.println("After Selection Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
        }
        if(input.equals("10")){
            Insertionsort obj4=new Insertionsort();
            int[] arr1 = {7,44,23,62,23,11,8,22};
            System.out.println("Before Insertion Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println();
            int time = 0;
            final Duration timeElapsed;
            Instant start = Instant.now();
            obj4.insertionSort(arr1);//sorting array using insertion sort
            Instant end = Instant.now();    // time capture -- end
            timeElapsed = Duration.between(start, end);
            System.out.println();
            System.out.println("Nanoseconds: " + timeElapsed.getNano());
            time += timeElapsed.getNano();
            System.out.println("Total Nanoseconds: " + time );
            System.out.println("Total Seconds: " + time /1000000000.0);

            System.out.println("After Insertion Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
        }
    }
}
