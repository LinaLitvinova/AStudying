package StudentHashSet;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Student> students = Arrays.asList(
                new Student(Arrays.asList(
                        new Book("The Great Gatsby",256,1925),
                        new Book ("The Possessed(The Devils)",768,1872),
                        new Book ("Grimm's Fairy Tales",258,1812),
                        new Book("love",409,1886))),
                new Student(Arrays.asList(
                        new Book("Little Women",88, 1869),
                        new Book("The Text",320,2017)))
                );

        students.stream()
                .peek(System.out::println) // Печатаем каждого студента
                .flatMap(student -> student.getBooks().stream()) // Получаем список книг
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортировка по количеству страниц
                .distinct() // Оставляем только уникальные книги







                .filter(book -> book.getYear() > 2000) // Оставляем книги выпущенные после 2000 года
                .limit(3) // Ограничиваем до 3 элементов
                .map(Book::getYear) // Получаем год выпуска книг
                .findFirst() // Получаем первый элемент в Optional
                .ifPresentOrElse(year -> System.out.println("Year of the book: " + year),
                        () -> System.out.println("Книга отсутствует"));
    }
}