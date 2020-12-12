package com.transport.transportcore;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;

import com.transport.transportcore.dto.BusDTO;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan(basePackages = {"com.transport.transportcore"})
public class TransportCoreApplicationIntegrationTests {

	@LocalServerPort
	private int port;

	private URL base;

	@Autowired
	private TestRestTemplate template;

	@BeforeEach
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "/");
	}

	@Test
	public void getBusList() throws Exception {
		ResponseEntity<List> response = template.getForEntity(base.toString()+"api/v1/transport/findAllBusses", List.class);
		assertTrue(response.getBody().size()==3);
	}
	@Test
	public void getBus() throws Exception {
		ResponseEntity<BusDTO> response = template.getForEntity(base.toString()+"api/v1/transport/KA51A3347", BusDTO.class);
		assertTrue(response.getBody()!=null);
	}
}
