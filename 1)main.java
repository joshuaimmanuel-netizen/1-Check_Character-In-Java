import java.util.Scanner;
//Lesson Buddy
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (Character.isUpperCase(a)) {
            System.out.println("1");
        }
        else if (Character.isLowerCase(a)) {
            System.out.println("0");
        }
        else {
            System.out.println("-1");
        }
        sc.close();
    }
}
