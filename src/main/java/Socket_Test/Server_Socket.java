package Socket_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: chenlong
 * @Date: 2022/04/12/14:10
 * @Description:
 */
public class Server_Socket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("accept = " + accept);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("s = " + s);
        bufferedReader.close();
        accept.close();
        serverSocket.close();
    }
}
