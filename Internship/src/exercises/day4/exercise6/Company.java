package exercises.day4.exercise6;

import java.util.*;

public class Company {
    private String companyName;
    private final int companyIdNo;
    private String companyAddress;
    private static Set<Person> employees = new HashSet<>();

    public Company(String companyName, int companyIdNo, String companyAddress, Set<Person> employee) {
        this.companyName = companyName;
        this.companyIdNo = companyIdNo;
        this.companyAddress = companyAddress;
        employees.addAll(employee);
    }

    public Person getManager() {
        Person result = null;
        for (Person p : employees) {
            if (p.getPosition().equals("manager")) {
                result = p;
            }
        }
        return result;
    }

    public List<Person> getPersons(String profession) {
        List<Person> resultList = new ArrayList<>();
        for (Person p : employees) {
            if (p.getPosition().equals(profession.trim().toLowerCase())) {
                resultList.add(p);
            }
        }
        return resultList;
    }

    public List<Person> getPersonOlder(int age) {
        List<Person> resultList = new ArrayList<>();
        for (Person p : employees) {
            if (p.getAge() > age) {
                resultList.add(p);
            }
        }
        return resultList;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> resultList = new ArrayList<>();
        for (Person p : employees) {
            if (p.getName().contains(filterName.trim())) {
                resultList.add(p);
            }
        }
        return resultList;
    }

    public void employ(Person newEmployee) {
        employees.add(newEmployee);
    }
}
