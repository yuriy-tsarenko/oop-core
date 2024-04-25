package com.goit.oop.interfaces.difference.ex2;

import java.util.Scanner;

public class FileReader implements Reader {

    @Override
    public String read() {
        String fileData = "Text";
        return new Scanner(fileData).nextLine();
    }
}
