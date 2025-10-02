package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzafw implements zzan {
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafw(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzghc.zza(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza == zzafwVar.zza && Objects.equals(this.zzb, zzafwVar.zzb) && Objects.equals(this.zzc, zzafwVar.zzc) && Objects.equals(this.zzd, zzafwVar.zzd) && this.zze == zzafwVar.zze && this.zzf == zzafwVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i = this.zza;
        int length3 = String.valueOf(i).length();
        int i2 = this.zzf;
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 28, length2, 11, length3) + 19 + String.valueOf(i2).length());
        androidx.constraintlayout.core.state.a.B(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, i2, "\", bitrate=", ", metadataInterval=", sb);
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        String str = this.zzc;
        if (str != null) {
            zzalVar.zzu(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzalVar.zzt(str2);
        }
    }
}
