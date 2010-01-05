package communication;

import java.io.*;
import java.util.StringTokenizer;

public class Console {
    public static String input() {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                System.in));
        String cmd = "exit";
        try {
            cmd = bufReader.readLine();
        } catch (IOException ex) {
            cmd = "exit";
        }
        return cmd;
    }

    public static void main(String args[]) {
        String cmd = null;
        int defaultPort = 9000;
        String addr = "a";
        ClientBase client = new ClientBase(addr, defaultPort);
        while (!(cmd = input()).equals("exit")) {
            try {
                if (cmd.length() > 11
                        && cmd.substring(0, 11).equals("import data")) {
                    String fileList = cmd.substring(12);
                    StringTokenizer commaToker = new StringTokenizer(fileList,
                            ",");
                    String path;
                    while (commaToker.hasMoreTokens()) {
                        path = commaToker.nextToken();
                        File transFile = new File(path);
                        System.out.println("send file");
                        String res = client.sendFile("executecmd", transFile,
                                "image/jpeg");
                        System.out.println(res);
                    }
                    //continue;
                }
                Object obj = client.sendContext("executecmd", cmd);
                if (obj instanceof String) {
                    System.out.println((String) obj);
                }
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
