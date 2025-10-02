package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.j3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0679j3 {

    /* renamed from: a, reason: collision with root package name */
    private final Control f17820a;
    private final boolean b;
    private Anchor c;

    public C0679j3(Control control, boolean z, Anchor anchor) {
        Intrinsics.h(control, "control");
        Intrinsics.h(anchor, "anchor");
        this.f17820a = control;
        this.b = z;
        this.c = anchor;
    }

    public final Anchor a() {
        return this.c;
    }

    public final Control b() {
        return this.f17820a;
    }

    public final boolean c() {
        return this.b;
    }
}
