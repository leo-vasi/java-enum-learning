package com.leo.application;

import com.leo.entities.Department;
import com.leo.entities.HourContract;
import com.leo.entities.Worker;
import com.leo.enumeration.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Enter worker name: ");
        String workerName = sc.nextLine();

        System.out.print("Enter worker level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Enter worker base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts does this worker have?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.println("Enter contract #" + i + " data: ");

            System.out.print("Enter date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Enter value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Enter duration(hour): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        sc.nextLine();

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));




        sc.close();
    }
}