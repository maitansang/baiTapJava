package com.company;
import javax.xml.crypto.dsig.XMLObject;
import java.util.Scanner;
import java.util.Random;
public class BaiTapJava {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int choice;
        System.out.printf("-------------MENU----------------------");
        System.out.println("nhap vao so can chon");
        System.out.println("1. Chuyen doi tien te");
        System.out.println("2. So xo kien thiet");
        System.out.println("3. Doc so thanh chu");
        choice = scaner.nextInt();
        switch(choice){
            case 1: ChuyenDoiTienTe(); break;
            case 2: XoSo();break;
            case 3: docSoThanhChu(); break;
        }

    }
    public static void bai1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap diem toan");
        float a= scanner.nextFloat();
        System.out.println("nhap diem ly");
        float b= scanner.nextInt();
        System.out.println("nhap diem hoa");
        float c= scanner.nextInt();
        System.out.println("diem trung binh la:" + (a+b+c)/3);
        System.out.println("tong diem la:"+(a+b+c));
    }
    public static void bai2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do C ");
        int c=scanner.nextInt();
        System.out.println(c +" do C chuyen qua do F la :"+ ((9/5)*c+32));
    }


    public static void ChuyenDoiTienTe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so tien USD\n");
        float a=scanner.nextFloat();
        System.out.print(a+ "USD =\t"+(a*23000)+"\tVND");

    }
    public static void TinhBMI (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap can nang:");
        float a=scanner.nextFloat();
        System.out.print("nhap chieu cao");
        float b=scanner.nextFloat();
        float BMI=a/(b*b);
        System.out.print("chi so IDM cua ban la IDM="+BMI);
        if(BMI<18.5) {
            System.out.print("Underweight");
        }else if(BMI>=18.5&&BMI<25){
            System.out.print("Normal");
        }else if(BMI>=25&&BMI<30){
            System.out.print("Overweight");
        }else System.out.print("Obese");

    }




    public static void TinhNamNhuan() {
        Scanner scanner =new Scanner(System.in) ;
        System.out.print("nhap vao nam :");
        int a=scanner.nextInt();
        if(a%4==0&&a%100!=0){
            System.out.printf("\t%d la nam nhuan",a);
        }else if(a%100==0&&a%400!=0){
            System.out.printf("\t%d khong phai nam nhuan",a);
        }else if(a%100==0&&a%400==0){
            System.out.printf("\t%d la nam nhuan ",a);
        }else System.out.println(a+"\tkhong phai nam nhuan");

    }
    public static void XoSo(){
        Random rd = new Random();
        int x=rd.nextInt(99);
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so hang don vi:");

        int guessDigiss1=scanner.nextInt();
        System.out.print("nhap vao so hang chuc");
        int guessDigiss2=scanner.nextInt();

        System.out.print("so do la :"+x );
        if (guessDigiss1 * 10 + guessDigiss2 == x){
            System.out.print("Chinh Xac phan thuong la 10000$");
        }else if( guessDigiss2 * 10+ guessDigiss1==x && guessDigiss1 != guessDigiss2){
            System.out.print(rd+"\t moi dung ban nhan duoc 1000$");
        }else System.out.print("ban khong trung");
    }

    public static void docSoThanhChu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao so tu nhien bat ki");
        int a=scanner.nextInt();
        if(a<10&&a>=0){
            read(a);
        }else if(a>=10&&a<100) {
            int donVi= a%10;
            int hangChuc=a/10;
            if (hangChuc==1){
                System.out.print("muoi");
            } else read(hangChuc);  System.out.print("muoi");
            read(donVi);
        } else if(a>=100&&a<1000){
            int hangTram = a/100;
            int hangChuc = (a-hangTram*100)/10;
            int donVi = a%100-hangChuc*10;
            read(hangTram);
            System.out.print("tram");
            if(hangChuc==1){
                System.out.print("muoi");

            }else{ read(hangChuc);};
            read(donVi);
        }


    }

    static void read(int a) {
        switch(a){
            case 0: System.out.print("khong"); break;
            case 1: System.out.print("mot");break;
            case 2: System.out.print("hai");break;
            case 3: System.out.print("ba");break;
            case 4: System.out.print("bon");break;
            case 5: System.out.print("nam");break;
            case 6: System.out.print("sau");break;
            case 7: System.out.print("bay");break;
            case 8: System.out.print("tam");break;
            case 9: System.out.print("chin");break;
            default: System.out.print("loi!!!!"); break;
        }

    }

}
