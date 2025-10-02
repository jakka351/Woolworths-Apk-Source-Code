package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public class zzgb extends IOException {
    public final int zza;

    public zzgb(int i) {
        this.zza = i;
    }

    public zzgb(@Nullable String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzgb(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzgb(@Nullable Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
