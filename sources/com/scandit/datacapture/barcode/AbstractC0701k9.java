package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.k9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0701k9 {
    public static final L4 a(Size2 minSize, Function1 quadrilateralMapper) {
        Intrinsics.h(K4.f17214a, "<this>");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(minSize, "minSize");
        return new C0685j9(minSize, quadrilateralMapper);
    }
}
