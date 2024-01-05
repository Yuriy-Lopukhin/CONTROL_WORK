class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void performCommand(String command) {
        System.out.println("Кошка " + name + " знает команду: " + command);
    }
}
