package comr.example.administrator.wwwww.Activity;

import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

import comr.example.administrator.wwwww.Kuangjia.BaseActivity;
import comr.example.administrator.wwwww.R;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class MainActivity extends BaseActivity  {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar toolbar;
//    private ImageButton imageButton;
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
//        imageButton=(ImageButton)findViewById(R.id.mian_ce) ;
//        imageButton.setOnClickListener(this);
        drawerLayout=(DrawerLayout)findViewById(R.id.main_dl);
        toolbar=(Toolbar)findViewById(R.id.main_tb);
        toolbar.setTitle("首页");

        getChe();
        initDrawer(toolbar);
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
//            case R.id.mian_ce:
//                drawerLayout.openDrawer(GravityCompat.START);
//                break;
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
        phtot.setImageURI(Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489729877495&di=f5cf9bdcda77e5aaa099a4d4592daa3a&imgtype=0&src=http%3A%2F%2Fscimg.jb51.net%2Fallimg%2F160714%2F102-160G4220036118.jpg"));
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

    public void initDrawer(Toolbar toolbar) {
        if (toolbar != null) {
            mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close) {
                @Override
                public void onDrawerOpened(View drawerView) {
                    super.onDrawerOpened(drawerView);
                }

                @Override
                public void onDrawerClosed(View drawerView) {
                    super.onDrawerClosed(drawerView);
                }
            };
            mDrawerToggle.syncState();
            drawerLayout.addDrawerListener(mDrawerToggle);
        }
    }
}
