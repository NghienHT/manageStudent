package ManageSchool;

import java.util.Scanner;

public class Student extends  Person {
    String rollNo;
    float mark;
    String email;

    public Student(String rollNo, float mark, String email) {
        this.rollNo = rollNo;
        this.mark = mark;
        this.email = email;
    }

    public Student() {

    }

    @Override
            public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", mark=" + mark +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(toString());
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        // code day du
        while (true) {
            String rollNoInput = input.nextLine();
            boolean check = setRollNo(rollNoInput);
            if (check) {
                break;
            }
        }

        System.out.println("Nhap diem sinh vien: ");
        while (true) {
            float markNoInput = Float.parseFloat(input.nextLine());
            boolean check = setMark(markNoInput);
            if (check) {
                break;
            }
            //code ngan:
            // while (!setRollNo(input.nextLine()));

        }
        System.out.println("Nhap email sinh vien: ");
        while (true) {
            //nhap va
            String emailNoInput = input.nextLine();
            boolean check = setEmail(emailNoInput);
            if (check) {
                break;
            }
        }
    }
//        Scanner input = new Scanner(System.in);
//        boolean check;
//        do{
//            System.out.println("Nhap ma sinh vien: ");
//            rollNo = input.nextLine();
//            if(rollNo.length()==8){
//                check= false;
//            } else  check = true;
//
//
//        } while (check);
//    /////////
//


    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        this.rollNo = rollNo;
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.out.println("Nhap lai ma so sinh vien ");
            return false;
        }
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println("Nhap lai ma sinh vien: ");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.println("Nhap lai email: ");
            return false;
        }
    }

    public boolean checkScholarship(){
        if (mark>=8){
            return  true;
        }else return false;
    }
}



