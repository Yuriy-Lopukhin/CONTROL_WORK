class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void performCommand(String command) {
        System.out.println(name + " знает команду: " + command);
    }
}