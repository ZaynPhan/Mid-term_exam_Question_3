package Mid_term_exam;
//Câu 3
//Viết chương trình nhập vào một số nguyên dương (n >= 0),
//kiểm tra số đó có là một tháng trong năm không.
//Nếu có thì in ra tháng đó có bao nhiêu ngày.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input integer a: ");
        int a = input.nextInt();

        //Kiểm tra đó có phải là 1 tháng hay không? và in ra số ngày
        if(Question3.isMonth(a)) {
            System.out.format("%d is a month in year!\n", a);
            System.out.format("There is %d days in this month!", Question3.getDayOfMonth(a));
        }else System.out.format("%d is NOT a month in year!", a);
    }
}
