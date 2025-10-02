package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzbd {
    public static final Object zza = new Object();
    private static final zzaj zzp;

    @Nullable
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Nullable
    public zzae zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzaj zzd = zzp;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("androidx.media3.common.Timeline");
        zzyVar.zzb(Uri.EMPTY);
        zzp = zzyVar.zzc();
        String str = zzeo.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class.equals(obj.getClass())) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equals(this.zzb, zzbdVar.zzb) && Objects.equals(this.zzd, zzbdVar.zzd) && Objects.equals(this.zzj, zzbdVar.zzj) && this.zze == zzbdVar.zze && this.zzf == zzbdVar.zzf && this.zzg == zzbdVar.zzg && this.zzh == zzbdVar.zzh && this.zzi == zzbdVar.zzi && this.zzk == zzbdVar.zzk && this.zzm == zzbdVar.zzm && this.zzn == zzbdVar.zzn && this.zzo == zzbdVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzae zzaeVar = this.zzj;
        int iB = YU.a.B(iHashCode, 961, zzaeVar == null ? 0 : zzaeVar.hashCode(), 31);
        long j = this.zze;
        int i = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzf;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzg;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j4 = this.zzm;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbd zza(Object obj, @Nullable zzaj zzajVar, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable zzae zzaeVar, long j4, long j5, int i, int i2, long j6) {
        this.zzb = obj;
        if (zzajVar == null) {
            zzajVar = zzp;
        }
        this.zzd = zzajVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzaeVar;
        this.zzl = 0L;
        this.zzm = j5;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
