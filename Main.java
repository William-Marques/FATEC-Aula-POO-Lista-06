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

class Main {
  public static void main(String[]args){
    
    try {

    Superior superior = new Superior();
    superior.setN1();
    superior.setN2();
    superior.setN3();
    
    double media = superior.CalculaMedia();
    superior.imprimirMedia(media);
    

    Tecnico tecnico = new Tecnico();
    tecnico.setN1();
    tecnico.setN2();
    tecnico.setN3();

    double mediaTecnico = tecnico.CalculaMedia();
    tecnico.imprimirMedia(mediaTecnico);

    } catch(Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage() + "Erro");
    }
  }
}
