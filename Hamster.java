class Hamster extends Pet {
    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public void performCommand(String command) {
        System.out.println("Хомяк} " + name + " знает команду: " + command);
    }
}
