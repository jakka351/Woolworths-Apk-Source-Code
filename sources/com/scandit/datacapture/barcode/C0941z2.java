package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0941z2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f18282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941z2(Map map) {
        super(1);
        this.f18282a = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Quadrilateral quadrilateralA;
        Point location = (Point) obj;
        Intrinsics.h(location, "location");
        Collection collectionValues = this.f18282a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : collectionValues) {
            AbstractC0945z6 abstractC0945z6E = ((C0758o2) obj3).e();
            if (abstractC0945z6E != null && (quadrilateralA = abstractC0945z6E.a()) != null && QuadrilateralUtilsKt.contains(quadrilateralA, location)) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fDistanceSquared = PointExtensionsKt.distanceSquared(QuadrilateralUtilsKt.getCenter(((C0758o2) next).b().a()), location);
                do {
                    Object next2 = it.next();
                    float fDistanceSquared2 = PointExtensionsKt.distanceSquared(QuadrilateralUtilsKt.getCenter(((C0758o2) next2).b().a()), location);
                    if (Float.compare(fDistanceSquared, fDistanceSquared2) > 0) {
                        next = next2;
                        fDistanceSquared = fDistanceSquared2;
                    }
                } while (it.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (C0758o2) obj2;
    }
}
