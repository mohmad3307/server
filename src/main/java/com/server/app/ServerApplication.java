package com.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.server.app.Base64.encryption;
import com.server.app.Base64.decryption;
import com.server.app.barber.barber;
import com.server.app.times.UTC;

import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
		/*String input = "Hello, ChatGPT!";
		byte[] inputData = input.getBytes(StandardCharsets.UTF_8);
		String encodedData = encryption.encodeBase64(inputData);
		System.out.println("Encoded: " + encodedData);
		byte[] decodedData = decryption.decodeBase64(encodedData);
		String decodedString = new String(decodedData, StandardCharsets.UTF_8);
		System.out.println("Decoded: " + decodedString);*/
		UTC utc = new UTC();
		utc.UTC();
	}

}
