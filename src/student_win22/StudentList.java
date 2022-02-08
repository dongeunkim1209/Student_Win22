package student_win22;
/**
 * @author Ronak
 */
public class StudentList
{
   public static void main (String[] args)
   {
      Student[] studentList = new Student[3];
      studentList[0] = new Student("s1", "Ronak Sheth");
      studentList[1] = new Student("s2", "John Doe");
      studentList[2] = new Student("s3", "Abc");

      for (int i = 0; i < studentList.length; i++) {
         System.out.print(studentList[i].getStudentID());
         System.out.print("  ");
         System.out.println(studentList[i].getStudentName());
      }

   }
}
