package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzafs implements zzan {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzs zzsVar = new zzs();
        zzsVar.zzm("application/id3");
        zzsVar.zzM();
        zzs zzsVar2 = new zzs();
        zzsVar2.zzm("application/x-scte35");
        zzsVar2.zzM();
    }

    public zzafs(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafs.class == obj.getClass()) {
            zzafs zzafsVar = (zzafs) obj;
            if (this.zzc == zzafsVar.zzc && this.zzd == zzafsVar.zzd && Objects.equals(this.zza, zzafsVar.zza) && Objects.equals(this.zzb, zzafsVar.zzb) && Arrays.equals(this.zze, zzafsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) j2)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        long j = this.zzd;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        int length2 = String.valueOf(j2).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(str2.length() + length3 + 8);
        androidx.compose.ui.input.pointer.a.w(sb, "EMSG: scheme=", str, ", id=");
        sb.append(j);
        androidx.constraintlayout.core.state.a.A(sb, ", durationMs=", j2, ", value=");
        sb.append(str2);
        return sb.toString();
    }
}
