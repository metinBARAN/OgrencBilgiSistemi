public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;


    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            //printTeacher();
        }else{
            System.out.println("Bolum ve Dersler Uyusmuyor!");
        }


    }
    void printTeacher(){
        this.teacher.print();
    }
}
