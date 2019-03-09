package com.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author marek swietlik
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 20);
        Person person2 = new Person("Jan", "Kowalski", 30);
        Person person3 = new Person("Jan", "Kowalski", 30);
        Person person4 = new Person("Jan", "Kowalski", 30);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Student student1 = new Student("Geniu", "Kowalski", new Address("Bydgoszcz", "Halicka"));
        Student student2 = new Student ("Waldek","Janicki",new Address ("Bydgoscz","Lelewela"));
        Student student3 = new Student ("Janek","Waldecki",new Address ("Poznań","Strzelecka"));

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //ZADANIE 2
        ObjectMapper mapper = new ObjectMapper();
        try {
            String personStr = mapper.writeValueAsString(personList);
            System.out.println(personStr);
            Files.write(Paths.get("person.json"), personStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //ZADANIE 3

        ObjectMapper studentMapper = new ObjectMapper();
        try {
            String StudentStr = studentMapper.writeValueAsString(studentList);
            System.out.println(studentList);
            Files.write(Paths.get("person.json"), StudentStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
