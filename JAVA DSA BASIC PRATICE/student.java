class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }



    public static void main(String[] args) {
        Student[] s = {
            new Student("Aditya", 19),
            new Student("Rahul", 20),
            new Student("Aman", 18)
        };

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}



