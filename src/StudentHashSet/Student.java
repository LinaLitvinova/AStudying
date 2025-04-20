package StudentHashSet;
import java.util.*;

public class Student {
        private List<Book> books;

        public Student(List<Book> books) {
            this.books = books;
        }

        public List<Book> getBooks() {
            return books;
        }

        @Override
        public String toString() {
            return "Student with books: " + books;
        }
}
