package com.google.code.cnab.arquivoretorno.registro;

public enum FormaPagamento {
    DINHEIRO(1),
    CHEQUE(2);

    private int codigo;

    private FormaPagamento(final int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public static FormaPagamento valueOfCodigo(int codigo) {
        for (FormaPagamento formaPagamento : values()) {
            if (codigo == formaPagamento.getCodigo()) {
                return formaPagamento;
            }
        }
        return null;
    }
}