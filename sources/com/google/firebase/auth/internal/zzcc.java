package com.google.firebase.auth.internal;

import com.google.firebase.auth.TotpSecret;

/* loaded from: classes6.dex */
public final class zzcc implements TotpSecret {

    /* renamed from: a, reason: collision with root package name */
    public String f15207a;

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSessionInfo() {
        return this.f15207a;
    }
}
