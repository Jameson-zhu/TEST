package practice;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {

    public static void main(String[] args){


        //test-test
        String a = "abc1234.44444efg";
        //String a = "abc1234";
        String numberStr = extractNumberStr( a );
        BigDecimal bigDecimal = new BigDecimal( numberStr );
        BigDecimal bigDecimal2 = bigDecimal.setScale( 2, RoundingMode.DOWN );
        System.out.println( bigDecimal2.toString() );


    }

    public static String extractNumberStr(String str){
        if(str == null) return null;
        Pattern pattern = Pattern.compile( "-?\\d+(\\.\\d+)?" );
        Matcher matcher = pattern.matcher( str );
        if(matcher.find()){
            return matcher.group();
        }
        return null;
    }

}
