//Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way.
//Java application generally uses the data output stream to write data that can later be read by a data input stream.


//Java DataInputStream class allows an application to read primitive Java data types to the input stream in a machine-independent way.
//java application generally uses the data input stream to read data that can later be write by a data output stream.
import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream obj = new FileOutputStream("zer.txt");
        DataOutputStream obj2 = new DataOutputStream(obj);
        obj2.writeFloat(33.3f);
        obj2.writeChars("hello sahil");
        System.out.println("done");
        FileInputStream obj3 = new FileInputStream("zer.txt");
        DataInputStream obj4 = new DataInputStream(obj3);
        System.out.println(obj4.readFloat());
        //System.out.println(obj4.readChar()); -> only h
    }
}

