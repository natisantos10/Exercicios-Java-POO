package com.company;

public class AppContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Leonardo");
        p1.abrirConta("CC");


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Antonella");
        p2.abrirConta("CP");


        p1.depositar(100);
        p2.depositar(500);
        p1.sacar(50);
        p2.sacar(200);

        p1.estadoAtual();
        p2.estadoAtual();
        }
    }
