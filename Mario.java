package com.company;

public class Mario {
    //Atributos
   private String nome;
   private double altura;
   private int idade;
   private int estamina;

   public Mario(){
       this.nome = "Mario Bros";
       this.altura = 1.50;
       this.idade = 40;
       this.estamina = 100;
   }


    //Método Construtor
    public Mario(String super_mario, int i, double v) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
    }

    //Método Personalizado ou Estado Atual
    public void imprimeCaracteristicas(){
        System.out.println("Mario: " + "Nome= '" + nome + '\'' + ", Altura= " + altura + ", Idade= " + idade + " Estamina= "+ estamina);
    }

     protected void imprimePoderes() {
        System.out.println("Super força, Super salto, super velocidade e outros.");
    }

    void perderEstamina(){
       this.estamina = this.estamina - 10;
        if (this.estamina < 0){
            this.estamina = 0;
        }
    }

    void ganharEstamina(){
       this.estamina = this.estamina + 5;
       if (this.estamina > 100){
           this.estamina = 100;
       }
    }

    void crescer(){
       this.altura = this.altura * 2;
    }

        //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
}
