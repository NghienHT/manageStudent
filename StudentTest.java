package ManageSchool;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Choose : ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose){
                case 1:
                    int n;
                    System.out.println("nhap so sinh vien: ");
                    n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i <n; i++) {
                        Student std = new Student();
                        std.inputInfo();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex=0;
                    float minMark, maxMark;
                    minMark = studentList.get(0).getMark();
                    maxMark= studentList.get(0).getMark();
                    for (int i = 1  ; i <studentList.size() ; i++) {
                        if(studentList.get(i).getMark()<minMark){
                            minIndex=i;
                            minMark=studentList.get(i).getMark();
                    }
                        if (studentList.get(i).getMark()>maxMark){
                            maxIndex=i;
                            maxMark=studentList.get(i).getMark();
                        }
                     }
                    System.out.println("sinh vien co diem TB cao nhat la: ");
                    studentList.get(maxIndex).showInfo();
                    System.out.println("sinh vien co diem TB thap nhatla: ");
                    studentList.get(minIndex).showInfo();

                    break;
                case 4:
                    System.out.println("Nhap rollNo can tim kiem: ");
                    String rollNoSearch = scan.nextLine();
                    int count=0;
                    for (Student student: studentList
                         ) {
                        if(student.getRollNo().equalsIgnoreCase(rollNoSearch)){
                            student.showInfo();
                            count++;
                        }
                    }if (count==0){
                    System.out.println("Khong tim thay sinh vien nao");
                }
                    break;
                case 5:
                    // sap xep
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if (cmp>=0){
                                return -1;
                            }
                            return 1;
                        }
                    });
                    // hien thi

                    break;
                case 6:
                    // buoc 1:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getMark()>= o2.getMark()?-1:1;

                        }
                    });
                    // buoc2: hien thi:
                    for (int i = 0; i <studentList.size(); i++) {
                        if (studentList.get(i).checkScholarship()){
                            studentList.get(i).showInfo();
                        }
                    }



                    break;
                case 7:
                    System.out.println("chim cut!");
                    break;
                default:
                    System.err.println("Nhap sai cmnr!!!");
                    break;
            }
        }while (choose != 7);

    }
    static void showMenu(){
        System.out.println("1. Nhap vao n sinh vien");
        System.out.println("2. Hien thi thong tin sinh vien");
        System.out.println("3. Hien thi max va min ");
        System.out.println("4. Tim kien sinh vien theo ma sinh vien");
        System.out.println("5. Hien thi thong tin sinh vien theo bang  chu cai");
        System.out.println("6. Hien thi cac sinh vien duoc hoc bong va sap xep");
        System.out.println("7. Thoat");
        }
}
