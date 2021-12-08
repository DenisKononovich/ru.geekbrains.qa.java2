/**
 * JavaCore. Homework 1. MainClass
 *
 * @author Denis Kononovich
 * @version 24.11.21
 */

package ru.geekbrains.qa.java2.lesson1.homeWork;
import ru.geekbrains.qa.java2.lesson1.homeWork.obstacleCourse.*;
import ru.geekbrains.qa.java2.lesson1.homeWork.team.*;

class MainClass {
    public static void main(String[] args) {
        Course c = new Course(new Cross(2), new Fight(3),
                new Jumping(2), new Swimming(4)); // Создаем полосу препятствий

        Team team = new Team("Победа", new TeamMember("Жорик", 1),
                new TeamMember("Йодик", 2), new TeamMember("Пашка", 4),
                new TeamMember("Сашка" ,1));

        c.doIt(team); // Просим команду пройти полосу

        team.showResults(); // Показываем результаты
    }
}