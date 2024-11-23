package person;

// This class will define a person and the information about a person that is needed
public class Person {

    // Declare a variable for the person's name
    private String name;

    // Declare a variable for the person's age
    private int age;

    // Constructor that initializes the name and age variables
    public Person(String name, int age) {
        // Validando os parâmetros no construtor
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    // Create a method called getName() that will return the person's name
    public String getName() {
        return name;
    }

    // Create a method called getAge() that will return the person's age
    public int getAge() {
        return age;
    }

    // Create a method called setAge() that will set the person's age
    public void setAge(int age) {
        // Validação para evitar valores inválidos
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // Main method to demonstrate the usage of the Person class
    public static void main(String[] args) {
        try {
            // Criando uma instância da classe Person
            Person person = new Person("John Doe", 25);

            // Exibindo os detalhes da pessoa
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            // Modificando a idade da pessoa
            person.setAge(30);
            System.out.println("Updated Age: " + person.getAge());

            // Teste com idade inválida (desencadeará uma exceção)
            // Uncommentar a linha abaixo para testar:
            // person.setAge(-5);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

