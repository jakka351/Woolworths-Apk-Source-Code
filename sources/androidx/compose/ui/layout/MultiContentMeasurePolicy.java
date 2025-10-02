package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public interface MultiContentMeasurePolicy {
    MeasureResult c(MeasureScope measureScope, List list, long j);

    default int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.d, IntrinsicWidthHeight.e));
            }
            arrayList2.add(arrayList3);
        }
        return c(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getD()), arrayList2, ConstraintsKt.b(i, 0, 13)).getB();
    }

    default int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.d, IntrinsicWidthHeight.d));
            }
            arrayList2.add(arrayList3);
        }
        return c(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getD()), arrayList2, ConstraintsKt.b(0, i, 7)).getF1881a();
    }

    default int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.e, IntrinsicWidthHeight.e));
            }
            arrayList2.add(arrayList3);
        }
        return c(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getD()), arrayList2, ConstraintsKt.b(i, 0, 13)).getB();
    }

    default int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i3), IntrinsicMinMax.e, IntrinsicWidthHeight.d));
            }
            arrayList2.add(arrayList3);
        }
        return c(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getD()), arrayList2, ConstraintsKt.b(0, i, 7)).getF1881a();
    }
}
