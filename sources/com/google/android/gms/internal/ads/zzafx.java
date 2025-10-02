package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzafx extends zzagh {
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzafx(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (this.zzc == zzafxVar.zzc && Objects.equals(this.zza, zzafxVar.zza) && Objects.equals(this.zzb, zzafxVar.zzb) && Arrays.equals(this.zzd, zzafxVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        return Arrays.hashCode(this.zzd) + YU.a.B(i2, 31, iHashCode2, 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        androidx.constraintlayout.core.state.a.B(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        zzalVar.zzf(this.zzd, this.zzc);
    }
}
