package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Rakam giriniz.");
            String degree = scanner.next();
            double d = 0.0;

            try {
                d = Double.parseDouble(degree);
            } catch (Exception e) {
                System.out.println("Girmiş olduğunuz değer bir sayı değildir. Lütfen sayı giriniz.");
                return;
            }

            System.out.println("Girdiğiniz değeri celciusa dönüştürmek için C; Fahreneite dönüştürmek için F yazınız");
            String convertType = scanner.next();

            if (!(convertType.equals("F") || convertType.equals("C"))) {
                System.out.println("Yanlış harf!.Lütfen Celcius için C veya Fahreneit için F değerini giriniz.");
                return;
            }

            if (convertType.equals("F")) {
                double fahreneit = (d * 9 / 5) + 32;
                System.out.printf("Girmiş olduğunuz %.0f Celciusun karşılığı %.1f Fahreneittir.", d, fahreneit);
                return;
            } else if (convertType.equals("C")) {
                double celcius = (d - 32) * 5 / 9;
                System.out.printf("Girmiş olduğunuz %.0f Fahreneitin karşılığı %.1f Celciustur.", d, celcius);
                return;
            }

        }catch (Exception e){
            System.out.println("Sistemsel bir hata oluştu.");
        }

    }

}
