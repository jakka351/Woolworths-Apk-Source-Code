package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AlignmentLineKt {
    public static final MeasureResult a(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f2, Measurable measurable, long j) {
        long j2;
        long jA;
        boolean z = alignmentLine instanceof HorizontalAlignmentLine;
        if (z) {
            j2 = j;
            jA = Constraints.a(j2, 0, 0, 0, 0, 11);
        } else {
            j2 = j;
            jA = Constraints.a(j2, 0, 0, 0, 0, 14);
        }
        final Placeable placeableC0 = measurable.c0(jA);
        int iD0 = placeableC0.d0(alignmentLine);
        if (iD0 == Integer.MIN_VALUE) {
            iD0 = 0;
        }
        int i = z ? placeableC0.e : placeableC0.d;
        int iG = (z ? Constraints.g(j2) : Constraints.h(j2)) - i;
        final int iC = RangesKt.c((!Float.isNaN(f) ? measureScope.r1(f) : 0) - iD0, 0, iG);
        final int iC2 = RangesKt.c(((!Float.isNaN(f2) ? measureScope.r1(f2) : 0) - i) + iD0, 0, iG - iC);
        final int iMax = z ? placeableC0.d : Math.max(placeableC0.d + iC + iC2, Constraints.j(j2));
        final int iMax2 = z ? Math.max(placeableC0.e + iC + iC2, Constraints.i(j2)) : placeableC0.e;
        return measureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                boolean z2 = alignmentLine instanceof HorizontalAlignmentLine;
                Placeable placeable = placeableC0;
                int i2 = iC2;
                int i3 = iC;
                float f3 = f;
                int i4 = z2 ? 0 : !Dp.a(f3, Float.NaN) ? i3 : (iMax - i2) - placeable.d;
                if (!z2) {
                    i3 = 0;
                } else if (Dp.a(f3, Float.NaN)) {
                    i3 = (iMax2 - i2) - placeable.e;
                }
                Placeable.PlacementScope.h(placementScope, placeable, i4, i3);
                return Unit.f24250a;
            }
        });
    }

    public static Modifier b(AlignmentLine alignmentLine, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        return new AlignmentLineOffsetDpElement(alignmentLine, f, f2, InspectableValueKt.a());
    }

    public static final Modifier c(float f, float f2) {
        boolean zIsNaN = Float.isNaN(f);
        Modifier modifierB = Modifier.Companion.d;
        Modifier modifierB2 = !zIsNaN ? b(androidx.compose.ui.layout.AlignmentLineKt.f1871a, f, BitmapDescriptorFactory.HUE_RED, 4) : modifierB;
        if (!Float.isNaN(f2)) {
            modifierB = b(androidx.compose.ui.layout.AlignmentLineKt.b, BitmapDescriptorFactory.HUE_RED, f2, 2);
        }
        return modifierB2.x0(modifierB);
    }
}
