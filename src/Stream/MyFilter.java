package Stream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFilter {

    public static void main(String[] args) {
        Student s1 = new Student("Vova",12);
        Student s11 = new Student("Vova",12);
        Student s2 = new Student("Vova1",124);
        Student s3 = new Student("Vova2",125);
        Student s4 = new Student("Vova3",126);


        List<Student> stList =new LinkedList<>();
        stList.add(s1);
        stList.add(s2);
        stList.add(s3);
        stList.add(s4);

        stList = stList.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .collect(Collectors.toList());


        System.out.println(stList);

        System.out.println(s1.equals(s11));


//        stList = stList.stream().filter(el->el.getAge()>12).collect(Collectors.toList());
//
//        System.out.println(stList);

//
//        Stream<Student> myStream = Stream.of(s1,s2,s3,s4);
    }
}

class Student{
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}