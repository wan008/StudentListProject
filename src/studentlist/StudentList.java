package studentlist;

public class StudentList {
    
    public static void main(String[] args) {
        // TODO code application logic here
         Student s1 = new Student("kim", "abc");
        
        Student[] studentList = new Student[5];
        
        studentList[0] = s1;
        studentList[1] = new Student("Ron", "def");
        studentList[2] = new Student("John", "id003");
        
        for (int i=0;i < studentList.length; i++ ){
            System.out.println(studentList[i].getsName());
        }
    }
    
}
