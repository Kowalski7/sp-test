package com.kowalski7.sp_test.classes;

import com.kowalski7.sp_test.interfaces.Visitor;

public class MediaSizeVisitor implements Visitor {
    protected int totalSizeKB;
    protected int videoSizeKB;
    protected int songSizeKB;
    protected int gifSizeKB;

    public MediaSizeVisitor() {
        this.totalSizeKB = 0;
        this.videoSizeKB = 0;
        this.songSizeKB = 0;
        this.gifSizeKB = 0;
    }

    @Override
    public void visitMediaPlayer(MediaPlayer mediaPlayer) {
        // nothing to do here
    }

    @Override
    public void visitPlaylist(Playlist playlist) {
        // nothing to do here
    }

    @Override
    public void visitVideo(Video video) {
        this.videoSizeKB += video.getSizeKB();
        this.totalSizeKB += video.getSizeKB();
    }

    @Override
    public void visitSong(Song song) {
        this.songSizeKB += song.getSizeKB();
        this.totalSizeKB += song.getSizeKB();
    }

    @Override
    public void visitGif(Gif gif) {
        this.gifSizeKB += gif.getSizeKB();
        this.totalSizeKB += gif.getSizeKB();
    }

    public void printSizes() {
        System.out.println("Size statistics:");
        System.out.println("\t- Songs: " + this.songSizeKB + "KB");
        System.out.println("\t- Videos: " + this.videoSizeKB + "KB");
        System.out.println("\t- GIFs: " + this.gifSizeKB + "KB");
        System.out.println("\tTOTAL: " + this.totalSizeKB + "KB");
    }
}
