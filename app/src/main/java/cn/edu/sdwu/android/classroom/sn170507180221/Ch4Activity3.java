package cn.edu.sdwu.android.classroom.sn170507180221;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Ch4Activity3 extends AppCompatActivity {
    public ArrayList List;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List=new ArrayList();
        textView=(TextView)findViewById(R.id.ch4_3_tv) ;

        super.onCreate(savedInstanceState);//调用父类的方法，不可省略
        setContentView(R.layout.layout_ch4_3);//设置界面的样式

        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.ch4_3_ll);
        int count=LinearLayout.getChildCount();
        for(int i=0;i<count;i++){
            View view=LinearLayout.getChildAt(i);
            if(view instanceof CheckBox){
                final CheckBox checkBox=(CheckBox)view;
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        //
                        if(b){
                            List.add(compoundButton);
                        }else{
                            List.remove(compoundButton);
                        }
                        String content="you select:";
                        for(int t = 0; List > t; t++){
                            CheckBox checkBox1=(CheckBox)List.get(t);
                            String sel=checkBox1.getText().toString();
                            content+=sel+",";
                        }
                        textView.setText(content);
                    }
                });
            }
        }

    }
}
