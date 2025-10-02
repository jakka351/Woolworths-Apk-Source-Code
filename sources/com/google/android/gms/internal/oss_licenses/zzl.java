package com.google.android.gms.internal.oss_licenses;

import com.google.android.gms.internal.oss_licenses.zzk;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final /* synthetic */ class zzl implements PrivilegedExceptionAction {
    static final /* synthetic */ zzl zza = new zzl();

    private /* synthetic */ zzl() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        int i = zzk.zzd.zzg;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
