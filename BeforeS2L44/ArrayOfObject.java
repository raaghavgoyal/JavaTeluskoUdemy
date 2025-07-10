package BeforeS2L44;
//In this code we learn a very important concept of Array of Objects along with,
// the thing that we need to create an object separately to assign its address into array
// so here we are first create objects independently and then create an array to store there address
//then we access them sequentially using array and for-each loop
class Student{
    String name;
    int rollNo;
    int marks;
}
class ArrayOfObject{
    public static void main(String[] args) {
        Student s1  = new Student();
        s1.name = "Raghav";
        s1.marks = 88;
        s1.rollNo = 1;

        Student s2  = new Student();
        s2.name = "Pulkit";
        s2.marks = 80;
        s2.rollNo = 2;
        
        Student s3  = new Student();
        s3.name = "Sahil";
        s3.marks = 69;
        s3.rollNo = 3;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(Student s: students){
            System.out.println(s.name+" : "+s.marks);
        }
    }
}