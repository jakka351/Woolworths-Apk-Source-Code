package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.KeysetWriter;

/* loaded from: classes.dex */
public final class SharedPrefKeysetWriter implements KeysetWriter {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f15004a;
    public final String b;

    public SharedPrefKeysetWriter(Context context, String str, String str2) {
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f15004a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f15004a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }
}
