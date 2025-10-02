package ovh.plrapps.mapcompose.ui.paths;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ovh.plrapps.mapcompose.utils.Point;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RamerDouglaPeuckerKt {
    public static final void a(List pointList, double d, ArrayList arrayList) {
        Intrinsics.h(pointList, "pointList");
        if (pointList.size() < 2) {
            throw new IllegalArgumentException("Not enough points to simplify");
        }
        boolean z = true;
        int size = pointList.size() - 1;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        double d2 = 0.0d;
        while (i2 < size) {
            Point point = (Point) pointList.get(i2);
            Point point2 = (Point) pointList.get(i);
            boolean z2 = z;
            Point point3 = (Point) pointList.get(size);
            double d3 = point3.f26966a - point2.f26966a;
            double d4 = point3.b;
            int i4 = i2;
            double d5 = point2.b;
            double d6 = d4 - d5;
            double dHypot = Math.hypot(d3, d6);
            if (dHypot > 0.0d) {
                d3 /= dHypot;
                d6 /= dHypot;
            }
            int i5 = size;
            double d7 = d6;
            double d8 = point.f26966a - point2.f26966a;
            double d9 = point.b - d5;
            double d10 = (d7 * d9) + (d3 * d8);
            double dHypot2 = Math.hypot(d8 - (d3 * d10), d9 - (d10 * d7));
            if (dHypot2 > d2) {
                d2 = dHypot2;
                i3 = i4;
            }
            i2 = i4 + 1;
            z = z2;
            size = i5;
            i = 0;
        }
        if (d2 <= d) {
            arrayList.clear();
            arrayList.add(CollectionsKt.D(pointList));
            arrayList.add(CollectionsKt.O(pointList));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List list = pointList;
        List listW0 = CollectionsKt.w0(list, i3 + 1);
        List listX = CollectionsKt.x(list, i3);
        a(listW0, d, arrayList2);
        a(listX, d, arrayList3);
        arrayList.addAll(CollectionsKt.w0(arrayList2, arrayList2.size() - 1));
        arrayList.addAll(arrayList3);
        if (arrayList.size() < 2) {
            throw new RuntimeException("Problem assembling output");
        }
    }
}
