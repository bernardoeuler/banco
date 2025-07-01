import java.util.List;

public class DadosInvalidosClienteException extends Exception {
    private final List<String> erros;

    public DadosInvalidosClienteException(List<String> erros) {
        if (erros == null)
            throw new IllegalArgumentException("A lista de erros não pode ser nula");

        this.erros = List.copyOf(erros);
    }

    public DadosInvalidosClienteException(String mensagem, List<String> erros) {
        super(mensagem);

        if (erros == null)
            throw new IllegalArgumentException("A lista de erros não pode ser nula");

        this.erros = List.copyOf(erros);
    }

    public List<String> getErros() {
        return List.copyOf(erros);
    }
}