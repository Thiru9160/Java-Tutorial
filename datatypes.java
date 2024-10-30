public class datatypes {
    static byte defaultbyte;
    static short defaultshort;
    static int defaultint;
    static  long defaultlong;
    static float defaultfloat;
    static double defaultdouble;
    static boolean defaultboolean;
    static char defaultchar;
     public static void main(String[] args) {

        System.out.println("************");
        System.out.println("DEFAULT VALUES OF PRIMITIVE DATATYPES");
        System.out.println("byte:"+defaultbyte);
        System.out.println("short:"+defaultshort);
        System.out.println("int :"+defaultint);
        System.out.println("long:"+defaultlong);
        System.out.println("float:"+defaultfloat);
        System.out.println("double:"+defaultdouble);
        System.out.println("boolean:"+defaultboolean);
        System.out.println("char:"+defaultchar);
        System.out.println("**************");
        //primtive datatypes:int....
        //Integer number :
        //1.byte: -128 to 127 , size: 1 byte
        byte b=10;
        System.out.println("byte value :"+b);
        //2.short : -32768 to 32767, size: 2 bytes
        short s=100;
        System.out.println("short value :"+s);
        //3.int: -2147483648 to 214748367, size: 4 byte
        int i=100000;
        System.out.println("int value:"+ i);
        //4.long : -9223372036854775808 to  9223372036854775807, size: 8 byte
        long long_num=15000000L;
        System.out.println("Long value:"+long_num);
        //floating point numbers:
        //1.float size: 4 bytes  only 6 to 7 decimals points
        float floatvariable=5.75F;
        System.out.println(("float value:"+floatvariable));
        //2.double size:8bytes upto 16 decimal points
        double doublevar=19.99;
        System.out.println("double value:"+doublevar);
        //Boolean : true or false
        boolean bool=true;
        System.out.println("boolean value:"+bool);
        //char : used to store single character 
        //ASCII VALUES:65 -->A 66-->B
        char  ch='a';
        System.out.println("character value:"+ch);
        char ch1=65,ch2=66;
        System.out.println("alternative way to declare character:"+ch1);
        System.out.println("alternative way to declare character:"+ch2);



    
    }
}
