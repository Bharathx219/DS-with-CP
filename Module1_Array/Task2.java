class Main {

    String name;
    int age;

    void getDetails() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Main a = new Main();
        a.name = "Bharath";
        a.age = 20;
        System.out.println(a.name);
        System.out.println(a.age);
        a.getDetails();
    }
}
