public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro",12),
    PIAUI ("PI", "Piauí",13),
    MARANHAO("MA", "Maranhão",14),
    BRASILIA ("DF", "Brasilia", 15);

    private String nome;
    private String sigla;
    private int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge ) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
