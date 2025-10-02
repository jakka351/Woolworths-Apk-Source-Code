package com.scandit.datacapture.barcode;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class G0 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    private final int f17165a;
    private final int b;
    final /* synthetic */ R0 c;

    public G0(R0 r0, int i, int i2) {
        this.c = r0;
        this.f17165a = i;
        this.b = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.h(view, "view");
        Intrinsics.h(outline, "outline");
        int iFloatValue = this.c.g() ? (int) (((Number) R0.h.getD()).floatValue() - ((Number) R0.j.getD()).floatValue()) : 0;
        outline.setOval(iFloatValue, iFloatValue, this.f17165a - iFloatValue, this.b - iFloatValue);
    }
}
