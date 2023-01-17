import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println("Enter the number you want to search in the array.");
        int wanted = scan.nextInt();


        boolean isThere = false;

        for (int number : numbers) {
            if (number == wanted) {
                isThere = true;
                break;
            }

        }
        if (isThere == true ) {
            System.out.println("The number is in the array. ");
        }else{
            System.out.println("The number not in array.");
        }

    }
}
