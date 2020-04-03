package cn.edu.sdwu.android.classroom.sn170507180221;

import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Ch5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch5_1);
    }
    public  void toastl(View view){
        Toast.makeText(this,"toast1",Toast.LENGTH_LONG).show();

    }
    public  void toast2(View view){
        Toast.makeText(this,"toast2",Toast.LENGTH_LONG);
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
    public  void toast3(View view){
        //加载自定义布局文件，将其转换为一个View类的实例
        LayoutInflater layoutInflater=getLayoutInflater();
        //加载布局文件 null完全加载
        View view1=layoutInflater.inflate(R.layout.layout_toast,null);

        //设置显示的文本
        TextView textView=(TextView) view.findViewById(R.id.toast_tv);
        textView.setText("toast3");

        Toast toast=new Toast(this);//实例化
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

}
