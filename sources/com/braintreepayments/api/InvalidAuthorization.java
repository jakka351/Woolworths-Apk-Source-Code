package com.braintreepayments.api;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/InvalidAuthorization;", "Lcom/braintreepayments/api/Authorization;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class InvalidAuthorization extends Authorization {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAuthorization(String str, String errorMessage) {
        super(str);
        Intrinsics.h(errorMessage, "errorMessage");
        this.b = errorMessage;
    }

    @Override // com.braintreepayments.api.Authorization
    /* renamed from: a */
    public final String getC() {
        return null;
    }

    @Override // com.braintreepayments.api.Authorization
    /* renamed from: b */
    public final String getB() {
        return null;
    }
}
