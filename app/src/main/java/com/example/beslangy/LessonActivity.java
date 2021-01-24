package com.example.beslangy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class LessonActivity extends AppCompatActivity {

    private Lesson lesson;
    private TextView word;
    private TextView meaning;
    private VideoView videoView;
    private Button next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        word = findViewById(R.id.word);
        meaning = findViewById(R.id.meaning);
        videoView = findViewById(R.id.videoView);
        next = findViewById(R.id.next);

        lesson = new Lesson();
        loadPage(0);





    }

    private void loadPage(int pageNumber) {
        final Page page = lesson.getPage(pageNumber);

        String pageWord = getString(page.getWordId());
        pageWord = String.format(pageWord);
        word.setText(pageWord);

        String pageMeaning = getString(page.getMeaningId());
        pageMeaning = String.format(pageMeaning);
        meaning.setText(pageMeaning);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + "/raw/" + page.getVideoId();
        Uri uri = Uri.parse(videoPath);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);

        if (page.isFinalPage()){
            next.setText("Continue");
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }
        else {
            loadButtons(page);

        }




    }

    private void loadButtons(final Page page) {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = page.getChoice().getNextPage();
                loadPage(nextPage);

            }
        });
    }
}
