package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by home on 17/9/16.
 */
public class VideoLessonsFrag extends Fragment {

    View view;
    WebView youTubeChannel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflating the view and returning
        view = inflater.inflate(R.layout.activity_video_lessons_frag, container, false);

        youTubeChannel = (WebView) view.findViewById(R.id.youTubeWebView);
        youTubeChannel.setWebViewClient(new MyBrowser());
        youTubeChannel.getSettings().setJavaScriptEnabled(true);
        youTubeChannel.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        youTubeChannel.getSettings().getPluginState();
        youTubeChannel.getSettings().setPluginState(WebSettings.PluginState.ON);

        youTubeChannel.loadUrl("https://www.youtube.com/user/androiddevelopers");

        return view;

    }



    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }


}
