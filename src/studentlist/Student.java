
package studentlist;

public class Student {
    
     
    private String sName;
    private String sId;

    
    public Student(String sName, String sId) {
        this.sName = sName;
        this.sId = sId;
    }
    
    

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
}
