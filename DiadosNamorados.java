public class DiadosNamorados extends CartaodePresente{
    public DiadosNamorados(String nomeRemetente, String nomeDestinatario){
        super(nomeRemetente, nomeDestinatario);
    }
    @Override
    public String Mensagem(){
        return "Mensagem do Dia dos Namorados";
    }
}
