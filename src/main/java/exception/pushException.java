package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class pushException {

    public FileInputStream loadFile(String filename) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        return fis;
    }
    public static void main(String[] args) throws FileNotFoundException {
        pushException pe = new pushException();
        FileInputStream fis = pe.loadFile("a.txt");



        }

    }
