package cn.edu.sdwu.android.classroom.sn170507180221;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Ch4Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);//调用父类的方法，不可省略
        setContentView(R.layout.layout_ch4_2);//设置界面的样式

        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.ch4_2_rg);//找到事件源
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //第2个参数代表当前选中的radiobutton的ID
                RadioButton radioButton=(RadioButton) findViewById(i);
                Object object=radioButton.getTag();
                TextView textView=(TextView) findViewById(R.id.ch4_1_tv);
                if(object!=null&&object.toString().equals("1")){
                    textView.setText("right");
                }else{
                    textView.setText("wrong");
                }
            }
        });//设置监听器
    }
}
