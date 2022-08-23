public class Student {
    String name;
    String studentNo;
    String clases;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Student(String name,String studentNo,String clases,Course course1,Course course2,Course course3){
      this.name=name;
      this.studentNo=studentNo;
      this.clases=clases;
      this.course1=course1;
      this.course2=course2;
      this.course3=course3;
       this.avarage=0.0;
       this.isPass=false;

    }
    void addBulkExamNote(int note1,int note2,int note3){

        if (note1>=0&&note1<=100){
            this.course1.note=note1;
        }
        if (note2>=0&&note2<=100){
            this.course2.note=note2;
        }
        if (note3>=0&&note3<=100){
            this.course3.note=note3;
        }

    }
    void isPass(){
        this.avarage=(this.course1.note+this.course2.note+this.course3.note)/3.0;
        if (avarage>50){
            System.out.println("Dersi basarili bir sekilde gectiniz");
            this.isPass=true;
        }
        else {
            System.out.println("Dersten kaldiniz");
            this.isPass=false;
        }
        printNote();
    }
    void printNote(){

        System.out.println(this.course1.name+"Notu\t"+this.course1.note);
        System.out.println(this.course2.name+"Notu\t"+this.course2.note);
        System.out.println(this.course3.name+"Notu\t"+this.course3.note);
        System.out.println("----------------------------");
        System.out.println("Ortalamaniz: "+this.avarage);
    }
}
