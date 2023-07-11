package br.edu.fema.models;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class DadosFinanceiros {
    private BigDecimal orcamento;
    private BigDecimal receita;

    public DadosFinanceiros(BigDecimal orcamento, BigDecimal receita) {
        this.orcamento = orcamento;
        this.receita = receita;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
        return String.format("Orçamento do filme: $%s -- Receita do filme: $%s", format.format(orcamento)
                .replace(',', '.'), format.format(receita).replace(',', '.'));
    }
}
