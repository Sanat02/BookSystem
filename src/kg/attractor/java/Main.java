package kg.attractor.java;

import kg.attractor.java.lesson44.Lesson44Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //не менять порт!так как в html файле есть фрагмент <a href="http://localhost:8187/employee" class="booklink">
        //который переключает на другую страницу
        try {
            new Lesson44Server("localhost", 8187).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
