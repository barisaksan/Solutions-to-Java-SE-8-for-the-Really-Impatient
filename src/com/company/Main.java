package com.company;

import java.io.File;
import java.util.Arrays;

public class Main {

    //https://github.com/galperin/Solutions-for-exercises-from-Java-SE-8-for-the-Really-Impatient-by-Horstmann/blob/master/src/main/java/de/galperin/javase8/capitel1/C1E2.java

    public static void main(String[] args) {
	    // write your code here

    }

    public void method(String pathname){
        Arrays.asList(new File(pathname).listFiles(File::isDirectory)).forEach(System.out::println);
    }
}
