public class NameEncoderDecoder{
public String encode(String name){
  return "NOTFORYOU" + name
           .replace("e", "1")
           .replace("u", "2")
           .replace("i", "3")
           .replace("0", "4")
           .replace("a", "5") + "YESNOTFORYOU";
 }
 
 public String decode(String name){
 return  name
           .replace("YESNOTFORYOU", "")
           .replace("1", "e")
           .replace("2", "u")
           .replace("3", "i")
           .replace("4", "o")
           .replace("5", "a")
           .replace("NOTFORYOU", "");
 }  
 public static void main (String[] args){
 NameEncoderDecoder names = new NameEncoderDecoder();

String encode = names.encode(" " + " " + " ");
String decode = names.decode("NOTFORYOU" + " " + "YESNOTFORYOU");
   
System.out.println("names.encode(\"Crab\") = " + encode);
System.out.println("names.decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + decode);
System.out.println("names.decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + decode);
 }
 }
