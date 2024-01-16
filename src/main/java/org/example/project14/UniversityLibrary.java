package org.example.project14;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {

    public void getBook() {
        System.out.println("Мы взяли книгу из UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы взяли журнал из UniversityLibrary");
    }

    public void returnBook() {
        System.out.println("Мы вернули книгу в UniversityLibrary");
    }

    public void returnMagazine() {
        System.out.println("Мы вернули журнал в UniversityLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавили книгу в UniversityLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавили журнал в UniversityLibrary");
    }
}
