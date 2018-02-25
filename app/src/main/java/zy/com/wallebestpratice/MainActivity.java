package zy.com.wallebestpratice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
        TextView textView = findViewById(R.id.tv);
        textView.setText("渠道名："+channel);
    }
}
