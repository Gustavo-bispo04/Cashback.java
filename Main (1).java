import java.util.Scanner;

public class Main {
    public static double calcularCashback(int idade, double valordaCompra) {
        double cashback;
        
        if (idade >= 21) {
            if (valordaCompra <= 1000) {
                cashback = valordaCompra * 0.05;
            } else {
                cashback = valordaCompra * 0.07;
            }
            
            if (valordaCompra <= 1000) {
                cashback = valordaCompra * 0.07;
            } else {
                cashback = valordaCompra * 0.10;
            }}
            
            else {
                cashback = 0; 
            }   
        
            return cashback;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do Cliente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o valor da Compra: R$");
        double valordaCompra = scanner.nextDouble();
        
        System.out.print("Digite a idade do Cliente: ");
        int idade = scanner.nextInt();
        
        double cashback = calcularCashback(idade, valordaCompra);
        
        
        System.out.printf("\nNome do Cliente: %s", nome);
        System.out.printf("\nidade do Cliente: %d", idade);
        System.out.printf("\nO Valor da Compra Foi: R$%.2f", valordaCompra);
        System.out.printf("\nO cashback é: %.2f", cashback);
        
        
        scanner.close();
        
    }
}

