package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public class PrefUtils {
    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
    }
}
