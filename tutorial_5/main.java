public class Main {
        public static void main(String[] args) {
                // 1. Create a new Student object
                        Student student = new Student();

                                // 2. Set the data using the setter methods
                                        student.setStudentID("CU12345");
                                                student.setName("Ali");
                                                        student.setCGPA(3.75);
                                                                student.setProgramme("BIT");

                                                                        // 3. Retrieve and print the data using the getter methods
                                                                                System.out.println("Student ID : " + student.getStudentID());
                                                                                        System.out.println("Name       : " + student.getName());
                                                                                                System.out.println("CGPA       : " + student.getCGPA());
                                                                                                        System.out.println("Programme  : " + student.getProgramme());
                                                                                                            }
                                                                                                            }
}