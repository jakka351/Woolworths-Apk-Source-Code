package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SliderKt$RangeSliderImpl$2$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f1499a;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ Placeable h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ Placeable k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ Placeable n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, int i3, int i4, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3) {
            super(1);
            this.h = placeable;
            this.i = i;
            this.j = i2;
            this.k = placeable2;
            this.l = i3;
            this.m = i4;
            this.n = placeable3;
            this.o = i5;
            this.p = i6;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            Placeable.PlacementScope.h(placementScope, this.h, this.i, this.j);
            Placeable.PlacementScope.h(placementScope, this.k, this.l, this.m);
            Placeable.PlacementScope.h(placementScope, this.n, this.o, this.p);
            return Unit.f24250a;
        }
    }

    public SliderKt$RangeSliderImpl$2$1(RangeSliderState rangeSliderState) {
        this.f1499a = rangeSliderState;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            if (LayoutIdKt.a(measurable) == RangeSliderComponents.e) {
                Placeable placeableC0 = measurable.c0(j);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = (Measurable) list.get(i2);
                    if (LayoutIdKt.a(measurable2) == RangeSliderComponents.d) {
                        Placeable placeableC02 = measurable2.c0(j);
                        int size3 = list.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            Measurable measurable3 = (Measurable) list.get(i3);
                            if (LayoutIdKt.a(measurable3) == RangeSliderComponents.f) {
                                Placeable placeableC03 = measurable3.c0(Constraints.a(ConstraintsKt.j((-(placeableC0.d + placeableC02.d)) / 2, 0, 2, j), 0, 0, 0, 0, 11));
                                int i4 = placeableC03.d;
                                Math.max(placeableC03.e, Math.max(placeableC0.e, placeableC02.e));
                                throw null;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
