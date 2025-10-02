package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzqa extends Exception {
    public zzqa(long j, long j2) {
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        androidx.constraintlayout.core.state.a.A(sb, "Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
        sb.append(j);
        super(sb.toString());
    }
}
