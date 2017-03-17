package comr.example.administrator.wwwww.Kuangjia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by TONGFANGPC on 2016/11/22.
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    private View rootView =null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView==null){
            rootView= View.inflate(getContext(),getLayot(),null);
            initView(rootView);
        }else{
            ViewGroup group=(ViewGroup)rootView.getParent();
            if (group!=null){
                group.removeView(rootView);
            }
        }
        findButtonSetOnClickListener(rootView, this);

        initListener();
        initData();
        return rootView;
    }
    public abstract int getLayot();
    protected abstract void initView(View rootView);
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
