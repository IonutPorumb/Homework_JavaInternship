package exercises.day4;

import exercises.day4.exercise1.Colors;
import exercises.day4.exercise1.Cosmetics;
import exercises.day4.exercise1.Electronics;
import exercises.day4.exercise1.Fridge;
import exercises.day4.exercise2_3.DatabaseAdmin;
import exercises.day4.exercise2_3.Programmer;
import exercises.day4.exercise4.Basket;
import exercises.day4.exercise5.BouquetOfFlowers;
import exercises.day4.exercise6.Company;
import exercises.day4.exercise6.Person;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) Define the following classes:");
        Cosmetics cosmetics = new Cosmetics(12.4, "mascara", "eyelashes makeup",
                20, Colors.BLACK, 10.5);
        Electronics electronics = new Electronics(1840, "Samsung S20", "Smart phone",
                5, "phones", 150, 60, 8, 130);
        Fridge fridge = new Fridge(2500, "Arctic A560", "Refrigerator", 3,
                "Refrigerator with 2 doors", 2000, 650, 700, 67, -15);
        System.out.println(cosmetics);
        System.out.println(electronics);
        System.out.println(fridge);
        System.out.println("================================================================");
        System.out.println("3) Create an object that will receive any person (from ex 2) and will have methods to return person related data:");
        LocalDateTime birthDay = LocalDateTime.of(1970, 5, 25, 16, 35, 0);
        LocalDateTime birthDay1 = LocalDateTime.of(1961, 4, 10, 2, 45);
        Programmer programmer = new Programmer("Will", "Smith", birthDay,
                "Oak street No 3", "Data analyst", "Java");
        System.out.println("The employee full name is : " + programmer.fullName());
        System.out.println(programmer.age());
        DatabaseAdmin databaseAdmin = new DatabaseAdmin("Angela", "Merkel", birthDay1,
                "Hamburg, Germany", "Programmer", "MySQL");
        System.out.println("The employee full name is : " + databaseAdmin.fullName());
        System.out.println(databaseAdmin.age());
        System.out.println("================================================================");
        System.out.println("4) Create an object Basket that holds the fruits. ");
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", " Banana", "Pear", "Plum", "Apple", "Apple", "APPLE "));
        Basket myBasket = new Basket(fruits);
        System.out.println("The basket contain apples? :=> " + myBasket.find("Apple"));
        System.out.println("One Pear have been removed from the basket? :=> " + myBasket.remove("Pear"));
        System.out.println("The first position of the Plum in the basket is :=> " + myBasket.position("Plum"));
        System.out.println("The basket contain the following distinct fruits : " + myBasket.distinct());
        System.out.println("The basket contain (using count() method)" + myBasket.count() + " fruits");
        System.out.println("The basket contain (using customCount() method)" + myBasket.customCount() + " fruits");
        System.out.println("We will add two more fruits to the basket");
        myBasket.add("Kiwi");
        myBasket.add("Banana");
        System.out.println("The basket contain " + myBasket.count() + " fruits");
        System.out.println("================================================================");
        System.out.println("5) Create an objects that model bouquet of flowers. Each flower has to be unique. We don't care how the flowers are ordered");
        List<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Lily", "Daisy", "Peony", "Daisy", "Daffodil", "Peony", "Snowdrop", "Rose"));
        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers(flowers);
        System.out.println("The bouquet of flowers contain the following flowers: \n" + bouquetOfFlowers.getAll());
        System.out.println("The Lotus flower will be added:");
        bouquetOfFlowers.add("Lotus");
        System.out.println("The bouquet of flowers contain the following flowers: \n" + bouquetOfFlowers.getAll());
        bouquetOfFlowers.remove("Daisy");
        System.out.println("The bouquet of flowers contain the following flowers: \n" + bouquetOfFlowers.getAll());
        System.out.println("================================================================");
        System.out.println("6) create a Person(name, age, position)");
        Person person1 = new Person("Pavel Dumitrescu", 45, "welders");
        Person person2 = new Person("Ion Baciu", 24, "carpenters");
        Person person3 = new Person("Mihai Moldovan", 57, "plumbers");
        Person person4 = new Person("Marian Asandei", 63, "plumbers");
        Person person5 = new Person("Dorin Maier", 31, "CARPENTERS");
        Person person6 = new Person("Traian Barbu", 23, " Carpenters");
        Person person7 = new Person("Dan Alexa", 43, "welders");
        Person person8 = new Person("Cosmin Moldovan", 48, "Plumbers ");
        Person person9 = new Person("Cristian Dumitrescu", 55, " welders");
        Person person10 = new Person("Ion Maier", 45, "manager");
        Person person11 = new Person("Traian Ionescu", 33, " Carpenters");
        Person person12 = new Person("Traian Petre", 26, " Carpenters");

        Set<Person> employeeList = new HashSet<>(Arrays.asList
                (person1, person2, person3, person4, person5, person6, person7, person8, person9, person10));
        Company company = new Company("SC Fraguta S.R.L.", 13546815, "Calea Brasovului NR:11", employeeList);
        System.out.println("The company manager is: \n" + company.getManager());
        System.out.println("===========");
        System.out.println("The list of carpenters is:\n" + company.getPersons("carpenters"));
        System.out.println("===========");
        System.out.println("The list of plumbers is:\n" + company.getPersons("plumbers"));
        System.out.println("===========");
        System.out.println("The list of welders is:\n" + company.getPersons("welders"));
        System.out.println("===========");
        System.out.println("The list of employees older than 40 years is:\n" + company.getPersonOlder(40));
        System.out.println("===========");
        System.out.println("The list of employees where the name contain Moldovan is:\n" + company.getPerson("Moldovan "));
        System.out.println("===========");
        System.out.println("Adding 2 new employees :\n");
        company.employ(person11);
        company.employ(person12);
        System.out.println("The list of carpenters is:\n" + company.getPersons("carpenters"));
    }
}
