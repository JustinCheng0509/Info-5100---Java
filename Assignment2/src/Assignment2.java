/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question.
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month


    public Employee(String name, int age, Gender gender, double salary) {
        //write your code here
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
        //write your code here
    }

    public void setName(String name) {
        //write your code here
        this.name = name;
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        double tax = 0;
        double salary = employee.salary;
        if (salary <= 8900){
            tax = salary * 12 * 0.062;
        }
        else if (salary > 8900){
            tax = 8900 *12 * 0.062;
        }
        return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        //write your code here
        double insurance = 0;
        double salary = employee.salary;
        if (employee.age < 35){
            insurance = salary * 0.03;
        } else if (employee.age <= 50 && employee.age >= 35){
            insurance = salary * 0.04;
        } if (employee.age < 60 && employee.age > 50){
            insurance = salary * 0.05;
        } if (employee.age >= 60){
            insurance = salary * 0.06;
        }
        return insurance;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        double arrays[] = new double[3];
        arrays[0] = e1.salary;
        arrays[1] = e2.salary;
        arrays[2] = e3.salary;
        double temp = 0;
        for (int i = 0; i < arrays.length - 1; i++){
            for (int j = 0; j < arrays.length -1 -i; j++){
                if (arrays[j] > arrays[j+1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //write your code here
            double salary = employee.salary;
            salary = salary * 3;
            employee.salary = salary;
    }


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.

     Java doesn't pass method arguments by reference, it passes them by value;
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 60, Gender.MALE, 2500);
        Employee c = new Employee("Jason", 50, Gender.MALE, 25000);
        Assignment2 Ass2 = new Assignment2();
        Ass2.sortSalary(a,b,c);
        Ass2.tripleSalary(a);
        System.out.println();
        Ass2.sortSalary(a,b,c);
       /* System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());*/

    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
