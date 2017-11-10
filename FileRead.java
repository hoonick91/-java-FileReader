package bj_1932;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileRead {

    private String path;


    public FileRead(String path) {
        this.path = path;
    }

    public ArrayList read() throws IOException {

        ArrayList list = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader(this.path));

        while (true) {

            String line = br.readLine();
            if (line == null) break;
            String[] nums = line.split("\\s");

            for (String num : nums) {


                list.add(Integer.parseInt(num));
            }
        }

        br.close();
        return list;


    }
}
