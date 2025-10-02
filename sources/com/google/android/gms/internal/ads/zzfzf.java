package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class zzfzf extends zzfzq {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzfzf(zzarw zzarwVar, zzfym zzfymVar, zzgea zzgeaVar) {
        super("4EuCewMNo7oy5HJGjIHWZVxouDpcyFQvVYKjdCC+HW0E6LLnkuCZqI8dzQVnGx8e", "LgWy0irzLAc0ySGOZyKJEvwv+9ISzhvaYv1Kh0MSt9M=", zzarwVar, zzfymVar, zzgeaVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l = (Long) method.invoke("", null);
                        if (l == null) {
                            throw null;
                        }
                        zza = l;
                    }
                } finally {
                }
            }
        }
        synchronized (zzarwVar) {
            try {
                if (zza != null) {
                    zzarwVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
