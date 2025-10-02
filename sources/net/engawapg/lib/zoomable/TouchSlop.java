package net.engawapg.lib.zoomable;

import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnet/engawapg/lib/zoomable/TouchSlop;", "", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class TouchSlop {

    /* renamed from: a, reason: collision with root package name */
    public final float f26628a;
    public float b = 1.0f;
    public long c = 0;
    public boolean d;

    public TouchSlop(float f) {
        this.f26628a = f;
    }

    public final boolean a(PointerEvent event) {
        Intrinsics.h(event, "event");
        boolean z = true;
        if (this.d) {
            return true;
        }
        this.b = TransformGestureDetectorKt.f(event) * this.b;
        this.c = Offset.h(this.c, TransformGestureDetectorKt.d(event));
        float fC = TransformGestureDetectorKt.c(event, false) * Math.abs(1 - this.b);
        float fD = Offset.d(this.c);
        float f = this.f26628a;
        if (fC <= f && fD <= f) {
            z = false;
        }
        this.d = z;
        return z;
    }
}
