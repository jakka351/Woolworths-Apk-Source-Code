package com.google.android.gms.internal.measurement;

import android.os.Binder;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
interface zzjv {
    static Object zzh(zzju zzjuVar) {
        try {
            return zzjuVar.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzjuVar.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    @Nullable
    Object zze(String str);
}
