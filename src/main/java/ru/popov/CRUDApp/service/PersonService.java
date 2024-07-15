package ru.popov.CRUDApp.service;

import ru.popov.CRUDApp.models.Person;

import java.util.List;

public interface PersonService {
    void insertPerson(Person person);
    void updatePerson(Person updatedPerson);
    void deletePerson(Person person);
    Person getPersonById(int id);
    List<Person> getAllPersons();
}