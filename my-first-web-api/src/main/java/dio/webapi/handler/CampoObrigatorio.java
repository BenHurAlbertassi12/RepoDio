package dio.webapi.handler;

public class CampoObrigatorio extends BusinessException {
    public CampoObrigatorio(String mensagem) {
        super("o campo %s é o brigatório", mensagem);
    }
    
}
