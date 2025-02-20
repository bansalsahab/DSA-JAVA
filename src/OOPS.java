// public class OOPS {
//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.name="parth";
//         s1.roll=456;
//         s1.password="abcd";
//         s1.marks[0]=100;
//         s1.marks[1]=90;
//         s1.marks[2]=80;

//         Student s2=new Student(s1);//copy
//         s2.password="xyz";
//         s1.marks[2]=100;
//         for (int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }

//     }
// }

class Student {
    String name;
    int roll;
    int marks[];
    String password;

    // copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        System.out.println("constructor is called..");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.walk();
        System.out.println(h.color);
    }
}

abstract class animal {
    String color;

    animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eat");
    }

    abstract void walk();

}

class Horse extends animal {
    void changecolor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("on 4 legs");
    }
}

class chicken extends animal {
    void walk() {
        System.out.println("on legs");
    }
}
