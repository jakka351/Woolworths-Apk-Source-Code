package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.j7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0683j7 implements InterfaceC0667i7 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17821a;

    public C0683j7(Context context) {
        Intrinsics.h(context, "context");
        this.f17821a = context;
    }

    public final InterfaceC0635g7 a() {
        return new se(this.f17821a);
    }
}
