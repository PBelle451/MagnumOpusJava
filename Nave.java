package co.pedrobelle.magnumopus;

import co.pedrobelle.magnumopus.Construtor;

public class Nave {
    public static void main(String[] args){
        Construtor[] construtors = new Construtor[]{
                new Construtor("USS", "Enterprise", "NCC-1701", 8),
                new Construtor("FAEB", "Minas Gerais", "TASM-0463", 5)
        };

        construtors[0].setFrota("FAEB");
        construtors[0].setNome("São Paulo");
        construtors[0].setSerie("TASM-0588");
        construtors[0].setVelocidade(10);

        System.out.println("Nave: " + construtors[0].getFrota() + " " + construtors[0].getNome() + " " + construtors[0].getSerie() + "\nVelocidade: " + construtors[0].getVelocidade() + " warps");
        System.out.println("Nave: " + construtors[1].getFrota() + " " + construtors[1].getNome() + " " + construtors[1].getSerie() + "\nVelocidade: " + construtors[1].getVelocidade() + " warps");
    }
}
