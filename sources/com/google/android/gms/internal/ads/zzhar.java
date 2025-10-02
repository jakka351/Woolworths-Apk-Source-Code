package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhar extends zzhau {
    private final int zza;
    private final int zzb;
    private final zzhaq zzc;
    private final zzhap zzd;

    public /* synthetic */ zzhar(int i, int i2, zzhaq zzhaqVar, zzhap zzhapVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhaqVar;
        this.zzd = zzhapVar;
    }

    public static zzhao zzb() {
        return new zzhao(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhar)) {
            return false;
        }
        zzhar zzharVar = (zzhar) obj;
        return zzharVar.zza == this.zza && zzharVar.zze() == zze() && zzharVar.zzc == this.zzc && zzharVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhar.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhap zzhapVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhapVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.zzb;
        int length3 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        androidx.constraintlayout.core.state.a.B(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        androidx.constraintlayout.core.state.a.t(i, i2, ", ", "-byte tags, and ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzc != zzhaq.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhaq zzhaqVar = this.zzc;
        if (zzhaqVar == zzhaq.zzd) {
            return this.zzb;
        }
        if (zzhaqVar == zzhaq.zza || zzhaqVar == zzhaq.zzb || zzhaqVar == zzhaq.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhaq zzf() {
        return this.zzc;
    }

    public final zzhap zzg() {
        return this.zzd;
    }
}
