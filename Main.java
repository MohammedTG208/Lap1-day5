import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //i did not do it 3 and 11.
        Scanner input=new Scanner(System.in);
        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input
//        System.out.println("=== 1 ===");
//        Scanner calcou=new Scanner(System.in);
//        System.out.println("Enter 1st Number:");
//        int number1=calcou.nextInt();
//        System.out.println("Enter 2nd Number: ");
//        int number2=calcou.nextInt();
//        int sum=number1+number2;
//        int multiply=number1*number2;
//        int subtract=number1-number2;
//        int divide=number1/number2;
//        int mod=number1%number2;
//        System.out.println(number1+"+"+number2+"="+sum);//125+24=149
//        System.out.println(number1+"-"+number2+"="+subtract);//125X24=3000
//        System.out.println(number1+"x"+number2+"="+multiply);//125-24=101
//        System.out.println(number1+"/"+number2+"="+divide);// 125/24=5
//        System.out.println(number1+" mod "+number2+"="+mod);//125 mod 24=5

        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//        System.out.println("=== 2 ===");
//        System.out.println("Enter number to get multiplication:");
//        int num=input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("multiply "+num+" x "+i+"= "+(num*i));
//        }

        //3. Write a Java program to print the area and perimeter of a circle.
//        System.out.println("Enter Radius:");
//        double radius=input.nextDouble();
//        //3.14 x 5² (5 x 5)
//        double pi= 3.141592653589793;
//        double perimeter = 2 * pi * radius;
//        double area=pi * radius * radius;
//        System.out.println("perimeter: "+perimeter+"\narea: "+area);
        //4. Java program to find out the average of a set of integers
//        System.out.println("=== 4 ===");
//        System.out.println("Enter the count of numbers: ");
//        int count=input.nextInt();
//        int totale=count;
//        int intNum=0;
//        double getnumbers=0;
//        do {
//            System.out.println("Enter an integer:");
//            intNum=average.nextInt();
//            getnumbers+=intNum;
//            count--;
//        }while (count!=0);
//        System.out.println("The average is: "+getnumbers/totale);//The average is: 5.2

        //5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
//        System.out.println("=== 5 ===");
//        System.out.println("Input the first number :");
//        int first= input.nextInt();
//        System.out.println("Input the second number:");
//        int second= input.nextInt();
//        System.out.println("Input the third number");
//        int third=input.nextInt();
//        boolean isTrue=true;
//        if (first+second==third){
//            System.out.println("The result is: "+isTrue);
//        }else {
//            isTrue=false;
//            System.out.println("The result is: "+isTrue);
//        }
        //6. Write a Java program to reverse a word
//        System.out.print("Enter a Word: ");
//        String usertext=input.nextLine();
//        int index=usertext.length()-1;
//        String fullText="";
//        do {
//            fullText+=""+ usertext.charAt(index);
//           index--;
//
//        }while (index!=-1);
//        System.out.println("Input a word: "+usertext);//Input a word: dsaf
//        System.out.println("Reverse word: "+ fullText);//Reverse word: fasd
        //7 - Java program to check whether the given number is even or odd
//        System.out.println("=== 7 ===");
//        System.out.print("Enter a number: ");
//        int check=input.nextInt();//2
//        if(check%2==0){
//            System.out.println("The number is Odd");//true
//        }else {
//            System.out.println("The number is Even");
//        }
        //8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        System.out.println("=== 8 ===");
//        System.out.println("Enter temperature in Centigrade:");
//        int userTemp=input.nextInt();//43
//        double fahrenheit=(userTemp*1.8)+32;
//        System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);//Temperature in Fahrenheit is: 109.4

        //9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.
//        System.out.println("Input a string");
//        String uWord=input.nextLine();//mohammed tariq
//        System.out.println("input a number :");
//        int uNumber=input.nextInt();//7
//        System.out.println(uWord.charAt(uNumber));//d
        //10. Write a Java program to print the area and perimeter of a rectangle.
//        System.out.println("Enter what we need: ");
//        System.out.println("Width: ");
//        double width=input.nextDouble();
//        System.out.println("Height: ");
//        double height=input.nextDouble();
//        System.out.println("Area is "+width+" * "+height+" = "+(width*height));
//        System.out.println("Perimeter is "+2+" * "+"("+width+"+"+height+")"+" = "+2*(width+height));

        //11. Write a Java program to compare two number.
//        System.out.println("Input first integer:");
//        int number1=input.nextInt();
//        System.out.println("Input second integer:");
//        int number2=input.nextInt();
//            System.out.println(number1!=number2?number1+" != "+number2:"");
//            System.out.println(number1<number2?number1+" < "+number2:"");
//            System.out.println(number1<=number2?number1+" <= "+number2:"");


        //12. Write a Java program to convert seconds to hours, minutes and seconds
//        System.out.println("=== 12 ===");
//        System.out.println("Input seconds:");
//        int time=input.nextInt();
//        int hours =time/3600;
//        int minutes=hours*60/hours-1;
//        int seconds=minutes*60/minutes-1;
//        System.out.println(hours+":"+minutes+":"+seconds);

//        System.out.println(h+":"+m+":"+s);
        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.
//        System.out.println("=== 13 ===");
//        System.out.println("Input first number: ");
//        int fnumber=input.nextInt();
//        System.out.println("Input second number:");
//        int snumber=input.nextInt();
//        System.out.println("Input third number:");
//        int thnumber= input.nextInt();
//        System.out.println("Input fourth number: ");
//        int founumber=input.nextInt();
//        if(fnumber==snumber&&fnumber==thnumber&&fnumber==founumber){
//            System.out.println("Numbers are equal");
//        }else {
//            System.out.println("Numbers are not equal!");
//        }
        //14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.
//        System.out.println("=== 14 ==");
//        System.out.println("Input a number:");
//        int num= input.nextInt();
//        if (num<0){
//            System.out.println("Number is negative");
//        }else if (num>0){
//            System.out.println("Number is positive");
//        }else {
//            System.out.println("Number is zero");
//        }
        //15.Write a program to enter the numbers till the user wants and at the end it should
        //display the count of positive, negative and zeros entered
        //(End loop use -1 , Don’t count -1).
//        System.out.println("Enter numbers");
//        int userNumbers;
//        int counterP=0;
//        int counterN=0;
//        int counterZ=0;
//        do {
//            userNumbers= input.nextInt();
//
//            if (userNumbers>0){
//                counterP++;
//            } else if (userNumbers<0) {
//                if (userNumbers==-1){
//                    break;
//                }else {
//                    counterN++;
//                }
//
//            }else {
//                counterZ++;
//            }
//        }while (userNumbers!=-1);
//        System.out.println("P "+counterP);
//        System.out.println("N "+ counterN);
//        System.out.println("Z "+counterZ);

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.
//        System.out.println("Enter numbers");
//        String txtnumbers=input.nextLine();
//        int indexchar=txtnumbers.length()-1;
//        String newtxt="";
//        do {
//            newtxt+=""+txtnumbers.charAt(indexchar);
//            indexchar--;
//        }while (indexchar!=-1);
//        System.out.println(newtxt);

        //17 - Write a program to enter the numbers till the user wants and at the end the program
        //should display the largest and smallest numbers entered
//        int bignumber;
//        int isBig;
//        String stop="";
//        System.out.println("if you want stop enter N");
//        do {
//            System.out.println("Enter the Number: ");
//            bignumber=input.nextInt();
//            isBig=bignumber;
//            if (bignumber<isBig){
//                isBig=bignumber;
//            }
//            System.out.println("complete?? Y/N");
//            stop=input.next();
//        }while (!stop.equalsIgnoreCase("n"));
//        System.out.println(isBig);
        //18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.
//        System.out.println("=== 18 ====");
//        System.out.println("Enter String");
//        String userInput=input.nextLine();
//        int charCounter=0;
//        for (int i = 0; i <=userInput.length()-1 ; i++) {
//            if (userInput.charAt(i)=='a'){
//                charCounter++;
//            }
//        }
//        System.out.println("Number of a's:"+charCounter);
    }
}