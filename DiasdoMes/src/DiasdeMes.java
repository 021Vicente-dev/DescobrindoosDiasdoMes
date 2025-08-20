import java.util.Scanner;

public class DiasdeMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do mês:");
        String mes = scanner.nextLine().toUpperCase();


    switch (mes) {
        case "JANEIRO", "MARÇO", "MAIO", "JULHO", "AGOSTO", "OUTUBRO", "DEZEMBRO" -> System.out.println("Contem 31 dias no mês");
        case "ABRIL", "JUNHO", "SETEMBRO", "NOVEMBRO" -> System.out.println("Contem 30 dias no mês");
        case "FEVEREIRO" -> System.out.println("Contem 28 dias no mês ou 29 em anos bissextos");
        default -> System.out.println("Mês inválido");
    }
        scanner.close();
    }
}