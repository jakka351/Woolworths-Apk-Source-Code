package com.google.android.gms.internal.oss_licenses;

import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class zzn {
    private final zzi zza = new zzi();
    private final String zzb;
    private volatile Logger zzc;

    public zzn(Class cls) {
        this.zzb = cls.getName();
    }

    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
