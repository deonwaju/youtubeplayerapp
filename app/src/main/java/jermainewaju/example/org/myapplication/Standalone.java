package jermainewaju.example.org.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Standalone extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button btnPlayList = (Button) findViewById(R.id.btnPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlayList.setOnClickListener(this);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) { }
        };
        btnPlayVideo.setOnClickListener(listener);
        btnPlayList.setOnClickListener(listener);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_PLAYLIST);
                break;
                default:
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
