package test.com.mat.academyproject.security;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mat.academyproject.security.BCryptEncoder;

class BCryptEncoderTest {

	@Test
	void testPassword() {
		String pass = BCryptEncoder.encode("Pass01$");
		assertNotNull(pass);
		System.out.println(pass);
	}

}
