package br.com.davidlopes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
// Rodando todos os testes
@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTests {
}
