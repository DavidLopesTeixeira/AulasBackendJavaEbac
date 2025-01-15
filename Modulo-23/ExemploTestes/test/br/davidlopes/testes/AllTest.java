package br.davidlopes.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PrimeiroTeste.class, SegundoTeste.class}) // especificando quais classes eu quero testar
public class AllTest {
}
