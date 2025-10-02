package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzge {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;

    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzak.zzb("media3.datasource");
    }

    public /* synthetic */ zzge(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j2, j3, null, i2, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j = this.zze;
        int length2 = String.valueOf(j).length();
        long j2 = this.zzf;
        int length3 = String.valueOf(j2).length();
        int i = this.zzg;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        androidx.compose.ui.input.pointer.a.w(sb, "DataSpec[GET ", string, ", ");
        sb.append(j);
        androidx.constraintlayout.core.state.a.A(sb, ", ", j2, ", null, ");
        return YU.a.m(sb, i, "]");
    }

    public final boolean zza(int i) {
        return (this.zzg & i) == i;
    }

    public final zzgd zzb() {
        return new zzgd(this, null);
    }

    private zzge(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        zzghc.zza(z2);
        zzghc.zza(z2);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        zzghc.zza(z);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j2;
        this.zzf = j3;
        this.zzg = i2;
    }

    @Deprecated
    public zzge(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }
}
