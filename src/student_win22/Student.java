package student_win22;
/*
 Date: Jan 25th 2022
 Author: Dong Eun Kim
 Comment: This is just a comment
 */
public class Student
{
   private String studentID;
   private String studentName;
   private String address;

   public String getAddress ()
   {
      return address;
   }

   public void setAddress (String address)
   {
      this.address = address;
   }


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
