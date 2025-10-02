package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0957a3 extends AbstractC0966b3 {

    /* renamed from: a, reason: collision with root package name */
    private final NativeHintStyle f18406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0957a3(NativeHintStyle style) {
        super(0);
        Intrinsics.h(style, "style");
        this.f18406a = style;
    }

    public final NativeHintStyle a() {
        return this.f18406a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0957a3) && Intrinsics.c(this.f18406a, ((C0957a3) obj).f18406a);
    }

    public final int hashCode() {
        return this.f18406a.hashCode();
    }

    public final String toString() {
        return "Update(style=" + this.f18406a + ')';
    }
}
