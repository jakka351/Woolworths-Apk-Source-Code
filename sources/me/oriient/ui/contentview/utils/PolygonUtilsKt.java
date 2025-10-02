package me.oriient.ui.contentview.utils;

import android.graphics.PointF;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006\u001a)\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\r\u001a1\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Landroid/graphics/PointF;", "vertices", "", "inset", "insetPolygon", "(Ljava/util/List;F)Ljava/util/List;", "", "a", "(Ljava/util/List;)Z", "distance", "start", "end", "(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "p1", "p2", "p3", "p4", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "ui-content-view_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PolygonUtilsKt {
    private static final boolean a(List list) {
        IntProgressionIterator it = CollectionsKt.H(list).iterator();
        float f = 0.0f;
        while (it.f) {
            int iNextInt = it.nextInt();
            PointF pointF = (PointF) list.get(iNextInt);
            PointF pointF2 = (PointF) list.get((iNextInt + 1) % list.size());
            f += (pointF2.y + pointF.y) * (pointF2.x - pointF.x);
        }
        return f > BitmapDescriptorFactory.HUE_RED;
    }

    @Keep
    @Nullable
    public static final List<PointF> insetPolygon(@NotNull List<? extends PointF> vertices, float f) {
        Intrinsics.h(vertices, "vertices");
        List listG0 = CollectionsKt.G0(vertices);
        if (vertices.size() <= 2) {
            return null;
        }
        if (a(listG0)) {
            listG0 = CollectionsKt.l(listG0);
        }
        List<PointF> listA = a(listG0, f);
        if (listA == null || listA.size() <= 2) {
            return null;
        }
        return listA;
    }

    private static final List a(List list, float f) {
        PointF pointFA;
        IntProgressionIterator it = CollectionsKt.H(list).iterator();
        while (it.f) {
            int iNextInt = it.nextInt();
            PointF pointF = (PointF) list.get(iNextInt);
            PointF pointF2 = (PointF) list.get((iNextInt + 1) % list.size());
            if (((float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y)) < 3 * f) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        IntProgressionIterator it2 = RangesKt.o(0, size).iterator();
        while (it2.f) {
            int iNextInt2 = it2.nextInt();
            PointF pointF3 = (PointF) list.get(((iNextInt2 - 1) + size) % size);
            PointF pointF4 = (PointF) list.get(iNextInt2);
            PointF pointF5 = (PointF) list.get((iNextInt2 + 1) % size);
            PointF pointFA2 = a(pointF3, pointF4, f);
            PointF pointFA3 = a(pointF4, pointF5, f);
            if (pointFA2 == null || pointFA3 == null || (pointFA = a(pointF3, new PointF(pointF4.x + pointFA2.x, pointF4.y + pointFA2.y), pointF5, new PointF(pointF4.x + pointFA3.x, pointF4.y + pointFA3.y))) == null) {
                return null;
            }
            arrayList.add(pointFA);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (zIsEmpty) {
            return null;
        }
        if (zIsEmpty) {
            throw new NoWhenBranchMatchedException();
        }
        return arrayList;
    }

    private static final PointF a(PointF pointF, PointF pointF2, float f) {
        float f2 = pointF2.x - pointF.x;
        float f3 = pointF2.y - pointF.y;
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        if (fSqrt <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return new PointF(((-f3) / fSqrt) * f, (f2 / fSqrt) * f);
    }

    private static final PointF a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f = pointF.x;
        float f2 = pointF2.x;
        float f3 = f - f2;
        float f4 = pointF3.y;
        float f5 = pointF4.y;
        float f6 = f4 - f5;
        float f7 = pointF.y;
        float f8 = pointF2.y;
        float f9 = f7 - f8;
        float f10 = pointF3.x;
        float f11 = pointF4.x;
        float f12 = f10 - f11;
        float f13 = (f3 * f6) - (f9 * f12);
        if (f13 == BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        float f14 = (f * f8) - (f7 * f2);
        float f15 = (f10 * f5) - (f4 * f11);
        return new PointF(((f12 * f14) - (f3 * f15)) / f13, ((f14 * f6) - (f9 * f15)) / f13);
    }
}
