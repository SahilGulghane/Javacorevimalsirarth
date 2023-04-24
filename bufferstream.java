
//Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data.
// It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.For adding the buffer in an OutputStream,
// use the BufferedOutputStream class. Let's see the syntax for adding the buffer in an OutputStream

//Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.
//The important points about BufferedInputStream are:
//When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
//When a BufferedInputStream is created, an internal buffer array is created
import java.io.*;


public class Buffer {
    public static void main(String[] args) throws IOException {
        FileOutputStream obj = new FileOutputStream("zer.txt");
        BufferedOutputStream obj1 = new BufferedOutputStream(obj);
        obj1.write(77);
        obj1.flush();
        FileInputStream obj2 = new FileInputStream("zer.txt");
        BufferedInputStream obj11 = new BufferedInputStream(obj2);
        System.out.println(obj11.read());
    }
}

