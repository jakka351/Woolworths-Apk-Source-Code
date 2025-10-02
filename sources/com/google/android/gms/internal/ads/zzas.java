package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.io.IOException;

/* loaded from: classes5.dex */
public class zzas extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzas(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzas zza(@Nullable String str, @Nullable Throwable th) {
        return new zzas(str, th, true, 0);
    }

    public static zzas zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzas(str, th, true, 1);
    }

    public static zzas zzc(@Nullable String str) {
        return new zzas(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z = this.zza;
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + String.valueOf(z).length() + strConcat.length() + 20 + 11 + 1);
        d.A(strConcat, "{contentIsMalformed=", ", dataType=", sb, z);
        return YU.a.m(sb, i, "}");
    }
}
