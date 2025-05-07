package org.oop.avanzato.java;

import java.math.BigDecimal;

public class MainConto {
   public static void main(String[] args) {
     ContoBancario mediolanum = new ContoBancario("12345");
     mediolanum.deposito(new BigDecimal("100.00"));
     mediolanum.prelievo(new BigDecimal("20.00"));

     System.out.println("Il saldo rimanente è " + mediolanum.getSaldo());
   }
}
