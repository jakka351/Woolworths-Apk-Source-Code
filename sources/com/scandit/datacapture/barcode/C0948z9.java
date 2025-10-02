package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.z9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0948z9 implements InterfaceC0933y9 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18288a;

    public C0948z9(Context context) {
        Intrinsics.h(context, "context");
        this.f18288a = context;
    }

    public final E9 a() {
        E9 e9 = new E9(this.f18288a, null, 0);
        e9.setId(B9.a());
        return e9;
    }
}
