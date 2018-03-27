package automato;

import java.util.Scanner;

public class Automato {

    int contador;
    char cadeia[];

    public static void main(String[] args) {
        
        Automato auto = new Automato();
        String subCadeia;
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque sua cadeia: ");
        subCadeia = input.nextLine();
        auto.cadeia = subCadeia.toCharArray();
        auto.Inicio();

    }
    public void Inicio(){
        contador = 0;
        q0();
    }
    public void q0() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == '0') {
                contador++;
                q1();
            } else if (cadeia[contador] == '1') {
                contador++;
                q0();
            }
        }else{
             qErro();
        }
    }
    public void q1(){
        if (contador < cadeia.length) {
            if (cadeia[contador] == '0') {
                contador++;
                q2();
            } else if (cadeia[contador] == '1') {
                contador++;
                q0();
            }
        }else{
             qErro();
        }
        
    }
    public void q2(){
        if (contador < cadeia.length) {
            if (cadeia[contador] == '1') {
                contador++;
                q2();
            } else if (cadeia[contador] == '0') {
                contador++; 
                q1();
            }
        }else{
             End();
        }
    }
  
    public void End(){
        System.out.println("Cadeia aceita!");
       
    
    }
    public void qErro(){
         System.out.println("Cadeia NÃO aceita!");
        
    }
    

}
