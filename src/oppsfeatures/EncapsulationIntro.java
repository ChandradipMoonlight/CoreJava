package oppsfeatures;

/***
 * this is example fo encapsulation
 */
class Encapsulation {
    /**
     * declaration of instance variable as private to hide the data from other class
     */
    private String studentName;
    private int studentAge;
    private int studentRollNo;

    /**
     * this getter and setter methods to access the data from in other class
     * @return data;
     */
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }
}
public class EncapsulationIntro {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setStudentName("Chandradip Shivankar");
        encapsulation.setStudentAge(23);
        encapsulation.setStudentRollNo(12);
        System.out.println("My name is " + encapsulation.getStudentName() +
                            ", My age is " + encapsulation.getStudentAge() +
                            " and My Roll No. is " + encapsulation.getStudentRollNo());
    }
}
