package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzaf {
    public final Uri zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final zzac zzc;

    @Nullable
    public final zzx zzd;
    public final List zze;

    @Nullable
    public final String zzf;
    public final zzgjz zzg;

    @Nullable
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzaf(Uri uri, String str, zzac zzacVar, zzx zzxVar, List list, String str2, zzgjz zzgjzVar, Object obj, long j, byte[] bArr) {
        this.zza = uri;
        int i = zzar.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgjzVar;
        int i2 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        if (zzgjzVar.size() > 0) {
            throw null;
        }
        zzgjwVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        return this.zza.equals(zzafVar.zza) && this.zze.equals(zzafVar.zze) && this.zzg.equals(zzafVar.zzg);
    }

    public final int hashCode() {
        return (int) ((((this.zzg.hashCode() + androidx.camera.core.impl.b.d(this.zza.hashCode() * 923521, 961, this.zze)) * 31) * 31) - Long.MAX_VALUE);
    }
}
