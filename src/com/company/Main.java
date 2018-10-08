package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

   public static void main(String[] args)
// 1.mesele(tekrardan){
//
////
////    Scanner input = new Scanner(System.in);
////    int eded = input.nextInt();
////    if (eded >= 10000){
////
////        int a,b,c,d,e,f,g,h;
////        a= eded / 10000;
////        e = eded % 10;
////        f = eded / 1000;
////        b = f % 10;
////        g = eded/100;
////        c = g%10;
////        h = eded/10;
////        d = h%10;
////        System.out.printf("%d %d %d %d %d",a,b,c,d,e);
////
////
////
////
////    }
////    else
////        System.out.println("Zehmet olmazsa  5reqemli eded daxil edin");
////
////
////
////
//
//   }
// 2. mesele (tekrardan)
//   {
//       Scanner input = new Scanner(System.in);
//      double a = input.nextInt();
//       double b = input.nextInt();
//       double c= input.nextInt();
//       double D = Math.pow(b,2)-4*a*c;
//       double x1 = (-b+Math.sqrt(D))/(2*a);
//       double x2 = (-b-Math.sqrt(D))/(2*a);
//       if (D>0){
//           System.out.printf("%d %d",x1,x2);}
//       else if (D <0){
//           System.out.print("Koku yoxdur");}
//       else if (D ==0) {
//           System.out.print("Kokleri beraberdir : "+ x1);
//       }
//
//
//
//
//   }
//1.mesele
//   {
//       Scanner input = new Scanner(in);
//       int a = input.nextInt();
//       int b = input.nextInt();
//       int c = 0;
//       int d =0;
//       for (int i = a; b >= a; a++) {
//           c = c + a;
//           d = c / (b-a+1);
//
//       }
//      out.print(c);
//       out.print(d);
//
//
//
//
//   }
   //2.mesele
//     {
//       Scanner input = new Scanner(in);
//       double N = input.nextDouble();
//       if ( N >= 0){
//           for (int i = 0;i<=N;i++){
//
//               out.println(Math.pow(i,3));
//           }
//       }
//       else{
//           for (int i = 0;i>=N;i--){
//               out.println(Math.pow(i,3));
//           }
//       }
//
//   }
//3.mesele
//   {
//       Scanner input = new Scanner(in);
//       double N = input.nextDouble();
//       for (int i =1;i<=N;i++){
//           if ( i%2==0){
//               out.println(i);
//           }
//       }
//   }
   // 6.mesele
//   {
//       for ( int i =1; i<=10;i++){
//           for (int a =1;a<=10;a++){
//               int c = i *a;
//               out.printf("%d * %d = %d\n",i,a,c);
//           }out.println();
//       }
//   }
   // 7.mesele
//   {
//       out.println("N");
//       for ( int i =1;i<=5;i++){
//
//           out.println(i);
//       }
//       out.println();
//       out.println("N*10");
//       for (int i =1;i<=5;i++){
//           int a = i *10;
//           out.println(a);}
//           out.println();
//       out.println("N*100");
//       for ( int i = 1; i <=5;i++){
//           int b = i *100;
//           out.println(b);}
//           out.println();
//       out.println("N*1000");
//       for ( int i =1 ; i <=5;i++){
//           int c = i*1000;
//           out.println(c);
//       }
//   }
   //4.mesele
//   {
////       Scanner input = new Scanner(in);
////       int a = input.nextInt();
////       for (int i = 0 ; i <= a;i++)
////       {
////           for(int j =0;j <=a;j++){
////               if ( i == j *j){
////                   out.println(i);
////               }
//}
   //5.mesele
//   {
//      Scanner input = new Scanner(System.in);
//      int a = input.nextInt();
//      for (int i =1;i<=a;i*=2){
//         System.out.println(i);
//      }
//   }
   //8.mesele
//
//   {   float largest = 0;
//      Scanner input = new Scanner(System.in);
//      for (int i =1;i<=4;i++) {
//         float reqem = input.nextFloat();
//
//         if (largest < reqem) {
//            largest = reqem;
//
//         }
//      }
//      System.out.println(largest);
//   }
   // 9.mesele
//            for (int i =1;i<=4;i++){
//////            for (int j =1;j<=i;j++){
//////                System.out.print(j);
//////            }
//////            System.out.println();
//////        }

   //10.mesele
//   {
//      for (int i =1;i<=4;i++){
//         for (int j =1;j<=i;j++){
//            System.out.print(i);
//         }
//         System.out.println();
//
//      }
//
//   }
   // 11.mesele
//        int a = 0;
//     for (int i =1;i<=4;i++) {
//
//         for (int j = 1; j <= i; j++) {
//           a++;
//           System.out.print(a);
//         }
//        System.out.println();
//     }
   //11.mesele

   //12.mesele
//   {
//      for (int i =1;i<=10;i++){
//         for (int j =1;j<=i;j++){
//            System.out.print("*");
//         }
//         System.out.println();
//      }
//   }
//   {
//      for ( int i = 1;i<=10;i++){
//
//         for (int j =1;j<=(10-i);j++){
//            System.out.print("*");
//         }
//         System.out.println();
//      }
//   }

//   {
//      for (int i = 1;i<=10;i++){
//         for ( int a=0;a<=i;a++){
//            System.out.print(" ");
//         }
//         for ( int j =1;j<=(10-i);j++){
//            System.out.print("*");
//         }
//         System.out.println();
//      }
//   }
//   {
//      for (int i =1;i<=10;i++){
//         for ( int a = 0; a<=(10-i);a++){
//            System.out.print(" ");
//         }
//         for ( int j =1;j<=i;j++){
//            System.out.print("*");
//         }
//         System.out.println();
//      }
//   }
//13.mesele
//   {
//      for ( int i=1;i<=10;i++){
//         for (int j =1; j <=i;j++){
//            System.out.print("*");
//         }
//         System.out.println();
//         for(int j =1; j <=(10-i);j++){
//            System.out.print("*");
//         }
//         System.out.println();
//
//
//
//
//
//
//      }
//   }


//Ders 3un tapsiriqlari
           //1.tapsiriq
//   {
//
//int a = 5;
//System.out.println(isaresi(a));
//
//
//
//   }
//
//   static boolean isaresi ( int reqem){
//      if ( reqem > 0){
//         return true;
//      }
//      else if ( reqem <0){
//         return false;
//      }
//      else
//         return Boolean.parseBoolean("0 ne musbet ne de menfi ededdir");
//  }
   //2.tapsiriq
//
//   {
//
//System.out.println(fkt(5));
//   }
//   static int fkt (int reqem){
//        int a = 1;
//        for ( int i =1;i<=reqem;i++){
//          a = a *i;
//
//
//        }
//        return a;
//}
           //3.tapsiriq
//   {
//      Scanner input = new Scanner(System.in);
//      int a = input.nextInt();
//   pattern(a);
//
//   }
//   static void pattern ( int siraninsayi){
//      for (int i=1;i <=siraninsayi;i++){
//         for ( int j =1;j<=i;j++){
//          System.out.print(j);
//         }
//         System.out.println();
//
//     }
//   }
//4.tapsiriq
//   {
//      System.out.println(hipetonuz(3,4));
//   }
//   static float hipetonuz ( float uzunluq,float en){
//      float hipetonuz = (float) Math.sqrt((Math.pow(uzunluq,2)+Math.pow(en,2)));
//   return hipetonuz;
//   }
//5.tapsiriq
//   {
//      System.out.println(mod(5,3));
//   }
//   static int mod(int bolunen, int bolen){
//
//      int mod = bolunen % bolen;
//
//
//      return mod;
//   }
   {
      int a =1;

   }
}




