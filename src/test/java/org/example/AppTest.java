package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void testAssertList() {

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



            //(memberList, contains("a", "b", "c"));
        }








    }
