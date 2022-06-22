package vo;

import java.util.*;

import exception.*;
public class Database {

    private static List<Doador> doadores;
    private static Map<String, Long> estoqueSanguineo;

    public static void addDoador(Doador doador){
        Scanner scanner = new Scanner(System.in);
        String tipoSanguineo = scanner.nextLine();
        Long cpf = scanner.nextLong();

        DoadorController.cadastrarDoador(cpf,tipoSanguineo);
    }

    public static void addDoacao(String tipoSanguineo, Long quantidade) {

    }

    public static Collection<Long> getSituacaoEstoque(String tipoSanguineo){
        return estoqueSanguineo.values();
    }


}
