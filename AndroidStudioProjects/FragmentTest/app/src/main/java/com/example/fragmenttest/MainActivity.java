package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);//实例化按钮1
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());

        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);//实例化按钮2
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                replaceFragment(new AnotherRightFragment());
                break;//点击按钮1时
            case R.id.button2:
                replaceFragment(new RightFragment());
                break;//点击按钮2时
            default:
                break;
        }
    }

    private void replaceFragment(Fragment fragment){
        //FragmentManager fragmentManager = getSupportFragmentManager();
        //FragmentTransaction transaction = fragmentManager.beginTransaction();
        //transaction.replace(R.id.another_right_fragment, fragment);
        //transaction.addToBackStack(null);
        //transaction.commit();
    }
}
