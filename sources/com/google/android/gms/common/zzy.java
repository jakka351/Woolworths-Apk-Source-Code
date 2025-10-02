package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ShowFirstParty;
import javax.annotation.Nullable;

@ShowFirstParty
/* loaded from: classes5.dex */
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th, long j) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzy zzb() {
        return zze;
    }

    public static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    public static zzy zzd(@NonNull String str, @NonNull Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    @VisibleForTesting
    public static zzy zzf(int i, long j) {
        return new zzy(true, i, 1, null, null, j);
    }

    public static zzy zzg(int i, int i2, @NonNull String str, @Nullable Throwable th) {
        return new zzy(false, i, i2, str, th, -1L);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    public /* synthetic */ zzy(boolean z, int i, int i2, String str, Throwable th, long j, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
