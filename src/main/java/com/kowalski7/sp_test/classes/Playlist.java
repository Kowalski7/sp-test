package com.kowalski7.sp_test.classes;

import com.kowalski7.sp_test.interfaces.File;
import com.kowalski7.sp_test.interfaces.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements File {
    protected String name;
    protected List<File> files;

    public Playlist(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    @Override
    public void accept(Visitor v) {
        v.visitPlaylist(this);
        for (File f : this.files) {
            f.accept(v);
        }
    }

    @Override
    public void print() {
        System.out.println("- " + this.name + ":");
        for (File f : this.files) {
            f.print();
        }
    }

    public void add(File e) {
        this.files.add(e);
    }

    public String getName() {
        return name;
    }
}
