package student_win22;
/**
 * @author
 */
public class PartTimeStudent extends Student
{
   private int numCourses;

   public PartTimeStudent (String studentID, String studentName, int numCourses)
   {
      super(studentID, studentName);
      this.numCourses = numCourses;
   }


   public int getNumCourses ()
   {
      return numCourses;
   }

   public void setNumCourses (int numCourses)
   {
      this.numCourses = numCourses;
   }


}
