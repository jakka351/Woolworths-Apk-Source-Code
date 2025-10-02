package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzagp extends zzaid {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public zzagp(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaid) {
            zzaid zzaidVar = (zzaid) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzaidVar.zzb()) : zzaidVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzaidVar.zza()) : zzaidVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.j("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaid
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaid
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
