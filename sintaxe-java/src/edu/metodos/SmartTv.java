package edu.metodos;

public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void alternarLigado() {
    this.ligada = !this.ligada;
  }

  public void alterarVolume(String direcao) {
    if (this.ligada) {
      if (direcao == "aumentar") {
        this.volume++;
      } else if (direcao == "diminuir") {
        this.volume--;
      }
    }
  }

  public void mudarCanal(String direcao, Integer novoCanal) {
    if (ligada) {
      if (novoCanal != null) {
        canal = novoCanal;
      } else if (direcao == "aumentar") {
        this.canal++;
      } else if (direcao == "diminuir") {
        this.canal--;
      }
    }
  }
}
