class Horse extends WorkingAnimal {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void performCommand(String command) {
        System.out.println("Лошадь " + name + " знает команду: " + command);
    }
}
