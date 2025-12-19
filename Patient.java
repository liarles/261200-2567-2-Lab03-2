public class Patient {
    private int id;
    private String name;
    private int birth;
    private double height;
    private double weight;
    private String bloodGroup;
    private int phoneNumber;

    public int check_year(int birth){
        if(birth < 0){
            birth = -1*birth;
            System.out.println("Invalid birth year, now " + name +" brith year will be" + birth);
        }
        else if (birth == 0){
            birth = 2000;
            System.out.println("Invalid birth year, now " + name +" brith year will be" + birth);
        }
        return birth;
    }

    public double height(double height){
        if(height < 0){
            height = -1*height;
            System.out.println("Invalid height, now " + name +" height will be "+ height + " cm");
        }
        else if (height == 0){
            height = 160;
            System.out.println("Invalid height, now " + name +" height will be "+ height + " cm");
        }
        return height;
    }

    public double weight(double weight){
        if(weight < 0){
            weight = -1*weight;
            System.out.println("Invalid weight, now " + name +" weight will be " + weight + " kg");
        }
        else if (weight == 0){
            weight = 60;
            System.out.println("Invalid weight, now " + name +" weight will be " + weight + " kg");
        }
        return weight;
    }

    Patient(int id, String name ,int birth,double height,double weight,String bloodGroup,int phoneNumber) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }
//    public int getId(){
//        return this.id;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public int getBirth(){
//        return this.birth;
//    }
//    public double getHeight(){
//        return this.height;
//    }
//    public double getWeight(){
//        return this.weight;
//    }
//    public String getBloodGroup(){
//        return this.bloodGroup;
//    }
//    public int getPhoneNumber(){
//        return this.phoneNumber;
//    }
    public double getBMI(double height, double weight){
        double BMI;
        BMI = (weight*0.01)/(height*height);
        if(BMI <= 0){
            BMI = 0;
        }
        return BMI;
    }

    public int getAge(int currentYear){
         int age;
         age = currentYear - birth;
         return age;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));

        System.out.println("Patient Height (cm): " + height(height));

        System.out.println("Patient Weight (kg): " + weight(weight));

        System.out.println("Patient Blood Group: " + bloodGroup);

        System.out.println("Patient Phone Number: " + phoneNumber);

        System.out.println("Patient BMI: " + getBMI(height,weight));

        System.out.println();
    }

}
