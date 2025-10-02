package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzgen extends zzgfo {
    private final int zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzgen(int i, String str, int i2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgfo) {
            zzgfo zzgfoVar = (zzgfo) obj;
            if (this.zza == zzgfoVar.zza() && ((str = this.zzb) != null ? str.equals(zzgfoVar.zzb()) : zzgfoVar.zzb() == null) && this.zzc == zzgfoVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 46, length2, 9, String.valueOf(i2).length()) + 1);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i, "OverlayDisplayState{statusCode=", ", sessionToken=", str, sb);
        return androidx.constraintlayout.core.state.a.k(sb, ", uiMode=", i2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final int zzc() {
        return this.zzc;
    }
}
