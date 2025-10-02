package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes5.dex */
public final class zzafw {
    public static zzajg zza(PhoneAuthCredential phoneAuthCredential) {
        return !TextUtils.isEmpty(phoneAuthCredential.h) ? zzajg.zzb(phoneAuthCredential.f, phoneAuthCredential.h, phoneAuthCredential.g) : zzajg.zza(phoneAuthCredential.d, phoneAuthCredential.e, phoneAuthCredential.g);
    }
}
