package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzzg extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzzg(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(YU.a.p(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
