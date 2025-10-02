package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes5.dex */
public final class zzcu {
    @EnsuresNonNull
    @Deprecated
    @Pure
    public static String zza(@Nullable String str) {
        zzghc.zza(!TextUtils.isEmpty(str));
        return str;
    }
}
