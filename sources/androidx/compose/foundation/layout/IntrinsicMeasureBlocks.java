package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntrinsicMeasureBlocks {
    public static int a(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(intrinsicMeasurable.b0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.J(iMin2));
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
            }
        }
        int iRound = f == BitmapDescriptorFactory.HUE_RED ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
            float fB2 = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable2));
            if (fB2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, intrinsicMeasurable2.J(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int b(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            int iB0 = intrinsicMeasurable.b0(i);
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                i3 += iB0;
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
                iMax = Math.max(iMax, Math.round(iB0 / fB));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int c(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(intrinsicMeasurable.b0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.T(iMin2));
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
            }
        }
        int iRound = f == BitmapDescriptorFactory.HUE_RED ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
            float fB2 = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable2));
            if (fB2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, intrinsicMeasurable2.T(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int d(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            int iA0 = intrinsicMeasurable.a0(i);
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                i3 += iA0;
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
                iMax = Math.max(iMax, Math.round(iA0 / fB));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int e(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            int iJ = intrinsicMeasurable.J(i);
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                i3 += iJ;
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
                iMax = Math.max(iMax, Math.round(iJ / fB));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int f(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(intrinsicMeasurable.J(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.b0(iMin2));
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
            }
        }
        int iRound = f == BitmapDescriptorFactory.HUE_RED ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
            float fB2 = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable2));
            if (fB2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, intrinsicMeasurable2.b0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int g(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            int iT = intrinsicMeasurable.T(i);
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                i3 += iT;
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
                iMax = Math.max(iMax, Math.round(iT / fB));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int h(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            float fB = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable));
            if (fB == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(intrinsicMeasurable.J(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.a0(iMin2));
            } else if (fB > BitmapDescriptorFactory.HUE_RED) {
                f += fB;
            }
        }
        int iRound = f == BitmapDescriptorFactory.HUE_RED ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
            float fB2 = RowColumnImplKt.b(RowColumnImplKt.a(intrinsicMeasurable2));
            if (fB2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, intrinsicMeasurable2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
