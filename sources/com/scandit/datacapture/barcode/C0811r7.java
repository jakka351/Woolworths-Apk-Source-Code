package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettings;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0811r7 implements InterfaceC0826s7 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickStatusIconSettings f17991a;

    public C0811r7(BarcodePickStatusIconSettings statusIconSettings) {
        Intrinsics.h(statusIconSettings, "statusIconSettings");
        this.f17991a = statusIconSettings;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0826s7
    public final M4 a(X4 viewHolder, J4 drawData) {
        Intrinsics.h(viewHolder, "viewHolder");
        Intrinsics.h(drawData, "drawData");
        Iterator it = CollectionsKt.R(drawData.b().getTopLeft(), drawData.b().getTopRight(), drawData.b().getBottomRight(), drawData.b().getBottomLeft()).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Point point = (Point) next;
            float x = point.getX() - point.getY();
            do {
                Object next2 = it.next();
                Point point2 = (Point) next2;
                float x2 = point2.getX() - point2.getY();
                if (Float.compare(x, x2) < 0) {
                    next = next2;
                    x = x2;
                }
            } while (it.hasNext());
        }
        Point point3 = (Point) next;
        int iA = viewHolder.a() / 2;
        int x3 = ((int) point3.getX()) - iA;
        int y = ((int) point3.getY()) - iA;
        int iE = (viewHolder.e() - x3) - viewHolder.b();
        if (iE < 0 && (x3 = x3 + iE) < 0) {
            x3 = 0;
        }
        return new M4(y, x3, false, 0);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0826s7
    public final int b(X4 viewHolder, J4 drawData) {
        Intrinsics.h(viewHolder, "viewHolder");
        Intrinsics.h(drawData, "drawData");
        float height = QuadrilateralUtilsKt.getHeight(drawData.b());
        float width = QuadrilateralUtilsKt.getWidth(drawData.b());
        int iMax = Math.max(0, this.f17991a.getMinSize());
        int iMax2 = Math.max(iMax, this.f17991a.getMaxSize());
        return RangesKt.c((int) (this.f17991a.getRatioToHighlightSize() * Math.min(height, width)), PixelExtensionsKt.pxFromDp$default(iMax, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(iMax2, (Context) null, 1, (Object) null));
    }
}
