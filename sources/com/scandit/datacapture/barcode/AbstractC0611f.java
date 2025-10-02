package com.scandit.datacapture.barcode;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0611f {
    public static final void a(View view, C0527b spec) {
        Intrinsics.h(view, "<this>");
        Intrinsics.h(spec, "spec");
        view.setAlpha(spec.a());
        view.setElevation(spec.b());
        view.setScaleX(spec.c());
        view.setScaleY(spec.c());
        view.setTranslationY(spec.d());
    }

    public static final Function1 b(View view, C0527b spec) {
        Intrinsics.h(view, "<this>");
        Intrinsics.h(spec, "spec");
        C0527b c0527bA = AbstractC0511a.a(view);
        Intrinsics.h(c0527bA, "<this>");
        return new C0595e(new C0579d(new C0543c(c0527bA, spec)), view);
    }
}
