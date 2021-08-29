## Programming week
Complete 2 programs from the below three. Program 3 is mandatory. From Program 1/2 you can choose 1.

### Program 1
Given a list of sentence as string. convert the alphabet characters to opposite case. Example `'a'` -> `'A'`, `'D'` -> `'d'`.<br>
**Sample Inputs**:
```
Hi Hello How are you?
Today is a Programming day 1
NOT ALL ARE CAPS
```
**Outputs**:
```
hI hELLO hOW aRE yOU?
tODAY iS A pROGRAMMING DAY 1
not all are caps
```
You can use the below class if required,
```
import java.util.Scanner;

public class Program1 {

    public static String convert(String input){
        //your implementation here
    }

    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Please enter the number of inputs you want to try:");
            int n=scanner.nextInt();
            scanner.nextLine();
            for(int i=0; i<n; i++) {
                String input=scanner.nextLine();
                System.out.println("Output" + convert(input));
            }
        }
    }
}
```

### Program 2
Given a n*n matrix, Find the diagonal sum by adding power of n to each value.<br>
**Sample Input**:
```
3 3
2 6 1
1 2 1
1 1 1
```
**Output**:
```
27
```
**Explanation**:
Diagaonal 1
```
2
 2 
   1
```

Diagaonal 2
```
  1
 2
1
```
Power=3
```
2^3+2^3+1^3+1^3+2^3+1^3=8+8+1+1+8+1=27
```
You can use the below class if required,
```
public class Program2 {

    public static long sum(int[][] input){
        //your implementation here
    }

    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Please enter the n for matrix nxn:");
            int n=scanner.nextInt();
            scanner.nextLine();
            int[][] input=new int[n][n];
            System.out.println("Please enter matrix values (in matrix format):");
            //read your input matrix here
            System.out.println("Total sum is: "+sum(input));
        }
    }
}
```

### Program 3
Given a number with perfect square n, Generate a matrix with n random numbers between 1-10 in double with maximum precision of 2.
Please note, you have to check if the number is perfect square before generating the matrix.<br>
**Sample Input 1**:
```
9
```
**Output 1**:
```
8.81 9.64 4.56
2.34 2.54 2.22
6.90 2.34 4.35
```

**Sample Input 2**:
```
4
```
**Output 2**:
```
8.81 9.64
2.34 2.54
```
**Sample Input 3**:
```
5
```
**Output 3**:
```
Given number is not a perfect square
```
