package com.xcheng.testautoservice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.auto.service.AutoService;
import com.google.gson.Gson;
import com.xcheng.module.ITest;
import com.xcheng.module.ModuleActivity;

import java.util.ServiceLoader;

@AutoService(ITest.class)
public class MainActivity extends AppCompatActivity implements ITest {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click(View view) {
//        Intent intent = new Intent(this, ModuleActivity.class);
//        startActivity(intent);
        test();
    }

    @Override
    public String getMainAppString() {
        String result = Utils.getString();
        return result;
    }

    String testString = "{\n" +
            "\"wifi\":true\n" +
            "}";
    private void test() {
        Bean bean = new Gson().fromJson(testString, Bean.class);
        Log.d("YAO", "bean: " + bean);
    }
}