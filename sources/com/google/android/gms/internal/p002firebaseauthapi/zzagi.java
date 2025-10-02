package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzagi {
    @Nullable
    public static String zza(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
