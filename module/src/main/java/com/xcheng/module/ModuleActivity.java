package com.xcheng.module;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ServiceLoader;

public class ModuleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molude);
    }



    public void onClick(View view) {
        ITest iTest = ServiceLoader.load(ITest.class).iterator().next();
        if (null != iTest) {
            String s = iTest.getMainAppString();
            Log.d("YAO", "onClick: ");
        }

    }
}
