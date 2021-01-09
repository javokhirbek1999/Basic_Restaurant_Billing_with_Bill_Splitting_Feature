package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantBill_with_Bill_Splitting_Feature {

    private static Scanner sc = new Scanner(System.in);
    private static Map<String, Double> total_amount = new LinkedHashMap<>();
    private static int people;
    private static double total_bill = 0.0;

    public static void main(String[] args) {

        System.out.println("Enter the number of people: ");
        people = sc.nextInt();
        initMenu();
    }

    private static void initMenu() {
        System.out.println("1. Uzbek Meals" +
                "\n" +
                "2. European Meals" +
                "\n" +
                "3. American Meals" +
                "\n" +
                "4. Drinks" +
                "\n" +
                "5. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                uzbekFood();
                break;
            case 2:
                euroFood();
                break;
            case 3:
                americanFood();
                break;
            case 4:
                drinks();
                break;
            default:
                break;
        }
    }

    private static void uzbekFood() {
        System.out.println("\t1. Osh" +
                "\n" +
                "\t2. Shorva" +
                "\n" +
                "\t3. Qotirma" +
                "\n" +
                "\t4. Mastava" +
                "\n" +
                "\t5. Dimlama" +
                "\n" +
                "\t6. Somsa" +
                "\n" +
                "\t7. Manti" +
                "\n" +
                "\t8. Shashlik (Qiyma) " +
                "\n" +
                "\t9. Shashlik (To'g'ramchi) " +
                "\n" +
                "\t10. Show Cart" +
                "\n" +
                "\t11. Proceed" +
                "\n" +
                "\t12. Go back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int n = sc.nextInt();
                if (n==-1) {
                    uzbekFood();
                } else {
                    total_amount.put("Osh" + "\t(" + n + ")", n * 10000.0);
                    if (n<=1) {
                        System.out.println((n) + " Osh has been added to the cart");
                    } else {
                        System.out.println((n) + " Osh have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 2:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int sh = sc.nextInt();
                if (sh == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Shorva " + "\t(" + sh + ")",sh * 8000.0);
                    if (sh<=1) {
                        System.out.println((sh) + " Shorva has been added to the cart");
                    } else {
                        System.out.println((sh) + " Shorva have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 3:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int q = sc.nextInt();
                if (q == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Qotirma " + "\t(" + q + ")", q * 14000.0);
                    if (q<=1) {
                        System.out.println((q) + " Qotirma has been added to the cart");
                    } else {
                        System.out.println((q) + " Qotirma have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 4:
                System.out.println("Enter the number of reservations: ");
                int m = sc.nextInt();
                if (m == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Mastava" + "\t(" + m + ")", m * 6000.0);
                    if (m<=1) {
                        System.out.println((m) + " Mastava has been added to the cart");
                    } else {
                        System.out.println((m) + " Mastava have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 5:
                System.out.println("Enter the number of reservations: ");
                int d = sc.nextInt();
                if (d == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Dimlama" + "\t(" + d + ")", d * 12000.0);
                    if (d<=1) {
                        System.out.println((d) + " Dimlama has been added to the cart");
                    } else {
                        System.out.println((d) + " Dimlama have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 6:
                System.out.println("Enter the number of reservations: ");
                int s = sc.nextInt();
                if (s == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Somsa" + "\t(" + s + ")", s * 2500.0);
                    if (s<=1) {
                        System.out.println((s) + " Somsa has been added to the cart");
                    } else {
                        System.out.println((s) + " Somsa have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 7:
                System.out.println("Enter the number of reservations: ");
                int ma = sc.nextInt();
                if (ma == -1) {
                  uzbekFood();
                } else {
                    total_amount.put("Manti" + "\t(" + ma + ")", ma * 1000.0);
                    if (ma<=1) {
                        System.out.println((ma) + " Manti has been added to the cart");
                    } else {
                        System.out.println((ma) + " Manti have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 8:
                System.out.println("Enter the number of reservations: ");
                int qsh = sc.nextInt();
                if (qsh == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Shashlik (Qiyma)" + "\t(" + qsh + ")", qsh * 10000.0);
                    if (qsh<=1) {
                        System.out.println((qsh) + " Shashlik (Qiyma) has been added to the cart");
                    } else {
                        System.out.println((qsh) + " Shashlik (Qiyma) have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 9:
                System.out.println("Enter the number of reservations: ");
                int tsh = sc.nextInt();
                if (tsh == -1) {
                    uzbekFood();
                } else {
                    total_amount.put("Shashlik (To'g'ramchi)" + "\t(" + tsh + ")", tsh * 12000.0);
                    if (tsh<=1) {
                        System.out.println((tsh) + " Shashlik (To'g'ramchi) has been added to the cart");
                    } else {
                        System.out.println((tsh) + " Shashlik (To'g'ramchi) have been added to the cart");
                    }
                    uzbekFood();
                }
                break;
            case 10:
                showCart();
                break;
            case 11:
                proceedPayment();
                break;
            case 12:
                initMenu();
                break;
        }
    }

    //Euro Food Menu:
    private static void euroFood() {
        System.out.println("\t1. Escudella" +
                "\n" +
                "\t2. Byrek" +
                "\n" +
                "\t3. Strudel" +
                "\n" +
                "\t4. Cevapi" +
                "\n" +
                "\t5. Bulgarian Soup" +
                "\n" +
                "\t6. Smorrebrod" +
                "\n" +
                "\t7. Rye Bread" +
                "\n" +
                "\t8. Karelian Pies " +
                "\n" +
                "\t9. Khinkali " +
                "\n" +
                "\t10. Show Cart" +
                "\n" +
                "\t11. Proceed" +
                "\n" +
                "\t12. Go back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int n = sc.nextInt();
                if (n==-1) {
                    euroFood();
                } else {
                    total_amount.put("Escudella"  + "\t(" + n + ")", n * 15000.0);
                    if (n<=1) {
                        System.out.println((n) + " Escudella has been added to the cart");
                    } else {
                        System.out.println((n) + " Escudella have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 2:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int sh = sc.nextInt();
                if (sh == -1) {
                    euroFood();
                } else {
                    total_amount.put("Byrek" + "\t(" + sh + ")",sh * 11000.0);
                    if (sh<=1) {
                        System.out.println((sh) + " Byrek has been added to the cart");
                    } else {
                        System.out.println((sh) + " Byrek have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 3:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int q = sc.nextInt();
                if (q == -1) {
                    euroFood();
                } else {
                    total_amount.put("Strudel" + "\t(" + q + ")", q * 13000.0);
                    if (q<=1) {
                        System.out.println((q) + " Strudel has been added to the cart");
                    } else {
                        System.out.println((q) + " Strudel have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 4:
                System.out.println("Enter the number of reservations: ");
                int m = sc.nextInt();
                if (m == -1) {
                    euroFood();
                } else {
                    total_amount.put("Cevapi" + "\t(" + m + ")", m * 5000.0);
                    if (m<=1) {
                        System.out.println((m) + " Cevapi has been added to the cart");
                    } else {
                        System.out.println((m) + " Cevapi have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 5:
                System.out.println("Enter the number of reservations: ");
                int d = sc.nextInt();
                if (d == -1) {
                    euroFood();
                } else {
                    total_amount.put("Bulgarian Soup" + "\t(" + d + ")", d * 8500.0);
                    if (d<=1) {
                        System.out.println((d) + " Bulgarian Soup has been added to the cart");
                    } else {
                        System.out.println((d) + " Bulgarian Soup have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 6:
                System.out.println("Enter the number of reservations: ");
                int s = sc.nextInt();
                if (s == -1) {
                    euroFood();
                } else {
                    total_amount.put("Smorrebrod" + "\t(" + s + ")", s * 2500.0);
                    if (s<=1) {
                        System.out.println((s) + " Smorrebrod has been added to the cart");
                    } else {
                        System.out.println((s) + " Smorrebrod have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 7:
                System.out.println("Enter the number of reservations: ");
                int ma = sc.nextInt();
                if (ma == -1) {
                    euroFood();
                } else {
                    total_amount.put("Rye Bread" + "\t(" + ma + ")", ma * 4500.0);
                    if (ma<=1) {
                        System.out.println((ma) + " Rye Bread has been added to the cart");
                    } else {
                        System.out.println((ma) + " Rye Bread have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 8:
                System.out.println("Enter the number of reservations: ");
                int qsh = sc.nextInt();
                if (qsh == -1) {
                    euroFood();
                } else {
                    total_amount.put("Karelian Pies" + "\t(" + qsh + ")", qsh * 7000.0);
                    if (qsh<=1) {
                        System.out.println((qsh) + " Karelian Pies has been added to the cart");
                    } else {
                        System.out.println((qsh) + " Karelian Pies have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 9:
                System.out.println("Enter the number of reservations: ");
                int tsh = sc.nextInt();
                if (tsh == -1) {
                    euroFood();
                } else {
                    total_amount.put("Khinkali" + "\t(" + tsh + ")", tsh * 9500.0);
                    if (tsh<=1) {
                        System.out.println((tsh) + " Khinkali has been added to the cart");
                    } else {
                        System.out.println((tsh) + " Khinkali have been added to the cart");
                    }
                    euroFood();
                }
                break;
            case 10:
                showCart();
                break;
            case 11:
                proceedPayment();
                break;
            case 12:
                initMenu();
                break;
        }
    }

    private static void americanFood() {
        System.out.println("\t1. Key lime pie" +
                "\n" +
                "\t2. Tater tots" +
                "\n" +
                "\t3. Pot roast" +
                "\n" +
                "\t4. Fajitas" +
                "\n" +
                "\t5. Gorp " +
                "\n" +
                "\t6. Jambalaya" +
                "\n" +
                "\t7. Cheeseburger" +
                "\n" +
                "\t8. Philly cheese steak " +
                "\n" +
                "\t9. Nachos " +
                "\n" +
                "\t10. Show Cart" +
                "\n" +
                "\t11. Proceed" +
                "\n" +
                "\t12. Go back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int n = sc.nextInt();
                if (n==-1) {
                    americanFood();
                } else {
                    total_amount.put("Key lime pie"+ "\t(" + n + ")", n * 15000.0);
                    if (n<=1) {
                        System.out.println((n) + " Key lime pie has been added to the cart");
                    } else {
                        System.out.println((n) + " Key lime pies have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 2:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int sh = sc.nextInt();
                if (sh == -1) {
                    americanFood();
                } else {
                    total_amount.put("Tater tots" + "\t(" + sh + ")",sh * 11000.0);
                    if (sh<=1) {
                        System.out.println((sh) + " Tater tots has been added to the cart");
                    } else {
                        System.out.println((sh) + " Tater tots have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 3:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int q = sc.nextInt();
                if (q == -1) {
                    americanFood();
                } else {
                    total_amount.put("Pot roast" + "\t(" + q + ")", q * 13000.0);
                    if (q<=1) {
                        System.out.println((q) + " Pot roast has been added to the cart");
                    } else {
                        System.out.println((q) + " Pot roasts have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 4:
                System.out.println("Enter the number of reservations: ");
                int m = sc.nextInt();
                if (m == -1) {
                    americanFood();
                } else {
                    total_amount.put("Fajitas" + "\t(" + m + ")", m * 5000.0);
                    if (m<=1) {
                        System.out.println((m) + " Fajitas has been added to the cart");
                    } else {
                        System.out.println((m) + " Fajitas have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 5:
                System.out.println("Enter the number of reservations: ");
                int d = sc.nextInt();
                if (d == -1) {
                    americanFood();
                } else {
                    total_amount.put("Gorp" + "\t(" + d + ")", d * 8500.0);
                    if (d<=1) {
                        System.out.println((d) + " Gorp has been added to the cart");
                    } else {
                        System.out.println((d) + " Gorp have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 6:
                System.out.println("Enter the number of reservations: ");
                int s = sc.nextInt();
                if (s == -1) {
                    americanFood();
                } else {
                    total_amount.put("Jambalaya" + "\t(" + s + ")", s * 2500.0);
                    if (s<=1) {
                        System.out.println((s) + " Jambalaya has been added to the cart");
                    } else {
                        System.out.println((s) + " Jambalaya have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 7:
                System.out.println("Enter the number of reservations: ");
                int ma = sc.nextInt();
                if (ma == -1) {
                    americanFood();
                } else {
                    total_amount.put("Cheeseburger" + "\t(" + ma + ")", ma * 4500.0);
                    if (ma<=1) {
                        System.out.println((ma) + " Cheeseburger has been added to the cart");
                    } else {
                        System.out.println((ma) + " Cheeseburger have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 8:
                System.out.println("Enter the number of reservations: ");
                int qsh = sc.nextInt();
                if (qsh == -1) {
                    americanFood();
                } else {
                    total_amount.put("Philly cheese steak" + "\t(" + qsh + ")", qsh * 7000.0);
                    if (qsh<=1) {
                        System.out.println((qsh) + " Philly cheese steak has been added to the cart");
                    } else {
                        System.out.println((qsh) + " Philly cheese steak have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 9:
                System.out.println("Enter the number of reservations: ");
                int tsh = sc.nextInt();
                if (tsh == -1) {
                    americanFood();
                } else {
                    total_amount.put("Nachos" + "\t(" + tsh + ")", tsh * 9500.0);
                    if (tsh<=1) {
                        System.out.println((tsh) + " Nachos has been added to the cart");
                    } else {
                        System.out.println((tsh) + " Nachos have been added to the cart");
                    }
                    americanFood();
                }
                break;
            case 10:
                showCart();
                break;
            case 11:
                proceedPayment();
                break;
            case 12:
                initMenu();
                break;
        }
    }

    private static void drinks() {
        System.out.println("\t1. Green Tea" +
                "\n" +
                "\t2. Black Tea" +
                "\n" +
                "\t3. Apple Juice" +
                "\n" +
                "\t4. Red Cherry Juice" +
                "\n" +
                "\t5. Royal English Breakfast Tea " +
                "\n" +
                "\t6. Coffee" +
                "\n" +
                "\t7. Cappuccino" +
                "\n" +
                "\t8. Cafe Americano " +
                "\n" +
                "\t9. Kiwi Starfruit Starbucks Refresher " +
                "\n" +
                "\t10. Show Cart" +
                "\n" +
                "\t11. Proceed" +
                "\n" +
                "\t12. Go back");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int n = sc.nextInt();
                if (n==-1) {
                    drinks();
                } else {
                    total_amount.put("Green Tea"+ "\t(" + n + ")", n * 15000.0);
                    if (n<=1) {
                        System.out.println((n) + " Green Tea has been added to the cart");
                    } else {
                        System.out.println((n) + " Green Tea have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 2:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int sh = sc.nextInt();
                if (sh == -1) {
                    drinks();
                } else {
                    total_amount.put("Black Tea" + "\t(" + sh + ")",sh * 11000.0);
                    if (sh<=1) {
                        System.out.println((sh) + " Black Tea has been added to the cart");
                    } else {
                        System.out.println((sh) + " Black Tea have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 3:
                System.out.println("Enter -1 to go back");
                System.out.println();
                System.out.println("Enter the number of reservations: ");
                int q = sc.nextInt();
                if (q == -1) {
                    drinks();
                } else {
                    total_amount.put("Apple Juice" + "\t(" + q + ")", q * 13000.0);
                    if (q<=1) {
                        System.out.println((q) + " Apple Juice has been added to the cart");
                    } else {
                        System.out.println((q) + " Apple Juice have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 4:
                System.out.println("Enter the number of reservations: ");
                int m = sc.nextInt();
                if (m == -1) {
                    drinks();
                } else {
                    total_amount.put("Red Cherry Juice" + "\t(" + m + ")", m * 5000.0);
                    if (m<=1) {
                        System.out.println((m) + " Red Cheery Juice has been added to the cart");
                    } else {
                        System.out.println((m) + " Red Cheery Juice have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 5:
                System.out.println("Enter the number of reservations: ");
                int d = sc.nextInt();
                if (d == -1) {
                    drinks();
                } else {
                    total_amount.put("Royal English Breakfast Tea" + "\t(" + d + ")", d * 8500.0);
                    if (d<=1) {
                        System.out.println((d) + " Royal English Breakfast Tea has been added to the cart");
                    } else {
                        System.out.println((d) + " Royal English Breakfast Tea have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 6:
                System.out.println("Enter the number of reservations: ");
                int s = sc.nextInt();
                if (s == -1) {
                    drinks();
                } else {
                    total_amount.put("Coffee" + "\t(" + s + ")", s * 2500.0);
                    if (s<=1) {
                        System.out.println((s) + " Coffee has been added to the cart");
                    } else {
                        System.out.println((s) + " Coffee have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 7:
                System.out.println("Enter the number of reservations: ");
                int ma = sc.nextInt();
                if (ma == -1) {
                    drinks();
                } else {
                    total_amount.put("Cappuccino" + "\t(" + ma + ")", ma * 4500.0);
                    if (ma<=1) {
                        System.out.println((ma) + " Cappuccino has been added to the cart");
                    } else {
                        System.out.println((ma) + " Cappuccino have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 8:
                System.out.println("Enter the number of reservations: ");
                int qsh = sc.nextInt();
                if (qsh == -1) {
                    drinks();
                } else {
                    total_amount.put("Cafe Americanok" + "\t(" + qsh + ")", qsh * 7000.0);
                    if (qsh<=1) {
                        System.out.println((qsh) + " Cafe Americano has been added to the cart");
                    } else {
                        System.out.println((qsh) + " Cafe Americano have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 9:
                System.out.println("Enter the number of reservations: ");
                int tsh = sc.nextInt();
                if (tsh == -1) {
                    drinks();
                } else {
                    total_amount.put("Kiwi Starfruit Starbucks Refresher" + "\t(" + tsh + ")", tsh * 9500.0);
                    if (tsh<=1) {
                        System.out.println((tsh) + " Kiwi Starfruit Starbucks Refresher has been added to the cart");
                    } else {
                        System.out.println((tsh) + " Kiwi Starfruit Starbucks Refresher have been added to the cart");
                    }
                    drinks();
                }
                break;
            case 10:
                showCart();
                break;
            case 11:
                proceedPayment();
                break;
            case 12:
                initMenu();
                break;
        }
    }

    private static void showCart() {
        System.out.println();
        int i = 1;
        for (String map:total_amount.keySet()) {
            System.out.println(i +". "+ map);
            i++;
        }
        for (Double amount:total_amount.values()) {
            total_bill+=amount;
        }
        System.out.println("\n1. Show Bill" +
                "\n" +
                "2. Main Menu");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                showBill();
                break;
            case 2:
                initMenu();
                break;
        }
    }

    public static void showBill() {
        System.out.println();
        System.out.println("Total Bill: " + total_bill);
        System.out.println();
        System.out.println("Budget/person: " + total_bill/people);
        System.out.println();
        System.out.println("1. Proceed Payment" +
                "\n" +
                "2. Main Menu");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                proceedPayment();
                break;
            case 2:
                initMenu();
                break;
            default:
                initMenu();
                break;
        }
    }

    public static void proceedPayment() {
        System.out.println("\nSelect Debit Card: " +
                "\n" +
                "1. Visa" +
                "\n" +
                "2. MasterCard" +
                "\n" +
                "3. PayPal" +
                "\n" +
                "4. Main Menu");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nEnter Visa Card Number: ");
                String visa = sc.next().trim();
                System.out.println();
                System.out.println("Enter CVV: ");
                String cvv = sc.next().trim();
                System.out.println();
                if (!visa.contains(" ")&&visa.replaceAll("\\d", "").length()==0&&visa.length()==16&&cvv.length()==3) {
                    Thread thread = new Thread();
                    System.out.print("Please wait");
                    for (int i = 0; i<10; i++) {
                        try {
                            Thread.sleep(1000);
                            System.out.print(".");
                        }catch (InterruptedException e) {
                            System.out.println("\nOperation has been interrupted");
                        }
                    }
                    System.out.println();
                    System.out.println("\nPayment Successful");
                    System.out.println("\nHope you loved our restaurant ! ");
                    System.out.println("\nSee you again, InshaAllah");
                    thread.start();
                    initMenu();
                } else {
                    System.out.println("Please enter valid card number: ");
                    proceedPayment();
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                initMenu();
            default:
                initMenu();
                break;
        }
    }
}
