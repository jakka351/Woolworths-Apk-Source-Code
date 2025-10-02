package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class zzlx implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    private zzlx(String str) {
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
        this.zzb = str;
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
    }

    public static zzlx zze(String str) {
        zzmw.zza();
        if (!zzmw.zzb()) {
            return zzlv.zza;
        }
        Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.zze;
        if (j == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j);
    }

    public zzlx zzb() {
        this.zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.zzf;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            zza();
        }
        this.zzf = jElapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j;
        this.zzg = Math.min(this.zzg, j);
        this.zzh = Math.max(this.zzh, j);
        if (this.zzc % 50 == 0) {
            Locale locale = Locale.US;
            zzmw.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
