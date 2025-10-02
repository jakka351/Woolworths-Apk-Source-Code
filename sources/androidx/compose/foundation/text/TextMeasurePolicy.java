package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TextMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f1139a;
    public final Function0 b;

    public TextMeasurePolicy(Function0 function0, Function0 function02) {
        this.f1139a = function0;
        this.b = function02;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        Pair pair;
        ArrayList arrayList3 = new ArrayList(list.size());
        List list3 = list;
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((Measurable) obj).getA() instanceof TextRangeLayoutModifier)) {
                arrayList3.add(obj);
            }
        }
        List list4 = (List) this.b.invoke();
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList(list4.size());
            int size2 = list4.size();
            int i2 = 0;
            while (i2 < size2) {
                Rect rect = (Rect) list4.get(i2);
                if (rect != null) {
                    float f = rect.b;
                    float f2 = rect.f1752a;
                    Measurable measurable = (Measurable) arrayList3.get(i2);
                    int iFloor = (int) Math.floor(rect.c - f2);
                    float f3 = rect.d - f;
                    arrayList2 = arrayList3;
                    list2 = list3;
                    pair = new Pair(measurable.c0(ConstraintsKt.b(iFloor, (int) Math.floor(f3), 5)), new IntOffset((Math.round(f) & 4294967295L) | (Math.round(f2) << 32)));
                } else {
                    arrayList2 = arrayList3;
                    list2 = list3;
                    pair = null;
                }
                if (pair != null) {
                    arrayList4.add(pair);
                }
                i2++;
                arrayList3 = arrayList2;
                list3 = list2;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List list5 = list3;
        ArrayList arrayList5 = new ArrayList(list.size());
        int size3 = list5.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((Measurable) obj2).getA() instanceof TextRangeLayoutModifier) {
                arrayList5.add(obj2);
            }
        }
        final ArrayList arrayListF = BasicTextKt.f(arrayList5, this.f1139a);
        return measureScope.L0(Constraints.h(j), Constraints.g(j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj3;
                List list6 = arrayList;
                if (list6 != null) {
                    int size4 = list6.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        Pair pair2 = (Pair) list6.get(i4);
                        Placeable.PlacementScope.g(placementScope, (Placeable) pair2.d, ((IntOffset) pair2.e).f2200a);
                    }
                }
                List list7 = arrayListF;
                if (list7 != null) {
                    int size5 = list7.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        Pair pair3 = (Pair) list7.get(i5);
                        Placeable placeable = (Placeable) pair3.d;
                        Function0 function0 = (Function0) pair3.e;
                        Placeable.PlacementScope.g(placementScope, placeable, function0 != null ? ((IntOffset) function0.invoke()).f2200a : 0L);
                    }
                }
                return Unit.f24250a;
            }
        });
    }
}
