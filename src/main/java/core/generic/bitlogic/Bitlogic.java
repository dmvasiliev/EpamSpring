package core.generic.bitlogic;

/**
 * Created by VasDA on 22.09.2016.
 */
class Bitlogic {

    public static void main(String args[]) {

        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101",

                "1110", "1111"};

        int a = 3;   //     0+2+1  или двоичное 0011

        int b = 6;   //     4+2+0  или двоичное 0110

        int c = a | b;

        int d = a & b;

        int e = a ^ b;

        int f = (~a & b) | (a & ~b);

        int g = ~a & 0x0f;

        int nine = ~b;

        System.out.println(" a = " + binary[a] + " = " + a);

        System.out.println(" b = " + binary[b] + " = " + b);

        System.out.println(" ab = " + binary[c] + " = " + c);

        System.out.println(" a&b = " + binary[d] + " = " + d);

        System.out.println(" a^b = " + binary[e] + " = " + e);

        System.out.println(~a & b);

        System.out.println("~a&b|а^~Ь = " + binary[f] + " = " + f);

        System.out.println(" ~a = " + binary[g] + " = " + g);

        System.out.println(" ~b = " + "1001" + " = " + nine);

        System.out.println("0100 | " + "1001  = 1101");

    }
}
