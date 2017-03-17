package comr.example.administrator.wwwww.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import comr.example.administrator.wwwww.Fragment.oneFragment;
import comr.example.administrator.wwwww.R;

public class DataActivity extends AppCompatActivity {
    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);
        button=(FloatingActionButton)findViewById(R.id.data_fab);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.data_fl,new oneFragment());
        ft.commit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DataActivity.this,"点击成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
