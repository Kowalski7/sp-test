package com.kowalski7.sp_test.classes;

import com.kowalski7.sp_test.interfaces.Visitee;
import com.kowalski7.sp_test.interfaces.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements Visitee {
    protected String name;
    protected List<Playlist> playlists;

    public MediaPlayer(String name) {
        this.name = name;
        this.playlists = new ArrayList<>();
    }

    @Override
    public void accept(Visitor v) {
        v.visitMediaPlayer(this);
        for (Playlist p : this.playlists) {
            p.accept(v);
        }
    }

    public void print() {
        System.out.println(this.name + " Media Player");
        System.out.println("Playlists:");
        for (Playlist p : this.playlists) {
            p.print();
        }
    }

    public void add(Playlist p) {
        this.playlists.add(p);
    }
}
