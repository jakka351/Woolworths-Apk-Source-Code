package com.auth0.android.provider;

import java.util.List;

/* loaded from: classes4.dex */
abstract class SignatureVerifier {

    /* renamed from: a, reason: collision with root package name */
    public final List f13669a;

    public SignatureVerifier(List list) {
        this.f13669a = list;
    }

    public abstract void a(String[] strArr);
}
