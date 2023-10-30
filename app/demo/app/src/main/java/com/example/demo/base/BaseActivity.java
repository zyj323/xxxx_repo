package com.example.demo.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.example.demo.R;
import com.example.demo.util.SuperDarkUtil;
import com.example.demo.util.SuperUtil;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public abstract class BaseActivity<T extends ViewBinding> extends AppCompatActivity {

    private T viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = getViewBinding();
        setContentView(viewBinding.getRoot());
        //设置沉浸式状态栏  看不见电量显示
        QMUIStatusBarHelper.translucent(this);
        //设置状态栏黑色字体图标
//        QMUIStatusBarHelper.setStatusBarLightMode(this);

        if (SuperDarkUtil.isDark(this)) {
            QMUIStatusBarHelper.setStatusBarDarkMode(this);
        } else {
            QMUIStatusBarHelper.setStatusBarLightMode(this);
        }
        initData();
    }

    protected abstract T getViewBinding();
    protected abstract void initData();

}
