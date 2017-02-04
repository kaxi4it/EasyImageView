package com.easy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.tv_code_1);
        t2=(TextView)findViewById(R.id.tv_code_2);
        t3=(TextView)findViewById(R.id.tv_code_3);
        t1.setText("<com.guyj.img.EasyImageView\n" +
                "        android:layout_width=\"100dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:src=\"@mipmap/aaa\"\n" +
                "        app:type=\"circle\"\n" +
                "        app:border_width=\"2dp\"\n" +
                "        app:border_color=\"@color/colorPrimary\"\n" +
                "        />");
        t2.setText("<com.guyj.img.EasyImageView\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:src=\"@mipmap/aaa\"\n" +
                "        app:type=\"rectangle\"\n" +
                "        app:border_width=\"2dp\"\n" +
                "        app:border_color=\"@color/colorPrimary\"\n" +
                "        />");
        t3.setText("<com.guyj.img.EasyImageView\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:src=\"@mipmap/aaa\"\n" +
                "        app:type=\"oval\"\n" +
                "        app:border_width=\"2px\"\n" +
                "        app:border_color=\"@color/colorPrimary\"\n" +
                "        />");
    }
}
