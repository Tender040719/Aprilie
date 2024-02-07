package sept.eight.music.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import sept.eight.music.R;
import sept.eight.util.SuperDataUtil;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView textView = findViewById(R.id.textView);
        textView.setText(getString(R.string.copy_right, SuperDataUtil.currentYear()));
    }
}