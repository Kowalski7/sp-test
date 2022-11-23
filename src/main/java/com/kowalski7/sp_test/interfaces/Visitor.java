package com.kowalski7.sp_test.interfaces;

import com.kowalski7.sp_test.classes.*;

public interface Visitor {
    void visitMediaPlayer(MediaPlayer mediaPlayer);
    void visitPlaylist(Playlist playlist);
    void visitVideo(Video video);
    void visitSong(Song song);
    void visitGif(Gif gif);
}
