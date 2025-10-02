package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MDExternalError;

/* loaded from: classes6.dex */
class a3 extends MedalliaDigitalError {

    /* renamed from: a, reason: collision with root package name */
    private final MDExternalError f16372a;

    public a3(int i, MDExternalError.ExternalError externalError, String str) {
        super(i, str);
        this.f16372a = externalError != null ? new MDExternalError(externalError) : null;
    }

    public MDExternalError a() {
        return this.f16372a;
    }
}
