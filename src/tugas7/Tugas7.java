/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;
import java.util.Scanner;
/**
 *
 * @author FARIHATU
 */
public class Tugas7 {
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai untuk persamaan ax + by = e");
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();

        System.out.println("\nMasukkan nilai untuk persamaan cx + dy = f");
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("\nPersamaan memiliki solusi, dengan:");
            System.out.println("Nilai x: " + equation.getX());
            System.out.println("Nilai y: " + equation.getY());
        } else {
            System.out.println("\nPersamaan tidak memiliki solusi.");
        }
    }
    
}
