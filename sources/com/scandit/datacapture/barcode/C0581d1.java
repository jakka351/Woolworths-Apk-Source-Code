package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Rect;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0581d1 implements X0 {
    private static final Lazy g = LazyKt.b(Z0.f17362a);
    private static final Lazy h = LazyKt.b(Y0.f17350a);
    private static final Lazy i = LazyKt.b(C0513a1.f17371a);
    private static final Lazy j = LazyKt.b(C0529b1.f17383a);
    private static final Anchor[] k = {Anchor.TOP_LEFT, Anchor.TOP_CENTER, Anchor.TOP_RIGHT, Anchor.BOTTOM_LEFT};

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureView f17591a;
    private final TorchSwitchControl b;
    private boolean c;
    private final Rect d;
    private boolean e;
    private Anchor f;

    public C0581d1(DataCaptureView dataCaptureView) {
        Intrinsics.h(dataCaptureView, "dataCaptureView");
        this.f17591a = dataCaptureView;
        Context context = dataCaptureView.getContext();
        Intrinsics.g(context, "dataCaptureView.context");
        this.b = new TorchSwitchControl(context);
        this.d = new Rect();
        this.f = BarcodeFindViewDefaults.getDefaultTorchControlPosition();
    }

    public final Anchor e() {
        return this.f;
    }

    public final void f() {
        this.f17591a.removeControl(this.b);
        this.c = false;
    }

    public final void g() {
        if (this.c) {
            this.f17591a.removeControl(this.b);
        }
        Pair pairA = a(this.f);
        this.f17591a.addControl(this.b, (Anchor) pairA.d, (PointWithUnit) pairA.e);
        this.c = true;
    }

    public final void a(boolean z) {
        this.e = z;
        if (this.c) {
            this.f17591a.removeControl(this.b);
            Pair pairA = a(this.f);
            this.f17591a.addControl(this.b, (Anchor) pairA.d, (PointWithUnit) pairA.e);
        }
    }

    public final void b(Anchor value) {
        Intrinsics.h(value, "value");
        this.f = value;
        if (this.c) {
            this.f17591a.removeControl(this.b);
            Pair pairA = a(this.f);
            this.f17591a.addControl(this.b, (Anchor) pairA.d, (PointWithUnit) pairA.e);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        Rect rect = this.d;
        rect.left = i2;
        rect.top = i3;
        rect.right = i4;
        rect.bottom = i5;
        if (this.c) {
            this.f17591a.removeControl(this.b);
            Pair pairA = a(this.f);
            this.f17591a.addControl(this.b, (Anchor) pairA.d, (PointWithUnit) pairA.e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.Pair a(com.scandit.datacapture.core.common.geometry.Anchor r7) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.C0581d1.a(com.scandit.datacapture.core.common.geometry.Anchor):kotlin.Pair");
    }
}
