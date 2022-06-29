import java.util.Scanner;

public abstract class CartaodePresente {


    private final String nomeRemetente;
    private final String nomeDestinatario;

    public CartaodePresente ( String nomeRemetente, String nomeDestinatario){
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
    }
    public String getnomeRemetente(){
        return nomeRemetente;
    }
    public String getnomeDestinatario(){
        return nomeDestinatario;
    }


    public abstract String Mensagem();

    }


