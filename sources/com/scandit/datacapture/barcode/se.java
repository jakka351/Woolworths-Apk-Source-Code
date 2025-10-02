package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class se implements InterfaceC0635g7 {

    /* renamed from: a, reason: collision with root package name */
    private final re f18008a;

    public se(Context context) {
        Intrinsics.h(context, "context");
        this.f18008a = new re(context);
    }

    public final void a(String text, boolean z) {
        Intrinsics.h(text, "text");
        if (z) {
            this.f18008a.a(pe.MoveCloser, text);
        } else {
            this.f18008a.a(pe.TextOnly, text);
        }
    }

    public final re a() {
        return this.f18008a;
    }
}
