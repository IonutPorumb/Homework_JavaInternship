package exercises.day3;

import exercises.day3.exercise1_2.*;
import exercises.day3.exercise3_4.Product;
import exercises.day3.exercise5.Bottle;
import exercises.day3.exercise6.EmailAdvertise;
import exercises.day3.exercise6.FacebookAdvertise;
import exercises.day3.exercise6.PaperSize;
import exercises.day3.exercise6.PrintAdvertise;
import exercises.day3.exercise7.BRDBank;
import exercises.day3.exercise7.BTBank;
import exercises.day3.exercise7.INGBank;
import exercises.day3.exercise7.Money;
import exercises.day3.exercise8.*;
import exercises.day3.exercise9.Student;

public class Main {
    public static void main(String[] args) {
        //Ex 1) create an object that represents a Person
        System.out.println("Ex 1) create an object that represents a Person");
        Person person = new Person("Ana", 24, false);
        System.out.println("The person name is : " + person.getName() + "\n" +
                "The person age is : " + person.getAge() + "\n" +
                "The person marital status : " + person.isMarried());
        //Ex 2) create an application that creates 3 persons using the objects from exercise 1. Print them to the console
        System.out.println("===================================================");
        System.out.println("2) create an application that creates 3 persons using the objects from exercise 1. Print them to the console");
        Person person1 = new Person("Michael", 45, true);
        Person person2 = new Person("Angela", 65, true);
        Person person3 = new Person("Alex", 40, true);
        System.out.println("Person1============");
        System.out.println("The person name is : " + person1.getName() + "\n" +
                "The person age is : " + person1.getAge() + "\n" +
                "The person marital status : " + person1.isMarried());
        System.out.println("Person2============");
        System.out.println("The person name is : " + person2.getName() + "\n" +
                "The person age is : " + person2.getAge() + "\n" +
                "The person marital status : " + person2.isMarried());
        System.out.println("Person3============");
        System.out.println("The person name is : " + person3.getName() + "\n" +
                "The person age is : " + person3.getAge() + "\n" +
                "The person marital status : " + person3.isMarried());
        //Ex 3) create an object that represents a Product
        System.out.println("===================================================");
        System.out.println("3) create an object that represents a Product");
        Product product = new Product("Samsung S21", 2000.0, 10, "Smart phone");
        System.out.println("The product name is : " + product.getName() + "\n" +
                "The product price is : " + product.getPrice() + "\n" +
                "The product quantity status  is : " + product.getQuantity() + "\n" +
                "The product stock is : " + product.hasStock());
        //Ex 4) Create an application that creates 3 Products. Use each method of the object
        System.out.println("===================================================");
        System.out.println("4) Create an application that creates 3 Products. Use each method of the object");
        Product product1 = new Product("Samsung S21", 2000.0, 10, "Smart phone");
        System.out.println("Product1============");
        System.out.println("The product name is : " + product1.getName() + "\n" +
                "The product price is : " + product1.getPrice() + "\n" +
                "The product quantity status  is : " + product1.getQuantity() + "\n" +
                "Product category is : " + product1.getCategory() + "\n" +
                "The product stock is : " + product1.hasStock());
        Product product2 = new Product("Nintendo Switch", 1899.90, 0, "Gaming");
        System.out.println("Product2============");
        System.out.println("The product name is : " + product2.getName() + "\n" +
                "The product price is : " + product2.getPrice() + "\n" +
                "The product quantity status  is : " + product2.getQuantity() + "\n" +
                "Product category is : " + product2.getCategory() + "\n" +
                "The product stock is : " + product2.hasStock());
        Product product3 = new Product("Fulda Ecocontrol", 295.5, 100, "Summer tyres");
        System.out.println("Product3============");
        System.out.println("The product name is : " + product3.getName() + "\n" +
                "The product price is : " + product3.getPrice() + "\n" +
                "The product quantity status  is : " + product3.getQuantity() + "\n" +
                "Product category is : " + product3.getCategory() + "\n" +
                "The product stock is : " + product3.hasStock());
        //Ex 5) create an object that represents a bottle:
        System.out.println("===================================================");
        System.out.println("5) create an object that represents a bottle:");
        Bottle bottle = new Bottle(1.5, 0.5, false);
        System.out.println("The bottle has more liquid? => " + bottle.bottleHasMoreLiquid());
        System.out.println("What is the available liquid in the bottle? => " + bottle.getAvailableLiquid());
        System.out.println("What is the empty capacity of the bottle? => " + bottle.getEmptyCapacity());
        System.out.println("Calling the bottleOpener method:=> " + bottle.bottleOpener());
        System.out.println("Calling for the second time the bottleOpener method:=> " + bottle.bottleOpener());
        System.out.println("Calling the bottleClosure method:=> " + bottle.bottleCloser());
        System.out.println("Calling for the second time the bottleClosure method:=> " + bottle.bottleCloser());
        System.out.println("Calling the bottle drinker method when the bottle is closed:=> " + bottle.bottleLiquidDrinker(0.1));
        System.out.println("Calling the bottleOpener method before the drinker method:=> " + bottle.bottleOpener());
        System.out.println("Calling the bottle drinker method when there is not enough liquid in the bottle :=> " + bottle.bottleLiquidDrinker(0.8));
        System.out.println("Calling the bottle drinker method with there right quantity of liquid to be drunk :=> " + bottle.bottleLiquidDrinker(0.3));
        System.out.println("Calling the bottleClosure method:=> " + bottle.bottleCloser());
        //6) A company wants to advertise its services. The advertisement may be on facebook, e-mail, print. Build the objects and interface
        System.out.println("===================================================");
        System.out.println("6) A company wants to advertise its services. The advertisement may be on facebook, e-mail, print. Build the objects and interface");
        FacebookAdvertise facebookAdvertise = new FacebookAdvertise("facebook/address");
        System.out.println(facebookAdvertise.advertiseMessage("Facebook advertise: We offer the best services for building your house", "S.C. House Build S.R.L."));
        EmailAdvertise emailAdvertise = new EmailAdvertise("emailAddress@emailAddress.com");
        System.out.println(emailAdvertise.advertiseMessage("email advertise: We offer the best services for building your house", "S.C. House Build S.R.L."));
        PrintAdvertise printAdvertise = new PrintAdvertise(PaperSize.A1);
        System.out.println(printAdvertise.advertiseMessage("printed advertise: We offer the best services for building your house", "S.C. House Build S.R.L."));
        //7) A person needs a banking account. There are several banks that provide this service: ING, BT, BRD. The bank needs to provide the possibility to withdraw and deposit money.
        System.out.println("===================================================");
        System.out.println("7) A person needs a banking account. There are several banks that provide this service: ING, BT, BRD. The bank needs to provide the possibility to withdraw and deposit money.");
        BRDBank brdBank = new BRDBank("BRD", 2000, "Giovani Becali", "164484995535", "RO0098778BRD009897876", 0.4, Money.EUR);
        System.out.println(brdBank);
        System.out.println("========");
        System.out.println(brdBank.deposit(200));
        System.out.println(brdBank.withdraw(300));
        INGBank ingBank = new INGBank("ING", 0, "Sebastian Mititelu", "175464955534", "RO0492768ING6078432777", 0.7, Money.USD);
        System.out.println(ingBank);
        System.out.println("========");
        System.out.println(ingBank.deposit(100));
        System.out.println(ingBank.withdraw(20));
        BTBank btBank = new BTBank("BT", 10_000, "Mirel Radoi", "195564775554", "RO3492768BT6174433700", 1.2, Money.RON);
        System.out.println(btBank);
        System.out.println("========");
        System.out.println(btBank.deposit(1500));
        System.out.println(btBank.withdraw(500));
        System.out.println("===================================================");
        System.out.println("8) Create an interface that describes how an Animal behaves: walk(), talk(), eat(). Provide implementations: Cat, Dog, Mouse, Chicken, Duck. The implementations will just return a string");
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();
        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());
        System.out.println(dog.walk());
        System.out.println(dog.talk());
        System.out.println(dog.eat());
        System.out.println(mouse.walk());
        System.out.println(mouse.talk());
        System.out.println(mouse.eat());
        System.out.println(chicken.walk());
        System.out.println(chicken.talk());
        System.out.println(chicken.eat());
        System.out.println(duck.walk());
        System.out.println(duck.talk());
        System.out.println(duck.eat());
        System.out.println("===================================================");
        System.out.println("Create an object that represents a Student with name " +
                "and grade. Add getters for them. No setters, the object is immutable." +
                " Create two static fields that will remember the sum of the grades and " +
                "the other is the number of students. Also create a static method that uses " +
                "these static fields to calculate the average grade for all students");

        Student student1 = new Student("Iordache", 4);
        Student student2 = new Student("Pop", 5);
        Student student3 = new Student("Dumitru", 7);
        Student student4 = new Student("Ionescu", 10);
        Student student5 = new Student("Petrescu", 9);
        Student student6 = new Student("Popescu", 5);
        Student student7 = new Student("Balint", 6);
        System.out.println("The average grade for all students is : " + Student.averageGradeCalculatorForAllStudents());

    }
}
