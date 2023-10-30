package com.example.demo.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.demo.R;
import com.example.demo.base.BaseActivity;
import com.example.demo.databinding.ActivitySplashBinding;
import com.example.demo.util.SuperUtil;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class SplashActivity extends BaseActivity<ActivitySplashBinding> {



    @Override
    protected ActivitySplashBinding getViewBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void initData() {
        //设置版本年份
//        int year = SuperUtil.currentYear();
//        binding.year.setText(year + getString(R.string.text_wangyi));
        ActivitySplashBinding
    }
}