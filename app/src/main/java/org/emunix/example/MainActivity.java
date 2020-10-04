package org.emunix.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public native String helloCmake();
    public native String helloNdkBuild();

    static {
        System.loadLibrary("hello_cmake");
        System.loadLibrary("hello_ndkbuild");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);

        text1.setText(helloCmake());
        text2.setText(helloNdkBuild());
    }
}