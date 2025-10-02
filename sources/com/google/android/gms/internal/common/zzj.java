package com.google.android.gms.internal.common;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzj {
    @Nullable
    public static Object zza(Class cls, String str, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    @Nullable
    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    @Nullable
    private static Object zzc(Class cls, String str, @Nullable Object obj, boolean z, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < zziVarArr.length; i++) {
            zzi zziVar = zziVarArr[i];
            zziVar.getClass();
            clsArr[i] = zziVar.zzc();
            objArr[i] = zziVarArr[i].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
