package com.gokhankaplan.ucakbiletifiyat;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class UcakBiletiFiyatı {
    public static void main(String[] args) {
        int yas, yolculuktipi;
        double mesafe, ucret,yeniucret, yeniucret1;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi giriniz: ");
        mesafe = input.nextDouble();

        if (mesafe<0) {
            System.out.println("Yanlış sayı girdiniz!");
        } else {
            ucret = mesafe / 10;
            System.out.println("Ücretiniz:" + ucret);
            System.out.println("Lütfen yaşınızı giriniz: ");
            yas = input.nextInt();

            if (yas<0) {
                System.out.println("Yanlış sayı girdiniz!");
            } else {
                    if (yas<12) {
                        yeniucret = ucret * 0.50;
                        System.out.println("yeniucret: " + yeniucret);
                        System.out.println("Lütfen yolculuk tipini seçiniz: ");
                        yolculuktipi = input.nextInt();
                        if (yolculuktipi == 1 && yolculuktipi == 2) {
                            System.out.println("Yanlış sayı girdiniz!");
                        } else {
                            if (yolculuktipi == 2) {
                                yeniucret1 = (yeniucret * 0.80) * 2;
                                System.out.println("Gidiş Dönüş ücretiniz: " + yeniucret1);
                            }
                            else {
                                System.out.println("yeniucret: " + yeniucret);
                            }
                    }
                    }
                    else if (12<yas && yas<24) {
                        yeniucret = ucret * 0.90;
                        System.out.println("yeniucret: " + yeniucret);
                            System.out.println("Lütfen yolculuk tipini seçiniz: ");
                            yolculuktipi = input.nextInt();
                            if (yolculuktipi == 1 && yolculuktipi == 2) {
                                System.out.println("Yanlış sayı girdiniz!");
                            } else {
                                if (yolculuktipi == 2) {
                                    yeniucret1 = (yeniucret * 0.80) * 2;
                                    System.out.println("Gidiş Dönüş ücretiniz: " + yeniucret1);
                                }
                                else {
                                    System.out.println("yeniucret: " + yeniucret);
                                }
                    }
                        }
                    else if (24<yas && yas<65) {
                        System.out.println("Ücretiniz: " + ucret);
                    }
                    else if (yas>65) {
                        yeniucret = ucret * 0.70;
                        System.out.println("yeniucret: " + yeniucret);
                                System.out.println("Lütfen yolculuk tipini seçiniz: ");
                                yolculuktipi = input.nextInt();
                                if (yolculuktipi == 1 && yolculuktipi == 2) {
                                    System.out.println("Yanlış sayı girdiniz!");
                                } else {
                                    if (yolculuktipi == 2) {
                                        yeniucret1 = (yeniucret * 0.80) * 2;
                                        System.out.println("Gidiş Dönüş ücretiniz: " + yeniucret1);
                                    }
                                    else {
                                        System.out.println("yeniucret: " + yeniucret);
                                    }
                    }

                }


                        }
        }
        }

    }

