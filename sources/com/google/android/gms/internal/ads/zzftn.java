package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzftn extends zzftl {
    private static zzftn zzd;

    private zzftn(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzftn zzh(Context context) {
        zzftn zzftnVar;
        synchronized (zzftn.class) {
            try {
                if (zzd == null) {
                    zzd = new zzftn(context);
                }
                zzftnVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzftnVar;
    }

    public final zzfti zzi(long j, boolean z) throws IOException {
        synchronized (zzftn.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j, z);
                }
                return new zzfti();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzftn.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
