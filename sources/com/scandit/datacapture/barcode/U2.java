package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U2 {

    /* renamed from: a, reason: collision with root package name */
    private final View f17312a;
    private final Rect b;
    private final AbstractC0945z6 c;
    private final BarcodePickState d;
    private final TrackedObject e;

    public U2(View view, Rect rect, C0669i9 tapData, BarcodePickState pickState, TrackedObject trackedObject) {
        Intrinsics.h(view, "view");
        Intrinsics.h(rect, "rect");
        Intrinsics.h(tapData, "tapData");
        Intrinsics.h(pickState, "pickState");
        Intrinsics.h(trackedObject, "trackedObject");
        this.f17312a = view;
        this.b = rect;
        this.c = tapData;
        this.d = pickState;
        this.e = trackedObject;
    }

    public final BarcodePickState a() {
        return this.d;
    }

    public final Rect b() {
        return this.b;
    }

    public final AbstractC0945z6 c() {
        return this.c;
    }

    public final TrackedObject d() {
        return this.e;
    }

    public final View e() {
        return this.f17312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U2)) {
            return false;
        }
        U2 u2 = (U2) obj;
        return Intrinsics.c(this.f17312a, u2.f17312a) && Intrinsics.c(this.b, u2.b) && Intrinsics.c(this.c, u2.c) && this.d == u2.d && Intrinsics.c(this.e, u2.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f17312a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BarcodePickCustomViewDrawData(view=" + this.f17312a + ", rect=" + this.b + ", tapData=" + this.c + ", pickState=" + this.d + ", trackedObject=" + this.e + ')';
    }
}
