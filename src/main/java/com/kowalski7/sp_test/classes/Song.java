package com.kowalski7.sp_test.classes;

import com.kowalski7.sp_test.interfaces.File;
import com.kowalski7.sp_test.interfaces.Visitor;

public class Song implements File {
    protected String name;
    protected int sizeKB;

    public Song(String name, int sizeKB) {
        this.name = name;
        this.sizeKB = sizeKB;
    }

    @Override
    public void accept(Visitor v) {
        v.visitSong(this);
    }

    @Override
    public void print() {
        System.out.println("\t- " + this.name + " | Song | " + this.sizeKB + "KB");
    }

    public String getName() {
        return name;
    }

    public int getSizeKB() {
        return sizeKB;
    }
}
