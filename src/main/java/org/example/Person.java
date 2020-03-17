package org.example;

public class Person implements Comparable<Person>
{

    private String name,title;
    private int age;

    public Person(){}

    public Person(String name, String title, int age) {
        this.name = name;
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }





    @Override
    public int compareTo(Person person) {

        return title.compareTo(person.title);
    }
}
