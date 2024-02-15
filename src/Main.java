import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //giving Scanner a name

        boolean going = true; //looping variable

        System.out.println("What is the length of one side of your rectangle?"); //asking for length

        do {
            if (in.hasNextDouble()) //testing if there is a double
            {
                double length = in.nextDouble(); //defining variable length

                System.out.println("What is the width of one side of your rectangle?"); //asking for width
                if (in.hasNextDouble()) { //testing for a double
                    double width = in.nextDouble(); //defining variable width

                    double area = (length * width); //finding area

                    double perimeter = (length * 2) + (width * 2); //finding perimeter

                    double c = Math.pow(length, 2) + Math.pow(width, 2); //finding diagonal length

                    System.out.println("The area of your rectangle is " + area + ",the perimeter is " + perimeter + ", and the length of the diagonal through the rectangle is " + Math.sqrt(c)); //outputting final result
                    
                    going = false; //ending loop
                }
	            else if (!in.hasNextDouble()) { //user inputted wrong number
                    String trash = in.nextLine(); //trash variable

                    System.out.println(trash + "is not a number! Try again !"); //telling user their mistake
                }
else if (!in.hasNextDouble()) //user inputted wrong number
                    {
                        String trash = in.nextLine(); //trash variable

                        System.out.println(trash + " is not an number !Try again !");  //telling user their mistake
                    }



                }
        } while (going); //loops while going = true
    }

}
