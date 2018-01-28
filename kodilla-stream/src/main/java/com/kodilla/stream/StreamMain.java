package com.kodilla.stream;

public class StreamMain {
    public static void main(String[] args) {
 /*       BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum ();

        Map<Integer, Object> theResultStreamOfUsers = forum.getUserList().stream()
                .filter(fu -> fu.getSex()=='M')
                .filter(fu -> fu.getBirthday().getYear() <1999)
                .filter(fu -> fu.getNumberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, fu -> fu));

        System.out.println("# elements: " + theResultStreamOfUsers.size());
        theResultStreamOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    } */
        System.out.println("OK");

    }
}
