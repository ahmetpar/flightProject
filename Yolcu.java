package Z00_ucusProjesi;

import java.util.Scanner;
//************************************ Class *********************************************
    public class Yolcu {
    private String rota;
    private int flytype;
    int age;
    double priceB=50;// 500 km mesafe ye gore hesaplandi
    double priceC=70;// 700
    double priceD=90;//900
//************************************ Constructor ****************************************
    public Yolcu(String rota, int flytype, int age) {
        this.rota = rota;
        this.flytype = flytype;
        this.age = age;
    }
//************************************ Method **********************************************
    public void yolcuBilgileriGirisi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("javaAirlines'a hos geldin AGAM..\n B C D rotasından birini seciniz : ");
        rota = scan.next().toUpperCase();
        System.out.print("ucusunuz için \n tek yon-->1 \n cift yon-->2 \n giriniz : ");
        flytype = scan.nextInt();
        System.out.print("agam yasını da gir : ");
        age = scan.nextInt();
    }
//************************************ Method *************************************************
    public  void ucretHesapla() {
        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {
//******************************  > 65 *****************************************************************************
            if (age > 65) {//65 yas ustu kontrolu yas için %30 indirim
                switch (rota) {
                    case "B": //ucus rotası kontrolu
                        if (flytype == 1) {// ucus tek-cift yon kontrolu %20 indirim
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.7 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.7 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "C":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.7 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.7 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "D":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.7 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.7 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                }
            }
            //********************************************* yas 12-24 ******************************************
            else if (age > 12 && age < 24) {
                switch (rota) {
                    case "B":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.9 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.9 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "C":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.9 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.9 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "D":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.9 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.9 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                }
            }
            //****************************************yas <12
            else if (age <= 12) {
                switch (rota) {
                    case "B":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.5 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "C":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.5 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.5 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "D":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.5 + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.5 * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                }
            }
            //****************************** yas 24-65*************************************************
            else if (age >= 24 && age <= 65) {
                switch (rota) {
                    case "B":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceB + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "C":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceC + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    case "D":
                        if (flytype == 1) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + priceD + " $");
                        } else if (flytype == 2) {
                            System.out.println("   *****   ");
                            System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.8) * 2 + " $");
                        } else System.out.println("hatalı veri giridiniz");
                        break;
                    default:
                        System.out.println("agam adam gibi yas gir :(");
                        break;
                }
            } else System.out.println("agam henüz o gezegene ucus yok :)");
        }
    }
}
