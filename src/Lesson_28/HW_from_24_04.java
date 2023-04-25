package Lesson_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  // Задача 1

// Написать метод  public static String decToBin(int number)
// который получит число и вернёт строку с его двоичной записью.
// Важно
// Во всех задачах для перебора чисел нельзя пользоваться перебором символов в строках
// и библиотечными функциями (вроде Integer.toHexString()).



public class HW_from_24_04 {
private static final int RADIX = 2;  // будем переводить в двоичную систему
  public static void main(String[] args) throws IOException {


    System.out.printf("Enter your decimal Number : %n%n");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(br.readLine());

    // String binaryStr = decToBin(number);
    System.out.printf("%nPlease wait...%n");
    System.out.printf("Converting to binary ...%n%n");
    System.out.println("Your binary Number is : ... " + decToBin(number));
  }
  public static String decToBin(int number) {

   number = Math.abs(number); // для целей деления и перебора чисел убрали знак

   if (number == 0) {       // вывод знака нуль, в случае input 0
     return "0";
   }
    String binStr = "";    // Создание и провозглашение пустой строки

    while (number != 0) {    // До тех пор, пока число отлично от нуля

      binStr = (number % RADIX) + binStr;  // подтягиваем остаток от деления в строку сначала и склеиваем
      number /= RADIX;                      // уменьшаем целое число в два раза
    }
    return binStr;  // возвращаем строку
  }
}



