package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.style.BrushSerializer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.t9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0850t9 implements BarcodePickBrush {

    /* renamed from: a, reason: collision with root package name */
    private final Brush f18141a;

    private /* synthetic */ C0850t9(Brush brush) {
        this.f18141a = brush;
    }

    public static final /* synthetic */ C0850t9 a(Brush brush) {
        return new C0850t9(brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush
    public final Brush asBrush() {
        return this.f18141a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0850t9) && Intrinsics.c(this.f18141a, ((C0850t9) obj).f18141a);
    }

    public final int hashCode() {
        return this.f18141a.hashCode();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush
    public final String toJson() {
        return BrushSerializer.toJson(this.f18141a);
    }

    public final String toString() {
        return "SetBrush(brush=" + this.f18141a + ')';
    }
}
