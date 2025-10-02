package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.n6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0746n6 {
    public static final L4 a(Size2 minSize, Function1 quadrilateralMapper) {
        Intrinsics.h(K4.f17214a, "<this>");
        Intrinsics.h(minSize, "minSize");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        return new C0730m6(minSize, quadrilateralMapper);
    }
}
