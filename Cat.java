class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}
