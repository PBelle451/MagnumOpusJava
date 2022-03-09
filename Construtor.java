package co.pedrobelle.magnumopus;

public class Construtor {
    public String frota;
    public String nome;
    public String serie;
    public int velocidade;

    public Construtor(String frota, String nome, String serie, int velocidade){
        this.frota = frota;
        this.nome = nome;
        this.serie = serie;
        this.velocidade = velocidade;
    }

    public void setFrota(String frota){
        this.frota = frota;
    }

    public String getFrota(){
        return frota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSerie(String serie){
        this.serie = serie;
    }

    public String getSerie(){
        return serie;
    }

    public void setVelocidade(int velocidade){
        if (velocidade > 10){
            System.out.println("Barreira excedida");
        } else if (velocidade < 0){
            System.out.println("Velocidade invalida");
        }
        this.velocidade = velocidade;
    }

    public int getVelocidade(){
        return velocidade;
    }
}
