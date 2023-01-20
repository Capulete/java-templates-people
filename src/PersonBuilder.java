public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String adress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        if (age < 0) {
            throw new IllegalArgumentException("Не верно указан возраст.");
        } else {
            return this;
        }
    }

    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Person build() {
        if (surname == null || name == null) {
            throw new IllegalStateException("Не указаны имя и фамилия.");
        } else {
            Person person = new Person(name, surname, age);
            person.setAdress(adress);
            return person;
        }
    }
}
