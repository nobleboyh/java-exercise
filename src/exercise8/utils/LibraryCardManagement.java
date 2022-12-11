package exercise8.utils;

import exercise8.models.LibraryCard;

import java.util.LinkedList;
import java.util.List;

public class LibraryCardManagement {
    private static final List<LibraryCard> cardList = new LinkedList<>();

    public static void addCard(LibraryCard libraryCard){
        if(!isExistCard(libraryCard)) cardList.add(libraryCard);
    }

    public static void deleteCard(LibraryCard libraryCard){
        cardList.remove(libraryCard);
    }

    public static void showAllCard(){
        cardList.forEach(System.out::println);
    }

    public static boolean isExistCard(LibraryCard libraryCard){
        return cardList.contains(libraryCard);
    }
}
