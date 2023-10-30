package com.example.demo.util;

import android.content.Context;
import android.content.res.Configuration;

import androidx.viewbinding.ViewBinding;

import com.example.demo.base.BaseActivity;

public class SuperDarkUtil {

    public static <T extends ViewBinding> boolean isDark(Context context) {
        return (context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;
    }
}
