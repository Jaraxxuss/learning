package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Use : CopyFile from to");
            return;
        }
        int i;
        try(FileInputStream fin = new FileInputStream("src\\files\\" + args[0]);
            FileOutputStream fout = new FileOutputStream("src\\files\\" + args[1])){
            do {
                i = fin.read();
                if(i != -1)fout.write(i);
            }while (i != -1);

        }
        catch (IOException e){
            System.out.println("IO e " + e);
        }
    }
}
