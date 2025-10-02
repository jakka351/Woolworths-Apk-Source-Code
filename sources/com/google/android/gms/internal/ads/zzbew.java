package com.google.android.gms.internal.ads;

import com.medallia.digital.mobilesdk.l8;

/* loaded from: classes.dex */
public final class zzbew {
    public static final zzbds zza;

    static {
        zzbds.zzb("gads:ad_loader:timeout_ms", l8.b.b);
        zza = zzbds.zzb("gads:rendering:timeout_ms", l8.b.b);
        zzbds.zzb("gads:resolve_future:default_timeout_ms", 30000L);
    }
}
