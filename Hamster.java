class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Хомяк пищит");
    }
}
