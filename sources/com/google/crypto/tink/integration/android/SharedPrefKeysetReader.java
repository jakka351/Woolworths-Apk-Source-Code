package com.google.crypto.tink.integration.android;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.subtle.Hex;
import java.io.IOException;

/* loaded from: classes.dex */
public final class SharedPrefKeysetReader implements KeysetReader {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15003a;
    public final String b;

    public SharedPrefKeysetReader(Context context, String str, String str2) {
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f15003a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f15003a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    public final byte[] a() throws IOException {
        String str = this.b;
        try {
            String string = this.f15003a.getString(str, null);
            if (string != null) {
                return Hex.a(string);
            }
            throw new IOException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException e) {
            e = e;
            throw new IOException(a.h("can't read keyset; the pref value ", str, " is not a valid hex string"), e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new IOException(a.h("can't read keyset; the pref value ", str, " is not a valid hex string"), e);
        }
    }
}
