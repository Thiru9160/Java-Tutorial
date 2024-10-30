public class Typecasting {
    public static void main(String[] args) {
  //Typecasting : converting one primtive  datatype to another datatype (int-->float or float-->int).two types:widening casting and narrowing casting
  //1.widening casting: automatically converting smaller datatype to larger datatype byte->short->char->int->long->float->double
  int mynum=9;
  double mydouble=mynum;//automatically typecasting
  byte byte1=10;
  int int1=byte1;
  System.out.println("int value :"+mynum);
  System.out.println("double:"+mydouble);
  System.out.println("byte:"+byte1);
  System.out.println("int:"+int1);
  //narrowing casting:manually by placing type in () infront of value
  double mydouble1=9.78d;
  int int2=(int)mydouble1;
  System.out.println("double:"+mydouble1);
  System.out.println("integer:"+int2);


}
}
