package carrotrab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarroTrab r = new CarroTrab();
            System.out.println("Digite o modelo do carro");
            r.setModel(scan.nextLine());
            System.out.println("Digite a marca do carro");
            r.setMarca(scan.nextLine());
            System.out.println("Digite o KM do carro");
            r.setKm(scan.nextFloat());
            System.out.println("Digite o ano do carro");
            r.setAno(scan.nextInt());       
            System.out.println(r.toString());                 
        }
    
}
