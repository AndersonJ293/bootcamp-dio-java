package edu.metodos;

import edu.metodos.SmartTv;

public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.alternarLigado();
    System.out.println("Tv ligada? " + smartTv.ligada);

    smartTv.alterarVolume("diminuir");
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.mudarCanal("aumentar", null);
    System.out.println("Canal atual: " + smartTv.canal);

    smartTv.mudarCanal(null, 21);
    System.out.println("Canal atual: " + smartTv.canal);
  }
}
