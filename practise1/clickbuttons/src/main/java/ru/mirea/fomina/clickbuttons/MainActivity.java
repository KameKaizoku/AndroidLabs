package ru.mirea.fomina.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclbtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        buttonOk.setOnClickListener(oclbtnCancel);
    }
}