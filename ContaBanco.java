package com.company;

public class ContaBanco {
    //Atributos
    public int NumConta;
    protected String Tipo;
    protected String Dono;
    protected float Saldo;
    protected boolean Status;

    //Metodos Personalizados

        public void estadoAtual(){
            System.out.println("-----------------------------------------");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: "+ this.getSaldo());
            System.out.println("Status: " + this.getStatus());
        }

    //Estado Atual
    public void abrirConta(String t){
            this.setTipo(t);
            this.setStatus(true);
            if (t == "CC"){
                this.setSaldo(50);
            } else if (t == "CP"){
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!!");
        }

    public void fecharConta(){
           if (this.getSaldo()>0){
               System.out.println("Conta não pode ser fechada pois tem dinheiro!");
           } else if (this.getSaldo()<0){
               System.out.println("Conta não pode ser fechada pois está com débito!");
           } else {
               this.setStatus(false);
           }
            System.out.println("Conta fechada com sucesso!!");

        }

    public void depositar(float v){
            if (this.getStatus());{
                this.setSaldo(this.getSaldo() + v);{
                    System.out.println("Deposito realizado na conta " + this.getDono());
                }
                System.out.println("Impossivel depositar em uma conta fechada");

            }

        }

    public void sacar(float v){
            if (this.getStatus()){
                if (this.getSaldo()>=v){
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getDono());
                } else{
                    System.out.println("Saldo insuficiente!!");
                }
            }
        }

    //Método Costrutor

    public ContaBanco(){
        this.Saldo = 0;
        this.Status = false;
    }
    //Métodos Especiais

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int numConta) {
        NumConta = numConta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

