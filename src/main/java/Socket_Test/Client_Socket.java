package Socket_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @Auther: chenlong
 * @Date: 2022/04/12/14:17
 * @Description:
 */
public class Client_Socket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        System.out.println("socket = " + socket);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("古人陆续凋零，好似风中落叶");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        socket.close();
    }
}
