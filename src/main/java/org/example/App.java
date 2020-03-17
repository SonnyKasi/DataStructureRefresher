package org.example;

/**
 *
 *import java.util.*;
 */


import java.util.*;

public class App
{
    public static void main( String[] args)
    {

            Person persons1 = new Person("Linda", "Minister", 52);
            Person persons2 = new Person("Mike", "IT Specialist", 36);
            Person persons3 = new Person("Jim", "Teacher", 42);
            Person persons4 = new Person("Sizwe", "Student", 24);


        List<Person> memberList = new ArrayList<>();
        memberList.add(persons1);
        memberList.add(persons2);
        memberList.add(persons3);
        memberList.add(persons4);
        System.out.println("Display the list of people.");
        System.out.println(memberList);
        System.out.println();

        System.out.println("Display sorted list by title.");
        Collections.sort(memberList);
        System.out.println(memberList);
        System.out.println();


        Set<Person> memberSet = new HashSet<>(memberList);
        System.out.println("Display set list structure.");
        System.out.print(memberSet);
        System.out.println();

        System.out.println();
        Map<String, Person> memberMap = new HashMap<>();
        for (int i = 1; i < memberList.size(); i++)
        {
        memberMap.put(String.valueOf(i), memberList.get(i));
        }

        System.out.println("Display map list structure.");
        System.out.print(memberMap);

        }
        }
