class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void performCommand(String command) {
        System.out.println("Собака " + name + " знает команду: " + command);
    }
}
