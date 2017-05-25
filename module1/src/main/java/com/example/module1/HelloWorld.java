package com.example.module1;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
public class HelloWorld {

    private HelloWorld() {
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Hello World");
	byte[] key = {1, 2, 3, 4, 5, 6, 7, 8};
SecretKeySpec spec = new SecretKeySpec(key, "AES");
Cipher aes = Cipher.getInstance("AES");
aes.init(Cipher.ENCRYPT_MODE, spec);
    }
}
