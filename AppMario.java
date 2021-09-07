package com.company;

public class App {
    public static void main(String[] args) {
        System.out.println("Teste para ve se o Mario ganha Estamina");
        Mario mario = new Mario();
        mario.imprimeCaracteristicas();
        mario.perderEstamina();
        mario.imprimeCaracteristicas();
        System.out.println("---------------------------------------");

        System.out.println("Teste para ve se o Mario ganha Estamina");
        Mario mario2 = new Mario();
        mario2.imprimeCaracteristicas();
        mario2.perderEstamina(); //Perder 10 Estamina
        mario2.perderEstamina();//Perder 10 Estamina
        mario2.ganharEstamina(); //Ganhar 5 Estamina
        mario2.imprimeCaracteristicas();
        System.out.println("---------------------------------------");

        System.out.println("Teste para ve se o Mario mantem a Estamina a 100 apos o acrescimo desse valor");
        Mario mario3 = new Mario();
        mario3.imprimeCaracteristicas();
        mario.ganharEstamina();// Ganhar 5
        mario.ganharEstamina();// Ganhar 5
        mario3.imprimeCaracteristicas();
        mario3.imprimePoderes();
        System.out.println("---------------------------------------------------------");

        System.out.println("Teste para ve se o Mario mantém a estamina em 0 após o desconto até um valor menor que zero");
        Mario mario4 = new Mario();
        mario4.imprimeCaracteristicas();
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.imprimeCaracteristicas();
        mario4.perderEstamina(); //Perder 10
        mario4.perderEstamina(); //Perder 10
        mario4.imprimeCaracteristicas();
        System.out.println("------------------------------------------------------");

        System.out.println("Teste Para ve se o Mario Crese");
        Mario mario5 = new Mario();
        mario5.imprimeCaracteristicas();
        mario5.crescer();
        mario5.imprimeCaracteristicas();
        System.out.println("---------------------------------------------------------");

    }
}



