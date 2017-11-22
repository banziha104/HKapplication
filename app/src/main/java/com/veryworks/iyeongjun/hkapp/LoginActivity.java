package com.veryworks.iyeongjun.hkapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import com.veryworks.iyeongjun.hkapp.Util.PermissionControl;
import com.yqritc.scalablevideoview.ScalableType;
import com.yqritc.scalablevideoview.ScalableVideoView;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements PermissionControl.CallBack {

    @BindView(R.id.scalableVideoView)
    ScalableVideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        setView();
        PermissionControl.checkVersion(this);
    }

    private void setView() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, //상태바 제거
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /* Permmision 받고 초기화*/
    @Override
    public void init() {
        Toast.makeText(this, "권한처리 완료", Toast.LENGTH_SHORT).show();
    }

    private void setVideo() {
        try {
            videoView.setRawData(R.raw.login);
            videoView.setScalableType(ScalableType.CENTER_CROP);
            videoView.setVolume(0, 0);
            videoView.setLooping(true);
            videoView.prepare(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    videoView.start();
                    Log.d("VIDEO", "start");
                }
            });
        } catch (IOException e) {
            Toast.makeText(this, "버전이 너무 낮아 비디오를 재생할 수 없습니다", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionControl.onResult(this, requestCode, grantResults);
    }

}
