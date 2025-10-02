package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.RectExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Z2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f17364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(Map map) {
        super(1);
        this.f17364a = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Point location = (Point) obj;
        Intrinsics.h(location, "location");
        Collection collectionValues = this.f17364a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : collectionValues) {
            if (QuadrilateralUtilsKt.contains(((U2) obj3).c().a(), location)) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fDistanceSquared = PointExtensionsKt.distanceSquared(RectExtensionsKt.center(((U2) next).b()), location);
                do {
                    Object next2 = it.next();
                    float fDistanceSquared2 = PointExtensionsKt.distanceSquared(RectExtensionsKt.center(((U2) next2).b()), location);
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
        return (U2) obj2;
    }
}
