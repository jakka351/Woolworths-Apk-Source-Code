package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzgej extends zzger {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzgej(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzger) {
            zzger zzgerVar = (zzger) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgerVar.zza()) : zzgerVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgerVar.zzb()) : zzgerVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        androidx.constraintlayout.core.state.a.B(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzger
    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzger
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
