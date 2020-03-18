package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Before
    public void setUp(){
        Person persons1 = new Person("Linda", "Minister", 52);
        Person persons2 = new Person("Mike", "IT Specialist", 36);
        Person persons3 = new Person("Jim", "Teacher", 42);
        Person persons4 = new Person("Sizwe", "Student", 24);

        List<Person> memberList = new ArrayList<>();
        memberList.add(persons1);
        memberList.add(persons2);
        memberList.add(persons3);
        memberList.add(persons4);
    }


    @Test
    public void testList() {

        Person persons1 = new Person("Linda", "Minister", 52);
        Person persons2 = new Person("Mike", "IT Specialist", 36);
        Person persons3 = new Person("Jim", "Teacher", 42);
        Person persons4 = new Person("Sizwe", "Student", 24);


        List<Person> memberList = new ArrayList<>();
        memberList.add(persons1);
        memberList.add(persons2);
        memberList.add(persons3);
        memberList.add(persons4);

        assertThat(memberList, hasItems(persons1, persons2, persons3, persons4));
    }



    @Test
    public void testSize(){
        Person persons1 = new Person("Linda", "Minister", 52);
        Person persons2 = new Person("Mike", "IT Specialist", 36);
        Person persons3 = new Person("Jim", "Teacher", 42);
        Person persons4 = new Person("Sizwe", "Student", 24);

        List<Person> memberList = new ArrayList<>();
        memberList.add(persons1);
        memberList.add(persons2);
        memberList.add(persons3);
        memberList.add(persons4);
        assertThat(memberList.size(),is(4));
    }

        @Test
        public void testMap(){
            Person persons1 = new Person("Linda", "Minister", 52);
            Person persons2 = new Person("Mike", "IT Specialist", 36);
            Person persons3 = new Person("Jim", "Teacher", 42);
            Person persons4 = new Person("Sizwe", "Student", 24);

            Map<String, String> map = new HashMap<>();
            map.put("Linda","Minister");
            map.put("Mike","IT Specialist");
            map.put("Jim","Teacher");


            Map<String, String> expected = new HashMap<>();
            expected.put("Mike","IT Specialist");
            expected.put("Jim","Teacher");
            expected.put("Linda","Minister");


            assertThat(map, is(expected));

        }

        @Test
        public  void testSet(){
            Person persons1 = new Person("Linda", "Minister", 52);
            Person persons2 = new Person("Mike", "IT Specialist", 36);
            Person persons3 = new Person("Jim", "Teacher", 42);
            Person persons4 = new Person("Sizwe", "Student", 24);
            Person persons5 = new Person("Jim", "Teacher", 42);
            Person persons6 = new Person("Mike", "IT Specialist", 36);

            List<Person> memberList = new ArrayList<>();
            memberList.add(persons1);
            memberList.add(persons2);
            memberList.add(persons3);
            memberList.add(persons4);
            memberList.add(persons5);
            memberList.add(persons6);

            Set<Person> aSetCollection = new HashSet<Person>();
            aSetCollection.add(persons1);
            aSetCollection.add(persons2);
            aSetCollection.add(persons3);
            aSetCollection.add(persons4);
            aSetCollection.add(persons5);
            aSetCollection.add(persons6);

            assertThat(aSetCollection,hasItems(persons1,persons2,persons3,persons4));

        }

        @Test
    public void testSort(){
            Person persons1 = new Person("Linda", "Minister", 52);
            Person persons2 = new Person("Mike", "IT Specialist", 36);
            Person persons3 = new Person("Jim", "Teacher", 42);
            Person persons4 = new Person("Sizwe", "Student", 24);


            List<Person> memberList = new ArrayList<>();
            memberList.add(persons1);
            memberList.add(persons2);
            memberList.add(persons3);
            memberList.add(persons4);

            List<Person> expectedMemberList = new ArrayList<>();

            expectedMemberList.add(persons2);
            expectedMemberList.add(persons1);
            expectedMemberList.add(persons4);
            expectedMemberList.add(persons3);

            assertThat(expectedMemberList,hasItems(persons2,persons1,persons4,persons3));
        }

    }
