package com.example.abc.myprojectnum0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_pm).setOnClickListener(this);
        findViewById(R.id.btn_sh).setOnClickListener(this);
        findViewById(R.id.btn_bib).setOnClickListener(this);
        findViewById(R.id.btn_myam).setOnClickListener(this);
        findViewById(R.id.btn_gu).setOnClickListener(this);
        findViewById(R.id.btn_cap).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pm:
                showToast("POPULAR MOVIES");
                break;

            case R.id.btn_sh:
                showToast("STOCK HAWK");
                break;

            case R.id.btn_bib:
                showToast("BUILD IT BIGGER");
                break;

            case R.id.btn_myam:
                showToast("MAKE YOUR APP MATERIAL");
                break;

            case R.id.btn_gu:
                showToast("GO UBIQUITOUS");
                break;

            case R.id.btn_cap:
                showToast("CAPSTONE");
                break;
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, "This button will launch my " + msg + "  app!", Toast.LENGTH_SHORT).show();

    }


}
