package ru.mirea.polyakov.lablesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView =findViewById(R.id.tvOut);
        buttonOk =findViewById(R.id.btnOk);
        buttonCancel =findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Привет");
                textView.setVisibility(View.VISIBLE);
            }
        };
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.INVISIBLE);
            }
        };
        buttonCancel.setOnClickListener (oclBtnCancel);
        buttonOk.setOnClickListener(oclBtnOK);
    }
}
