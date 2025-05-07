package org.oop.avanzato.java;

import java.math.BigDecimal;

public class ContoBancario {
    private String numero;
    private BigDecimal saldo;

    // costruttore
    public ContoBancario(String numero) {
        this.numero = numero;
        this.saldo = BigDecimal.ZERO;
    }

    //metodi pubblici
    public void deposito(BigDecimal importo) {
      saldo = saldo.add(importo);
    }

    public void prelievo(BigDecimal importo) {
        saldo = saldo.subtract(importo);
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

}
