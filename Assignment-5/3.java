public class Student {
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }
    
    // Constructor with name parameter
    public Student(String name) {
        this.name = name;
        age = 0;
    }
    
    // Constructor with name and age parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        // Creating objects using overloaded constructors
        Student student1 = new Student();
        Student student2 = new Student("John");
        Student student3 = new Student("Alice", 20);
        
        // Printing student information
        System.out.println("Student 1 - Name: " + student1.getName() + ", Age: " + student1.getAge());
        System.out.println("Student 2 - Name: " + student2.getName() + ", Age: " + student2.getAge());
        System.out.println("Student 3 - Name: " + student3.getName() + ", Age: " + student3.getAge());
    }
}