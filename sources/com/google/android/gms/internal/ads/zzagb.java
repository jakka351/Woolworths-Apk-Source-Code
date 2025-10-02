package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzagb extends zzagh {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagb(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagb.class == obj.getClass()) {
            zzagb zzagbVar = (zzagb) obj;
            if (Objects.equals(this.zzb, zzagbVar.zzb) && Objects.equals(this.zza, zzagbVar.zza) && Objects.equals(this.zzc, zzagbVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() + ((this.zza.hashCode() + 527) * 31);
        String str = this.zzc;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = str3.length() + length + 11;
        String str4 = this.zzb;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14 + 7 + length2);
        androidx.constraintlayout.core.state.a.B(sb, str, ": language=", str3, ", description=");
        return YU.a.p(sb, str4, ", text=", str2);
    }
}
