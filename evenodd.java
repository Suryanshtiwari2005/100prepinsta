

public class evenodd {
    public static void main(String[] args) {

        int number = 39;
//Brute Approach
//
//        if(number % 2 == 0) System.out.println("Number is even");
//        else System.out.println("Number is Odd");

        //ternery operator
//        String system = (number % 2 == 0) ?"Even":"Odd";
//        System.out.println("Number is "+ system);

        //bitwise operator
        if (isEven(number)) System.out.println("Number is Even");
        else System.out.println("Number is Odd");
    }

    static Boolean isEven(int number)
    {
        return (number&1) == 0;
    }
}


