package student_win22;
/**
 * @author Ronak
 */
public class Student
{
   private String studentID;
   private String studentName;

   public Student (String studentID, String studentName)
   {
      this.studentID = studentID;  // using this to differentiate class variable and argument 
      this.studentName = studentName;
   }

   //A setter method provides write access, while a getter method provides read access
   public String getStudentID ()
   {
      return studentID;
   }

   public void setStudentID (String studentID)
   {
      this.studentID = studentID;
   }

   public String getStudentName ()
   {
      return studentName;
   }

   public void setStudentName (String studentName)
   {
      this.studentName = studentName;
   }

}
