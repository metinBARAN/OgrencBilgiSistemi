public class Teacher {
    String name;
    String mobilNo;
    String branch;

    Teacher(String name,String mobilNo,String branch){
        this.name=name;
        this.mobilNo=mobilNo;
        this.branch=branch;

    }
    void  print(){
        System.out.println("Adi: "+this.name);
        System.out.println("Telefon Numarasi: "+this.mobilNo);
        System.out.println("Bolumu : "+this.branch);
    }
}
