package ru.popov.CRUDApp.dao;

import ru.popov.CRUDApp.models.Person;

import java.util.List;

public interface PersonDao {
    void insertPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
    Person getPersonById(int id);
    List<Person> getAllPersons();
}