package com.aburgerguy.ceaserCipher;

public class CeaserCipher {

    private int numShift;

    private char[] textChar;

    private String textStr;

    private String deciperedText = "";


    public CeaserCipher(int num, String uncipheredText){
        numShift = num;
        textStr = uncipheredText;
        textChar = uncipheredText.toCharArray();
    }




    public String encode() {
        System.out.println("Unciphered Text : " + textStr);

        //this for loop shifts each character over by numShift numberof times
        System.out.print("Ciphered Text :   ");
        for (char c : textChar) {
           if(c >= 'a' && c <= 'z'){
            c = (char)(c + numShift);

                if (c > 'z'){
                    c = (char)('a' + numShift);
                }
               System.out.print(c);
                deciperedText += c;

           }
        }
        System.out.println("\nNumber Shifted By : " + numShift);
        System.out.println("");
        return deciperedText;

    }

    public void decode(String input){

        CeaserCipher decoder = new CeaserCipher(-numShift,deciperedText);
        decoder.encode();


    }


}
