package com.example.toastutil;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToastUtils {
    public static void showToast(Context context, String str) {
        Log.d("ToastUtils", "toast:" + str);
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
