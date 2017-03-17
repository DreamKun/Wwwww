package comr.example.administrator.wwwww.Kuangjia;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by TONGFANGPC on 2016/12/14.
 */

public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        View rootView= findViewById(android.R.id.content);
        findButtonSetOnClickListener(rootView, this);
        initView();
        initListener();
        initData();

    }


    /** 返回一个用于设置界面的布局id */
    public abstract int getLayoutResID();
    /** 初始化View的代码必须写在这个方法里面 */
    public abstract void initView();
    /** 设置监听器的代码必须写在这个方法里面 */
    public abstract void initListener();
    /** 获取数据，并展示到Ui上 */
    public abstract void initData();



    public static void findButtonSetOnClickListener(View view, View.OnClickListener listener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            // 遍历容器里面的所有子View
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View child = viewGroup.getChildAt(i);
                if (child instanceof Button || child instanceof ImageButton) {
                    child.setOnClickListener(listener);
                } else if (child instanceof ViewGroup) {
                    findButtonSetOnClickListener(child, listener);
                }
            }
        }
    }

}
