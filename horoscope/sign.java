package horoscope;
import java.util.Scanner;

/* The getSign() method asks the user to input their star sign, then
in the checkSign() method checks for correct spelling on the assumption
that the first 2 characters are the most likely to be correct.
(If the word that is to be the star sign is unrecognizable, 
the correction process is given up on.)*/

public class sign {
    String sign;

    /*Get a the star sign from the user to use in producing a horoscope.*/
    public String getSign() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input your star sign:");
        sign = scan.nextLine();
        sign = checkSign(sign);
        scan.close();

        return sign;
    }

    /*
     * In case of a typo, check the beginning of the word input the first three
     * letters are statictically unlikely to contain a typo.
     */
    public String checkSign(String sign) {

        String checkSign = sign.substring(0, 2);
        checkSign = checkSign.toLowerCase();
        switch (checkSign) {
            case "ar":
                return "Aries";
            case "ta":
                return "Taurus";
            case "ge":
                return "Gemini";
            case "le":
                return "Leo";
            case "vi":
                return "Virgin";
            case "li":
                return "Libra";
            case "sc":
                return "Scorpio";
            case "sa":
                return "Sagittarius";
            case "aq":
                return "Aquarius";
            case "pi":
                return "Pisces";
            case "ca":
                String threeLetters = sign.substring(0, 3);
                switch(threeLetters){
                    case "can":
                        return "Cancer";
                    case "cap":
                        return "Capricorn";
                };

            /*If we still don't know what it is, let's just make do with
            what we've got.*/
            default:
                String weirdSign = sign;
                weirdSign = sign.substring(0, 1).toUpperCase() + sign.substring(1);
                return weirdSign;
    }
}
    
}