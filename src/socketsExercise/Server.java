// https://www.youtube.com/watch?v=-xKgxqG411c

package socketsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4999);
        Socket socket = serverSocket.accept();

        System.out.println("client connected");

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String string = bufferedReader.readLine();
        System.out.println("client: " + string);

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("hello");
        printWriter.flush();
    }
}
