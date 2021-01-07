package ManageSchool;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String dob;
    private String address;

    public Person(String name, String gender, String dob, String address) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }
    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap gioi tinh");
        gender = input.nextLine();
        System.out.println("Nhap  dob: ");
        dob =  input.nextLine();
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();

    }
    public void showInfo(){
        System.out.println("Ten: "+ name+"gioi tinh: "+gender+"ngay sinh: "+dob+"dia chi: "+address);
    }
}
