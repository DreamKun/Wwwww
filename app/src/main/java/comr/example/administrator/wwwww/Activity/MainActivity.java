package comr.example.administrator.wwwww.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import comr.example.administrator.wwwww.Fragment.oneFragment;
import comr.example.administrator.wwwww.R;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(FloatingActionButton)findViewById(R.id.main_fab);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_fl,new oneFragment());
        ft.commit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
