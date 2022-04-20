/**
* Class lab3string.
*
*@author Bartosz Balawender
*@version 0.1
*/
public class lab3string {

    /**
    * static method - returns length of text
    *
    * @param s text to check the length o
    * @return length of param text
     */
    static int dlugosc(String text) {

        return text.length();

    }

    /**
    * checks how many letters 'x' we can find in the word
    *
    * @param text - word to chech
    * @param x - letter to find
    * @return numbre of letter we find
     */
    static int ile_razy_literka_wystepuje(String text, char x) {

        int count = 0;
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i) == x)
            {
                count +=1;
            }
        }
        return count;
    }

    static boolean czy_takie_same(String s1, String s2) {

        return s1.equals(s2);

    }
    static String wspak(String s) {

        StringBuilder s1 = new StringBuilder(s);
        return s1.reverse().toString();


    }

    static boolean czy_plaindrom(String s){

        String sTemp = wspak(s);

        return czy_takie_same(s, sTemp);

    }

    static boolean czy_abecadlowe(String s) {

        

        for(int i=1;i < s.length()  ; i++)
        {   
            char x = new Character(s.charAt(i));
            char y = new Character(s.charAt(i-1));
            if(x > y)
            {
                return true;
            }
        }
        return false;
    }

    static String rot13(String s) {

        return "abs";

    }
}