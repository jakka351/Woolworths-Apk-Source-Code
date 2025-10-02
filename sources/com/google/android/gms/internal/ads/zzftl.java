package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes5.dex */
class zzftl {
    static final String zza = new UUID(0, 0).toString();
    final zzftk zzb;
    final zzftj zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzftl(Context context, String str, String str2, String str3) {
        this.zzb = zzftk.zza(context);
        this.zzc = zzftj.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(YU.a.p(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        int length = str4.length();
        String str5 = str2 == null ? "null" : "not null";
        int length2 = str5.length() + length + 88;
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str6.length() + length2 + 13);
        androidx.constraintlayout.core.state.a.B(sb, str4, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str5, ", hashKey is ");
        sb.append(str6);
        throw new IllegalArgumentException(sb.toString());
    }

    public final zzfti zza(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfti();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZzd = zzd(z2);
        if (jZzd != -1) {
            if (jCurrentTimeMillis < jZzd) {
                this.zzb.zzb(z2 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZzd + j) {
                return zzb(str, str2);
            }
        }
        String strZze2 = zze(z2);
        return (strZze2 != null || z) ? new zzfti(strZze2, zzd(z2)) : zzb(str, str2);
    }

    public final zzfti zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", string);
        return zzf(zzh(str, str2, string), true);
    }

    public final void zzc(boolean z) throws IOException {
        String str = z ? this.zzg : this.zzf;
        zzftk zzftkVar = this.zzb;
        zzftkVar.zzf(str);
        zzftkVar.zzf(z ? this.zze : this.zzd);
    }

    public final long zzd(boolean z) {
        return this.zzb.zzd(z ? this.zzg : this.zzf, -1L);
    }

    public final String zze(boolean z) {
        return this.zzb.zzc(z ? this.zze : this.zzd, null);
    }

    public final zzfti zzf(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzftk zzftkVar = this.zzb;
        zzftkVar.zzb(z ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        zzftkVar.zzb(z ? this.zze : this.zzd, str);
        return new zzfti(str, jCurrentTimeMillis);
    }

    public final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
