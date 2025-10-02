package com.auth0.android.provider;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/provider/IdTokenVerificationOptions;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdTokenVerificationOptions {

    /* renamed from: a, reason: collision with root package name */
    public final String f13662a;
    public final String b;
    public final SignatureVerifier c;
    public String d;
    public String e;
    public Integer f;
    public Date g;

    public IdTokenVerificationOptions(String issuer, String audience, SignatureVerifier signatureVerifier) {
        Intrinsics.h(issuer, "issuer");
        Intrinsics.h(audience, "audience");
        this.f13662a = issuer;
        this.b = audience;
        this.c = signatureVerifier;
    }
}
