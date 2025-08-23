package ex4;

public class main {
    public static void main(String[] args) {

        int n1 = 7;
        int n2 = 8;
        int n3 = 9;
        int media;

        media = (n1 + n2 + n3) /3 * 10 ;

        if (media <40){
            System.out.println("você está reprovado: " + media);
        }
        else if (media >=70){
            System.out.println("você está aprovado: " + media);
        }
        else{
            System.out.println("você está na final: " + media);
        }


    }
}
