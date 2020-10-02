package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                int[] frequencia = new int[10];
                Scanner scanner = new Scanner(System.in);
                System.out.print(" Cuantas veces quieres tirar el dado?? ");

                int tiradas = scanner.nextInt();
                int primerdado;
                int segundodado;

                for(int i = 0; i < tiradas; ++i) {
                    primerdado = (int)(Math.random() * 5.0D) + 1;
                    segundodado = (int)(Math.random() * 5.0D) + 1;
                    ++frequencia[primerdado + segundodado - 1];
                }

                System.out.println("El resultado es...");

                for(int i = 1; i < 10; ++i) {
                    System.out.println(i + 1 + " ----> " + frequencia[i] + " vegades");
                }
             }
        }

