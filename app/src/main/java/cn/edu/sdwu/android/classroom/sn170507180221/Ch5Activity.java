package cn.edu.sdwu.android.classroom.sn170507180221;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
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
    public void notification(View view){
        Notification.Builder builder=new Notification.Builder(this);
        //在构造器中，完成通知各种属性的设置
        builder.setContentTitle("title");
        builder.setContentText("message");
        builder.setWhen(System.currentTimeMillis());
        builder.setSmallIcon(android.R.drawable.ic_input_delete);//引用系统资源
        //调用build方法 完成构造
        Notification notification=builder.build();
        //调用Notificationmanager发送通知
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(101,notification);

    }
    public void cancel_notification(View view){
        //调用Notificationmanager取消通知
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(101);

    }
    public void alert_dialog(View view){
        AlertDialog.Builder builder=new AlertDialog().Builder(this);
        //在构造器中设置对话框的属性
        builder.setTitle("title");
        builder.setMessage("message");
        builder.setIcon(android.R.drawable.ic_dialog_email);
        builder.setPositiveButton("confirm", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //添 加
                Toast.makeText(Ch5Activity.this,"confirm",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Ch5Activity.this,"exit",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Ch5Activity.this,"cancel",Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();

    }

}
