package learn;

import java.math.BigDecimal;

public class Operation {

    public  static void main(String[] args ) {
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;

        System.out.printf("a vriable is %f\n",a,b);
        System.out.printf("b vriable is %f\n",b);
        if(a == b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        Float a1 = Float.valueOf(a);
        Float b1 = Float.valueOf(b);

        if(a1.equals(b1)){
            System.out.printf("a1.equals(b1) is true");
        }else{
            System.out.printf("a1.equals(b1) is false");
        }

        String c = null;

        switch (c){
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
                break;
        }

    }

}
