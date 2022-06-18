package ftt.ec;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class AppJwt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("App 01...");
		
		
		String jwt = "";
		
		try {
			
			jwt = Jwts.builder()
					  .setSubject("users/TzMUocMF4p")
					  .setExpiration(new Date(1300819380))
					  .claim("name", "Robert Token Man")
					  .claim("scope", "self groups/admins")
					  .signWith(
					    SignatureAlgorithm.HS256,
					    "secret".getBytes("UTF-8")
					  )
					  .compact();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jwt = e.getMessage();
		}
		
		System.out.println( jwt);	
	}

}
