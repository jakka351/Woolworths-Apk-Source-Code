package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzgr extends zzgp {
    public final int zzc;

    public zzgr(int i, @Nullable String str, @Nullable IOException iOException, Map map, zzge zzgeVar, byte[] bArr) {
        super(YU.a.n(new StringBuilder(String.valueOf(i).length() + 15), "Response code: ", i), iOException, zzgeVar, 2004, 1);
        this.zzc = i;
    }
}
