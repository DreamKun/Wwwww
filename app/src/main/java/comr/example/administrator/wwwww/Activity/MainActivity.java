package comr.example.administrator.wwwww.Activity;

import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

import comr.example.administrator.wwwww.Kuangjia.BaseActivity;
import comr.example.administrator.wwwww.R;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class MainActivity extends BaseActivity {
    private NavigationView navigationView;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    @Override
    public int getLayoutResID() {
        return R.layout.main_layout;
    }

    @Override
    public void initView() {
        navigationView=(NavigationView)findViewById(R.id.main_nv);
        getChe();
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.ce_b1:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ce_b2:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ce_b3:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ce_b4:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ce_b5:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ce_b6:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ce_b7:
                Toast.makeText(MainActivity.this,"点击",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void getChe(){
        //设置侧边栏的布局
        navigationView.inflateHeaderView(R.layout.ce_lauot);

        //拿到侧边栏的整个的View ，可以找到空间，通常是用 0 。
        View view =navigationView.getHeaderView(0);

        //拿到侧边栏的一个ImageView 设置他的图片
        SimpleDraweeView draweeView = (SimpleDraweeView) view.findViewById(R.id.ce_back);
        SimpleDraweeView phtot=(SimpleDraweeView)view.findViewById(R.id.ce_photo);
        draweeView.setImageURI(Uri.parse("http://pic.51yuansu.com/pic2/cover/00/16/21/579ae4930e4c1_610.jpg"));
        phtot.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489726572893&di=0cddbca12088723924109669bb3e4fd6&imgtype=0&src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201510%2F05%2F20151005045731_zNKAS.thumb.224_0.jpeg"));
        b1=(Button)view.findViewById(R.id.ce_b1);
        b2=(Button)view.findViewById(R.id.ce_b2);
        b3=(Button)view.findViewById(R.id.ce_b3);
        b4=(Button)view.findViewById(R.id.ce_b4);
        b5=(Button)view.findViewById(R.id.ce_b5);
        b6=(Button)view.findViewById(R.id.ce_b6);
        b7=(Button)view.findViewById(R.id.ce_b7);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);


    }
}
