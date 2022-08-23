public class Main {

    public static void main(String[] args) {


        Teacher t1=new Teacher("metin","5687945654","TRH");
        Teacher t2=new Teacher("Baran","5469886557866","FZK");
        Teacher t3=new Teacher("Mehmet","56321566568613","MAT");

        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course matematik=new Course("Matematik","101","MAT");
        matematik.addTeacher(t3);


        Student s1=new Student("Ahmet","237","3",tarih,fizik,matematik);
        s1.addBulkExamNote(70,80,60);
        s1.isPass();
        System.out.println("=====================================");
        Student s2=new Student("Murat","465","3",tarih,fizik,matematik);
        s2.addBulkExamNote(50,40,20);
        s2.isPass();

    }
}
