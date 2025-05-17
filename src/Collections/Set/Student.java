package Collections.Set;

import java.util.Objects;

public class Student implements Comparable<Student> {

    String name;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "{name : "+name + ", roll No : "+rollNo+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }


//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo - o.rollNo;
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
