/*
Criar uma classe para curso Superior contendo os seguintes atributos privativos à 
classe: N1, N2, N3. Deverá conter também o método público CalculaMedia().
Herdar da classe Superior os atributos e método gerando a subclasse Tecnico.
Na classe Superior:
N1 = Nota da P1;
N2 = Nota da P2;
N3 = Nota de trabalhos.
Média = (N1*0,35 + N2*0,5 + N3*0,15)
Na classe Tecnico:
N1 = Nota do 1º Trimestre;
N2 = Nota do 2º Trimestre;
N3 = Nota do 3º Trimestre;.
Média = (N1 + N2*2 + N3*2)/5;
Criar uma classe principal, instanciar um objeto a partir da classe Superior e outro 
objeto a partir da classe Tecnico.
Solicitar as notas e exibir as médias
*/

import javax.swing.JOptionPane;

public class Superior {
  protected double n1;
  protected double n2;
  protected double n3;

  public Superior() {

  }

  public Superior(double n1, double n2, double n3) {
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  public double CalculaMedia() 
  {
    return (this.n1 * 0.35 + this.n2 * 0.5 + this.n3 * 0.15);
  }

  public double getN1(){
    return n1;
  }

  public void setN1(){
    this.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 1 do Superior"));
  }
  
  public double getN2(){
    return n2;
  }

  public void setN2(){
    this.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 2 do Superior"));
  }

  public double getN3(){
    return n3;
  }

  public void setN3(){
    this.n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 3 do Superior"));
  }

  public void imprimirMedia(double media){
    JOptionPane.showMessageDialog(null, "Média final: " + media);
  }
}