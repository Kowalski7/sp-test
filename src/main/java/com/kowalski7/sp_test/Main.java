package com.kowalski7.sp_test;

import com.kowalski7.sp_test.classes.*;

public class Main {
    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in the Caraibe", 20000));
        p.add(new Song("Simple things", 4000));
        p.add(new Gif("sunglasses", 500));
        m.add(p);

        MediaSizeVisitor v = new MediaSizeVisitor();
        m.accept(v);
        v.printSizes();
//        m.print();
    }
}