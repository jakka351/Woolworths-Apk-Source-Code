package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;

/* loaded from: classes5.dex */
final class zzh extends zzi {
    private final char zza;

    public zzh(char c) {
        this.zza = c;
    }

    public final String toString() {
        char c = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return a.h("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
