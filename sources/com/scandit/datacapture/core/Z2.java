package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z2 extends AbstractC0966b3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18401a;
    private final NativeHintStyle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(String hint, NativeHintStyle style) {
        super(0);
        Intrinsics.h(hint, "hint");
        Intrinsics.h(style, "style");
        this.f18401a = hint;
        this.b = style;
    }

    public final String a() {
        return this.f18401a;
    }

    public final NativeHintStyle b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z2)) {
            return false;
        }
        Z2 z2 = (Z2) obj;
        return Intrinsics.c(this.f18401a, z2.f18401a) && Intrinsics.c(this.b, z2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18401a.hashCode() * 31);
    }

    public final String toString() {
        return "Show(hint=" + this.f18401a + ", style=" + this.b + ')';
    }
}
