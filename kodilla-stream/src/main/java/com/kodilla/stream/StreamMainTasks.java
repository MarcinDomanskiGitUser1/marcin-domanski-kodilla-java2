package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainTasks {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Wynik zadania 7.1");
        System.out.println("--------------Using string methods and lambda--");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String someText = "This Text Is Decorate With Lambda";
        poemBeautifier.beautify(someText, text -> text.toLowerCase());
        poemBeautifier.beautify("Dać dzisiaj czy jutro?", text -> text.replace('t', 'F'));
        poemBeautifier.beautify("How are you, programmer!", text -> "*** " + text + " ***");
        poemBeautifier.beautify(someText, text -> text.substring(5, 26));
        poemBeautifier.beautify(someText, text -> text.concat(".\nSecond part of text is here!"));
        poemBeautifier.beautify(someText, tex -> {
            String result = "";
            for(int i = 0;i<tex.length(); i++)
                result = result + (" " + tex.charAt(i));
            return result;
        });System.out.println("Koniec zadania");

        System.out.println();
        System.out.println("Wynik zadania 7.3");
        System.out.println("--------------Functional filters in list--");
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultForumUsersList = forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 1998)
                .filter(forumUser -> forumUser.getAmountPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        resultForumUsersList.entrySet().stream()
                .map(entry -> entry.getValue())
                .forEach(System.out::println);
        System.out.println("Koniec zadania");
    }
}
