import java.util.Scanner;

// WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary     HRA = basic salary 10%     DA = Basic salary 8%     TA = Basic salary 9%      PF= Basic salary 20%     Gross salary = basic salary + HRA + TA + DA –PF
public class SalarySlip {
    public static void main(String[] args) {
        Scanner eid = new Scanner(System.in);
        SalarySlip obj = new SalarySlip();
        obj.mySalarySlip();
    }

    public void mySalarySlip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employer id ");
        int eID= sc.nextInt();
        System.out.println("Enter employee name ");
        String Ename = sc.next();
        System.out.println("Enter Basic Salary ");
        int basicSalary= sc.nextInt();
        int hra = (basicSalary * 10)/ 100;
        int ta = (basicSalary * 8)/ 100;
        int da = (basicSalary *9)/ 100;
        int pf = (basicSalary * 20)/ 100;
        double grossSalary = basicSalary+hra+ta+da+pf;

        System.out.println("______________________________");
        System.out.println("l        Salary Slip         l");
        System.out.println("______________________________");
        System.out.println("l                            l");
        System.out.println("l  Employee Id     : 2564    l");
        System.out.println("l   Employee Name  : Jay     l");
        System.out.println("l____________________________l");
        System.out.println("l   Basic Salary   :25000.0  l");
        System.out.println("l   HRA 10%        :2500.0   l");
        System.out.println("l   TA  8 %        :2250.0   l");
        System.out.println("l   DA  9%         :2000.0   l");
        System.out.println("l   PF - 20&       :5000.0   l");
        System.out.println("l____________________________l");
        System.out.println("______________________________");
        System.out.println("l Gross Salary     :26750.0  l");
        System.out.println("l============================l");


    }
}

