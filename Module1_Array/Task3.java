class Main {

    String name;
    int age;

    Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Main student = new Main("Bharath", 20);
        student.print();
    }
}
