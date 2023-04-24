//The ByteArrayInputStream is composed of two words: ByteArray and InputStream. As the name suggests, it can be used to read byte array as input stream.
//
//Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream. In this stream, the data is read from a byte array.
//
//The buffer of ByteArrayInputStream automatically grows according to data.

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInput {
    public static void main(String[] args) {
        byte[] buffer_Array = { 35, 36, 37, 38 };
        ByteArrayInputStream obj = new ByteArrayInputStream(buffer_Array);
        int j;
        while((j=obj.read())!=-1){
            char ch = (char)j;
            System.out.println(j+"   ------->  "+ch);

        }
    }
}


//Java ByteArrayOutputStream class is used to write common data into multiple files. In this stream,
// the data is written into a byte array which can be written to multiple streams later.
//The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
//The buffer of ByteArrayOutputStream automatically grows according to data.


import java.io.ByteArrayOutputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class ByteArray {
    public static void main(String[] args) throws IOException {
        FileOutputStream obj = new FileOutputStream("zer.txt");
        FileOutputStream obj2 = new FileOutputStream("zer1.txt");
        ByteArrayOutputStream obj3 = new ByteArrayOutputStream();
        obj3.write('a');
        obj3.writeTo(obj);
        obj3.writeTo(obj2);
    }


}


