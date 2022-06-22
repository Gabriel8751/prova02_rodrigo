package vo;

import java.util.HashMap;

public enum TipoSanguineo{

    APOSITIVO("APOSITIVO"),
    ANEGATIVO("ANEGATIVO"),
    BPOSITIVO("BPOSITIVO"),
    BNEGATIVO("BNEGATIVO"),
    ABPOSITIVO("ABPOSITIVO"),
    ABNEGATIVO("ABNEGATIVO"),
    OPOSITIVO("OPOSITIVO"),
    ONEGATIVO("ONEGATIVO");

    private String tipo;
    TipoSanguineo(String tipo) {
        this.tipo = tipo;
    }


    public String getTipo(){
        return tipo;
    }

    public TipoSanguineo fromTipo(String tipo){

        return null;
    }
}
