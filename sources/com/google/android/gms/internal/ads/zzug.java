package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class zzug {
    private static final AtomicLong zza = new AtomicLong();

    public zzug(long j, zzge zzgeVar, Uri uri, Map map, long j2, long j3, long j4) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzug(long j, zzge zzgeVar, long j2) {
        Uri uri = zzgeVar.zza;
    }
}
