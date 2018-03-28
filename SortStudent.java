/**
 * @(#)SortStudent.java
 *
 *
 * @author 
 * @version 1.00 2018/3/28
 */
import java.util.*;


public class SortStudent
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("How many Student ::");
      int testCases = Integer.parseInt(in.nextLine());
      System.out.println("************************");
      List<Student> studentList = new ArrayList<Student>();
      int i = 0;
      while(testCases>0){
         i++;
         System.out.print("Student ID " + i + "::");
         int id = in.nextInt();
         System.out.print("Student Name " + i + "::");
         String fname = in.next();
         System.out.print("Student CGPA " + i + "::");
         double cgpa = in.nextDouble();
         System.out.println("************************");
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       Collections.sort(studentList, new Comparator<Student>() {
              @Override
               public int compare(Student s1, Student s2) {
                    if(s2.getCgpa()>s1.getCgpa()){
                        return 1;
                    }else if(s2.getCgpa()<s1.getCgpa()){
                        return -1;
                    }
                    return s1.getFname().compareTo(s2.getFname());
                }
        });
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}


class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}