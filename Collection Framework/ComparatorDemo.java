import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    public Student() {
        rollNo = 0;
        name = null;
        age = 0;
    }

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

class SortByRollNumber implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(111, "Dr. Dre", 32));
        studentList.add(new Student(110, "Dababy", 29));
        studentList.add(new Student(109, "Don Toliver", 25));
        studentList.add(new Student(108, "juice world", 28));
        studentList.add(new Student(107, "biggie", 22));
        studentList.add(new Student(106, "Travis", 25));
        studentList.add(new Student(105, "ASAP rocky", 24));
        studentList.add(new Student(104, "j.cole", 32));
        studentList.add(new Student(103, "drake", 26));
        studentList.add(new Student(102, "eminem", 28));
        studentList.add(new Student(101, "tupac ", 30));

        // sorting by roll number
        Collections.sort(studentList, new SortByRollNumber());
        Iterator iterator = studentList.iterator();
        int num = 0;
        while (iterator.hasNext()) {
            Student s = (Student) iterator.next();
            num++;
            System.err.println("Student - " + num);
            System.err.println("Roll Number : " + s.rollNo);
            System.out.println("name : " + s.name);
            System.out.println("age : " + s.age);
            System.out.println("========================================================");
        }

        // sorting by age
        // Collections.sort(studentList, new SortByAge());
        // Iterator iterator = studentList.iterator();
        // int num = 0;
        // while (iterator.hasNext()) {
        // Student s = (Student) iterator.next();
        // num++;
        // System.err.println("Student - " + num);
        // System.err.println("Roll Number : " + s.rollNo);
        // System.out.println("name : " + s.name);
        // System.out.println("age : " + s.age);
        // System.out.println("========================================================");
        // }

        // sorting by name
        // Collections.sort(studentList, new SortByName());
        // Iterator iterator = studentList.iterator();
        // int num = 0;
        // while (iterator.hasNext()) {
        // Student s = (Student) iterator.next();
        // num++;
        // System.err.println("Student - " + num);
        // System.err.println("Roll Number : " + s.rollNo);
        // System.out.println("name : " + s.name);
        // System.out.println("age : " + s.age);
        // System.out.println("========================================================");
        // }
    }
}
