package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Уй", "Простой", (byte) 44);
        userService.saveUser("Лев", "Толстой", (byte) 94);
        userService.saveUser("Александр", "Пистолетов", (byte) 55);
        userService.saveUser("Джо", "Байден", (byte) 88);
        System.out.println(userService.getAllUsers().toString());

        userService.removeUserById(2);

        userService.dropUsersTable();
    }
}