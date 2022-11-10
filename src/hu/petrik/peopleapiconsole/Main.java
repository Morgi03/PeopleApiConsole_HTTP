package hu.petrik.peopleapiconsole;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://retoolapi.dev/0xaaMh/people";
        try {
            String people = RequestHandler.get(url);
            System.out.println(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
