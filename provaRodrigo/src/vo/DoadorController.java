package vo;

import exception.IllegalArgumentException;
import exception.TipoSanguineoNotFoundException;

public class DoadorController {

    public static void cadastrarDoador(long cpf, String tipoSanguineo){
        Doador doador = new Doador();
        Database database = new Database();

        doador.setCpf(cpf);
        doador.setTipoSanguineo(TipoSanguineo.valueOf(tipoSanguineo));

        database.addDoador(doador);
    }

    public static void cadastrarDoacao(String tipoSanguineo, long quantidade) throws TipoSanguineoNotFoundException, IllegalArgumentException {

    }
}
