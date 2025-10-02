package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.k7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0699k7 implements InterfaceC0826s7 {
    @Override // com.scandit.datacapture.barcode.InterfaceC0826s7
    public final M4 a(X4 viewHolder, J4 drawData) {
        Intrinsics.h(viewHolder, "viewHolder");
        Intrinsics.h(drawData, "drawData");
        Point center = QuadrilateralUtilsKt.getCenter(drawData.b());
        int y = (int) center.getY();
        int x = (int) center.getX();
        int iB = viewHolder.b();
        int height = y - ((int) (((QuadrilateralUtilsKt.getHeight(drawData.b()) / 2) + AbstractC0796q7.b()) + AbstractC0796q7.c()));
        int iA = x - (viewHolder.a() / 2);
        int iE = (viewHolder.e() - iA) - iB;
        if (iA < 0) {
            iA = 0;
        } else if (iE < 0) {
            iA += iE;
        }
        return new M4(height, iA, true, (int) ((center.getX() - iA) - (AbstractC0796q7.a() / 2)));
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0826s7
    public final int b(X4 viewHolder, J4 drawData) {
        Intrinsics.h(viewHolder, "viewHolder");
        Intrinsics.h(drawData, "drawData");
        return AbstractC0796q7.e();
    }
}
