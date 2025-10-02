package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zzs implements zzq {
    private zzs() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzq
    public final zzl zza(String str) {
        return new zzo(Pattern.compile(str));
    }
}
