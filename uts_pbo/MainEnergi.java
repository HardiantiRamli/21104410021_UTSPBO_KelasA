/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

import java.util.Scanner;

/**
 *
 * @author hardianti
 */
public class MainEnergi {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Kecepatan : ");
       double kecepatan = input.nextDouble();
       System.out.print("Masukkan massa : ");
       double massa = input.nextDouble();
       double rumus=(1/2*massa*kecepatan);
        System.out.println("Hasil : "+1/2*massa*kecepatan);
    }
}
