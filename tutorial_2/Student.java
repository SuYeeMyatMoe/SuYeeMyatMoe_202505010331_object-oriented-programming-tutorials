class Student {

    String name;
    int age;
    double gpa;

    // Constructor (to take value when we call the class )
    // When you pass values inside the parentheses during class instantiation, 
    // the constructor receives and assigns those values to the object's properties.
    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // Method 
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }
}