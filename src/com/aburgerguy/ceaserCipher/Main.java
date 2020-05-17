package com.aburgerguy.ceaserCipher;

public class Main {
    //objective: create a Ceaser Cipher from the early days of encryption
    //To do this you have to understand how to shift characters over by a couple of places
    public static void main(String[] args) {


        CeaserCipher cipher = new CeaserCipher(1,"hello world");
        cipher.decode(cipher.encode());


    }
}
