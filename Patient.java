public class Patient {
    private String name,bloodGroup,phoneNumber;
    private int id,birthYear;
    private double height,weight;

    Patient(int id,String name,int birthYear,double height,double weight,String phoneNumber,String bloodGroup) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
//        this.height=height;
//        this.weight=weight;
        this.phoneNumber = phoneNumber;
        if(bloodGroup!="A"||bloodGroup!="B"||bloodGroup!="AB"||bloodGroup!="O"){
            bloodGroup="Error";
        }
        else{
            this.bloodGroup = bloodGroup;
        }
        if (height < 0||height >400) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (weight < 0||weight>300) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }
    }

    public int getid (){
        if(id<=0) {
            System.out.println("Id Error!!!");
            return 0;}
        else{ return this.id;}
    }

    public String getname(){
        return  this.name;
    }

    public int getbirthYear(){
        return this.birthYear;
    }

    public double getheight(){
        return this.height;}
    public double weight(){
        return this.weight;
    }

    public int getAge(int currentYear){
        int age;
        age = currentYear-this.birthYear;
        if(age<0){age=0;
            System.out.println("birthYear Error!!!");}
        return age;
    }

    public String getBloodGroup(){
        return this.bloodGroup;
    }

    public String getphoneNumber(){
        return this.phoneNumber;
    }

    public double getBMI(){
        this.height=height/100;
        return this.weight/(this.height*this.height);
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("BMI= "+getBMI());
        System.out.println("BloodGroup= "+getBloodGroup());
        System.out.println("Phone Number= "+getphoneNumber());
        if(height==0){
            System.out.println("Height Error!!!");
        }
        if(weight==0){
            System.out.println("Weight Error!!!");
        }
    }

}
