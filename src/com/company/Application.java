package com.company;

import com.company.controllers.GroupController;
import com.company.controllers.StudentController;
import com.company.controllers.TaskController;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Database._listOfStudents;

public class Application {
    public void commands() {
        System.out.println("1 - Добавить студента\n2 - Удалить студента\n 3 - Добавить группу\n 4 - Удалить группу");

        var gcontr = new GroupController();
        var scontr = new StudentController();
        var tcontr = new TaskController();

        var sc = new Scanner(System.in);
        int numberOfCommand = sc.nextInt();
        if (numberOfCommand == 1) {
            System.out.println("введите имя");
            scontr.save(sc.nextLine());
            System.out.println("Студент сохранен");
        } else if (numberOfCommand == 2) {
            System.out.println("введите id");
            scontr.remove(sc.nextInt());
            System.out.println("Студент удален");
        } else if (numberOfCommand == 3) {
            System.out.println("введите id, и список студентов");
            var _listOfStudentId = new ArrayList<Integer>();
            gcontr.save(sc.nextInt(), _listOfStudentId);
            System.out.println("Группа сохранена");
        } else if (numberOfCommand == 4) {
            System.out.println("введите id группы");
            gcontr.remove(sc.nextInt());
        }
    }
}
