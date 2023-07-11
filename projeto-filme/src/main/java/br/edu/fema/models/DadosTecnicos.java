package br.edu.fema.models;

public class DadosTecnicos {
    private String configAudio;
    private String escala;
    private Boolean coloracao;
    private String nomeNovo;
    public DadosTecnicos(String configAudio, String escala, Boolean coloracao) {
        this.configAudio = configAudio;
        this.escala = escala;
        this.coloracao = coloracao;
        mudarNome(coloracao);
    }

    private void mudarNome(Boolean coloracao){
        if(coloracao == true){
            nomeNovo = "Sim";
        }
    }


    @Override
    public String toString() {
        return String.format("Configuração de áudio: %s ---- Escala do filme: %s ---- Coloração: %s"
                , configAudio, escala, nomeNovo);
    }
}
