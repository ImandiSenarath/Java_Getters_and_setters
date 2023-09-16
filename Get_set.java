class Get_set {
    private String name;
    private int age;
    private char grade;
    // Constructor

    // Constructor with parameters
    public Get_set(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    // Getters and Setters

    //Getter(getName)
    public String getName() {
        return name;
    }

    //Setter(setName)
    public void setName(String newName) {
        name = newName;
    }

    //Getter (getName)
    public int getAge() {
        return age;
    }

    //setter (setName)
    public void setAge(int newAge) {
        age = newAge;
    }

    //Getter(getGrade)
    public char getGrade() {
        return grade;
    }

    //setter(serGrade)
    public void setGrade(char newGrade) {
        grade = newGrade;
    }

    // Display Student Information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Hh{
    public static void main(String[] args) {
        // Create an instance of the Student class
        Get_set student = new Get_set("Imandi",18,'B');

        // Use setter methods to set values for the attributes
        student.setName("Imandi");
        student.setAge(18);
        student.setGrade('B');

        // Call the displayInfo() method to display the information
        student.displayInfo();
    }
}
