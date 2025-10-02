package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public class TwaSharedPreferencesManager {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14787a;

    public TwaSharedPreferencesManager(Context context) {
        this.f14787a = context.getSharedPreferences("TrustedWebActivityLauncherPrefs", 0);
    }
}
