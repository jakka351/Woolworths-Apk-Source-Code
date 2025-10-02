package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AppBarKt$TopAppBarLayout$2$1 implements MeasurePolicy {

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ Placeable h;
        public final /* synthetic */ int i;
        public final /* synthetic */ Placeable j;
        public final /* synthetic */ Arrangement.Horizontal k;
        public final /* synthetic */ long l;
        public final /* synthetic */ Placeable m;
        public final /* synthetic */ MeasureScope n;
        public final /* synthetic */ Arrangement.Vertical o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable, int i, Placeable placeable2, Arrangement.Horizontal horizontal, long j, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i2, int i3) {
            super(1);
            this.h = placeable;
            this.i = i;
            this.j = placeable2;
            this.k = horizontal;
            this.l = j;
            this.m = placeable3;
            this.n = measureScope;
            this.o = vertical;
            this.p = i2;
            this.q = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int iH;
            int iH2;
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            Placeable placeable = this.h;
            int i = placeable.e;
            int i2 = this.i;
            int iMax = 0;
            Placeable.PlacementScope.h(placementScope, placeable, 0, (i2 - i) / 2);
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Arrangement.Horizontal horizontal = this.k;
            boolean zC = Intrinsics.c(horizontal, arrangement$Center$1);
            Placeable placeable2 = this.m;
            Placeable placeable3 = this.j;
            long j = this.l;
            if (zC) {
                int iH3 = Constraints.h(j);
                int i3 = placeable3.d;
                iH = (iH3 - i3) / 2;
                int i4 = placeable.d;
                if (iH < i4) {
                    iH2 = i4 - iH;
                } else if (i3 + iH > Constraints.h(j) - placeable2.d) {
                    iH2 = (Constraints.h(j) - placeable2.d) - (placeable3.d + iH);
                }
                iH += iH2;
            } else {
                iH = Intrinsics.c(horizontal, Arrangement.b) ? (Constraints.h(j) - placeable3.d) - placeable2.d : Math.max(this.n.r1(AppBarKt.c), placeable.d);
            }
            Arrangement.Vertical vertical = this.o;
            if (Intrinsics.c(vertical, arrangement$Center$1)) {
                iMax = (i2 - placeable3.e) / 2;
            } else if (Intrinsics.c(vertical, Arrangement.d)) {
                int i5 = this.p;
                if (i5 == 0) {
                    iMax = i2 - placeable3.e;
                } else {
                    int i6 = placeable3.e;
                    int iG = i5 - (i6 - this.q);
                    int i7 = i6 + iG;
                    if (i7 > Constraints.g(j)) {
                        iG -= i7 - Constraints.g(j);
                    }
                    iMax = (i2 - placeable3.e) - Math.max(0, iG);
                }
            }
            Placeable.PlacementScope.h(placementScope, placeable3, iH, iMax);
            Placeable.PlacementScope.h(placementScope, placeable2, Constraints.h(j) - placeable2.d, (i2 - placeable2.e) / 2);
            return Unit.f24250a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int iH;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            if (Intrinsics.c(LayoutIdKt.a(measurable), "navigationIcon")) {
                Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = (Measurable) list.get(i2);
                    if (Intrinsics.c(LayoutIdKt.a(measurable2), "actionIcons")) {
                        Placeable placeableC02 = measurable2.c0(Constraints.a(j, 0, 0, 0, 0, 14));
                        if (Constraints.h(j) == Integer.MAX_VALUE) {
                            iH = Constraints.h(j);
                        } else {
                            int iH2 = (Constraints.h(j) - placeableC0.d) - placeableC02.d;
                            iH = iH2 < 0 ? 0 : iH2;
                        }
                        int i3 = iH;
                        int size3 = list.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = (Measurable) list.get(i4);
                            if (Intrinsics.c(LayoutIdKt.a(measurable3), "title")) {
                                Placeable placeableC03 = measurable3.c0(Constraints.a(j, 0, i3, 0, 0, 12));
                                HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.b;
                                if (placeableC03.d0(horizontalAlignmentLine) != Integer.MIN_VALUE) {
                                    placeableC03.d0(horizontalAlignmentLine);
                                }
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
