package com.google.android.gms.internal.common;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzq {
    public static final CharSequence zza(Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
