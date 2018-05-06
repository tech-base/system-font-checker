package tb.systemfontchecker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.techbase.systemfontchecker.SystemFontChecker;

public class MainActivity extends AppCompatActivity {

    private SystemFontChecker systemFontChecker = SystemFontChecker.getInstance();
    private TextView lblFontInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblFontInfo = findViewById(R.id.lblFontInfo);

        if (systemFontChecker.isUnicode(getApplicationContext())) {
            lblFontInfo.setText("This device use unicode.");
        } else {
            lblFontInfo.setText("This device use zawgyi.");
        }
    }
}
