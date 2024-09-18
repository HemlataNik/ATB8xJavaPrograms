package Sep24.Tasks;

public class Task_18092024 {
    public static void main(String[] args){
        //1.
        //Widening is the process of converting lower type to higher type
        byte b= 10;
        int a=b; //VALID - Implicit casting
        int a=(int)b; //VALID - Explicit casting
        //Narrowing is the process of converting higher type to lower type
        int a=300;
        byte b=a; // INVALID -Implicit casting
        byte b =(byte)a; //VALID -Explicit casting

        int a=300; //int means 32 bits memory required
        //000000000000000000000000100101100
       byte b1 =(byte)a; //byte means 8bits memory required
        //00101100
                //value is 0+0+32+0+8+4+0+0=44
//2.
        int a = 10;
        System.out.println(  --a + a-- + a--);
        System.out.println(a);
//3.
        int b = 10;
        System.out.println();
        System.out.println(  --b + b++ + b--);
        System.out.println(b);
//4.
        int c = 10;
        System.out.println();
        System.out.println(  c-- + c-- + c--);
        System.out.println(c);
    }
}
