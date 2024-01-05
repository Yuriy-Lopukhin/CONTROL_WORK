class Donkey extends PackAnimal {
    public Donkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Ослик кричит");
    }
}
