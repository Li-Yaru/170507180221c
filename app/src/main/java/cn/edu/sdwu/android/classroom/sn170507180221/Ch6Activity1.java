package cn.edu.sdwu.android.classroom.sn170507180221;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Ch6Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch6_1);

        //在Java中获取字符串资源
        String content=getString(R.string.ok);
        String content1=getString(R.string.hello);
        Log.i(Ch6Activity1.this.toString(),content);

        String sms=getString(R.string.sms);
        String.format(sms,100,"张三");
        Log.i(Ch6Activity1.this.toString(),sms);

    }
}