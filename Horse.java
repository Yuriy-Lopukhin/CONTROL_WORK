class Horse extends PackAnimal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Лошадь ржёт");
    }
}
