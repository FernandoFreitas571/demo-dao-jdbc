package fernando.com.application;

import fernando.com.db.DB;
import fernando.com.db.DbIntegrityException;
import fernando.com.model.entities.Department;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        System.out.println(obj);
        System.out.println();
    }
}