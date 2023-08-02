import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();

        System.out.println("==== Cadastrar pessoa ====");

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.next();

        System.out.println("Idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a quantidade de endereços que você tem: ");
        int qtEndereco = scanner.nextInt();

        for (int i = 0; i < qtEndereco; i++) {
            System.out.println("Rua: ");
            String rua = scanner.next();

            System.out.println("Bairro: ");
            String bairro = scanner.next();

            System.out.println("Número da casa: ");
            int numCasa = scanner.nextInt();

            Endereco endereco = new Endereco(rua, bairro, numCasa);
            enderecos.add(endereco);
        }
        Pessoa pessoa = new Pessoa(nome, idade, enderecos);
        pessoas.add(pessoa);

        System.out.println("Nome: " + pessoas.get(0).getNome());
        System.out.println("Idade: " + pessoas.get(0).getIdade());

        System.out.println("Enderecos: ");
        for (int i = 0; i< enderecos.size(); i++){
            System.out.println("Rua: " + enderecos.get(i).getRua());
            System.out.println("Bairro: " + enderecos.get(i).getBairro());
            System.out.println("Nº Casa: " + enderecos.get(i).getNumCasa());

            System.out.println("");
        }
    }
}