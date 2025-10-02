package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0553c9 {

    /* renamed from: a, reason: collision with root package name */
    private final Control f17400a;
    private final Anchor b;
    private final PointWithUnit c;

    public C0553c9(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.h(control, "control");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        this.f17400a = control;
        this.b = anchor;
        this.c = offset;
    }

    public final Anchor a() {
        return this.b;
    }

    public final Control b() {
        return this.f17400a;
    }

    public final PointWithUnit c() {
        return this.c;
    }
}
