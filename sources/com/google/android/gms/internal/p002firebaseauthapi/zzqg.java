package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
final class zzqg extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzqd.zza();
    }
}
