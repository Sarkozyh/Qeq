package sample;

import java.io.*;
import java.net.Socket;

public class Serv extends Thread{
    String giver;
    String id;
    @Override
    public void run(){

        try (Socket socket = new Socket("127.0.0.1", 1712);
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(socket.getOutputStream()));
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()))){
            System.out.println("connected");
            String request = id;
            writer.write(request);
            writer.newLine();
            writer.flush();

            String response = reader.readLine();
            getGiver(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void getGiver(String response){
        this.giver = response;
    }
    public String setGiver(){
        System.out.println(giver);
        return this.giver;
    }

}
