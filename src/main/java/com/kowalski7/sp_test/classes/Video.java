package com.kowalski7.sp_test.classes;

import com.kowalski7.sp_test.interfaces.File;
import com.kowalski7.sp_test.interfaces.Visitor;

public class Video implements File {
    protected String name;
    protected int sizeKB;

    public Video(String name, int sizeKB) {
        this.name = name;
        this.sizeKB = sizeKB;
    }

    @Override
    public void accept(Visitor v) {
        v.visitVideo(this);
    }

    @Override
    public void print() {
        System.out.println("\t- " + this.name + " | Video | " + this.sizeKB + "KB");
    }

    public String getName() {
        return name;
    }

    public int getSizeKB() {
        return sizeKB;
    }
}
