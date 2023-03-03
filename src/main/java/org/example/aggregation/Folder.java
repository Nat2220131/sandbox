package org.example.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    List<File> files = new ArrayList<>();
    public Folder(){

        for(int x = 1; x <= 10; x++){
            //composition
            files.add(new File());
        }
        System.out.println("Number of files: " + files.size());
    }
    public Folder(File[] f){

        for(int x = 0; x < f.length; x++){

            //aggregation (not composition)
            files.add(f[x]);
        }
        System.out.println("Number of files: " + files.size());
    }
    }
