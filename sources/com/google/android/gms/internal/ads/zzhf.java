package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzhf extends IllegalStateException {
    public zzhf(int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(i2).length() + 1);
        androidx.constraintlayout.core.state.a.t(i, i2, "Buffer too small (", " < ", sb);
        sb.append(")");
        super(sb.toString());
    }
}
