package kg.megacom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("The White Ship");
        bookList.add("The Day Lasts More Than a Hundred Years");
        bookList.add("Mother Earth and Other Stories");
        bookList.add("Jamila");
        bookList.add("Mother Earth");
        System.out.println("________The list of Chingiz Aitmatov books");
        for (String books : bookList) {
            System.out.println(books);
        }
        bookList.remove(4);
        System.out.println("________Removed last book from the list");
        bookList.forEach(System.out::println);
        System.out.println("________Replaced last book with deleted");
        bookList.set(3, "Mother Earth");
        bookList.forEach(System.out::println);
        System.out.println("________Printed out only the last book");
        String book = bookList.get(3);
        System.out.println(book);
        ArrayList<String> newBookList = new ArrayList<>(3);
        System.out.println("________Added 3 books to the list ");
        newBookList.add("Effective Java");
        newBookList.add("Learn Java in 1 Day: Complete Beginners Guide");
        newBookList.add("Java Deep Learning Projects");
        bookList.addAll(newBookList);
        bookList.forEach(System.out::println);
        System.out.println("________Added 2 identical books to the beginning of the list");
        bookList.offerFirst("Martin Eden");
        bookList.offerFirst("Martin Eden");
        bookList.forEach(System.out::println);
        bookList.offerLast("The Call of the Wild");
        bookList.offerLast("The Call of the Wild");
        System.out.println("________Added 2 identical books to the end of the list");
        bookList.forEach(System.out::println);
        bookList.removeFirstOccurrence("Martin Eden");
        System.out.println("________Removed the first occurrence of a book from the beginning of the list");
        bookList.forEach(System.out::println);
        bookList.forEach(System.out::println);
        bookList.removeLastOccurrence("The Call of the Wild");
        System.out.println("________Removed the last occurrence of a book from the beginning of the list");
        bookList.forEach(System.out::println);
        System.out.println("________Cleared book list");
        bookList.clear();
        System.out.println(bookList);
    }
}
