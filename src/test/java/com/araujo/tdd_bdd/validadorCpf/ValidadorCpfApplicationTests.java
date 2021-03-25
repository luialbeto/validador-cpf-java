package com.araujo.tdd_bdd.validadorCpf;

import static org.junit.jupiter.api.Assertions.assertEquals; 
import com.araujo.tdd_bdd.validadorCpf.models.Cliente;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ValidadorCpfApplication {

	@Test
	void testeValido() {
		assertEquals(true, validarCPF("94622036010"));
		Cliente cliente = new Cliente();
		cliente.setCpf("94622036010");
		assertEquals(true, cliente.validarCPF(null));

	}

	private Object validarCPF(String string) {
		return null;
	}

	@Test
	void testeInValido() {
		assertEquals(false, validarCPF("94622036010"));
		Cliente cliente = new Cliente();
		cliente.setCpf("94622036010");
		assertEquals(false, cliente.validarCPF(null));

	}
}
