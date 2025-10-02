package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzhz extends zzat {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzu zzf;
    public final int zzg;

    @Nullable
    public final zzup zzh;
    final boolean zzi;

    private zzhz(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zzhz zza(IOException iOException, int i) {
        return new zzhz(0, iOException, i);
    }

    public static zzhz zzb(Throwable th, String str, int i, @Nullable zzu zzuVar, int i2, @Nullable zzup zzupVar, boolean z, int i3) {
        if (zzuVar == null) {
            i2 = 4;
        }
        return new zzhz(1, th, null, i3, str, i, zzuVar, i2, zzupVar, z);
    }

    public static zzhz zzc(RuntimeException runtimeException, int i) {
        return new zzhz(2, runtimeException, i);
    }

    @CheckResult
    public final zzhz zzd(@Nullable zzup zzupVar) {
        String message = getMessage();
        String str = zzeo.zza;
        return new zzhz(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzupVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzhz(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable zzu zzuVar, int i4, @Nullable zzup zzupVar, boolean z) {
        String str3;
        int i5;
        String strP;
        String str4;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            strP = "Source error";
        } else if (i != 1) {
            strP = "Unexpected runtime error";
            str3 = str2;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(zzuVar);
            String str5 = zzeo.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + strValueOf.length() + au.com.woolworths.shop.checkout.ui.confirmation.c.e(String.valueOf(str2).length() + 14, 9, String.valueOf(i3)) + 19);
            str3 = str2;
            i5 = i3;
            YU.a.x(i5, str3, " error, index=", ", format=", sb);
            strP = YU.a.p(sb, strValueOf, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strP : strP.concat(": null"), th, i2, i, str3, i5, zzuVar, i4, zzupVar, SystemClock.elapsedRealtime(), z);
    }

    private zzhz(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable zzu zzuVar, int i4, @Nullable zzup zzupVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, Bundle.EMPTY, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzghc.zza(z2);
        zzghc.zza(th != null);
        this.zzc = i2;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzuVar;
        this.zzg = i4;
        this.zzh = zzupVar;
        this.zzi = z;
    }
}
