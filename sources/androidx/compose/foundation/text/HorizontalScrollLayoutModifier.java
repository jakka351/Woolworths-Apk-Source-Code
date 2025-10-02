package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/HorizontalScrollLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class HorizontalScrollLayoutModifier implements LayoutModifier {
    public final TextFieldScrollerPosition d;
    public final int e;
    public final TransformedText f;
    public final Function0 g;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, Function0 function0) {
        this.d = textFieldScrollerPosition;
        this.e = i;
        this.f = transformedText;
        this.g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return Intrinsics.c(this.d, horizontalScrollLayoutModifier.d) && this.e == horizontalScrollLayoutModifier.e && Intrinsics.c(this.f, horizontalScrollLayoutModifier.f) && Intrinsics.c(this.g, horizontalScrollLayoutModifier.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + b.a(this.e, this.d.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        if (measurable.b0(Constraints.g(j)) < Constraints.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = Constraints.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        final Placeable placeableC0 = measurable.c0(j);
        final int iMin = Math.min(placeableC0.d, Constraints.h(j2));
        return measureScope.L0(iMin, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.HorizontalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = this;
                int i = horizontalScrollLayoutModifier.e;
                TextFieldScrollerPosition textFieldScrollerPosition = horizontalScrollLayoutModifier.d;
                TransformedText transformedText = horizontalScrollLayoutModifier.f;
                TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) horizontalScrollLayoutModifier.g.invoke();
                TextLayoutResult textLayoutResult = textLayoutResultProxy != null ? textLayoutResultProxy.f1135a : null;
                MeasureScope measureScope2 = measureScope;
                boolean z = measureScope2.getD() == LayoutDirection.e;
                Placeable placeable = placeableC0;
                textFieldScrollerPosition.a(Orientation.e, TextFieldScrollKt.a(measureScope2, i, transformedText, textLayoutResult, z, placeable.d), iMin, placeable.d);
                Placeable.PlacementScope.h(placementScope, placeable, Math.round(-((SnapshotMutableFloatStateImpl) textFieldScrollerPosition.f1133a).a()), 0);
                return Unit.f24250a;
            }
        });
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.d + ", cursorOffset=" + this.e + ", transformedText=" + this.f + ", textLayoutResultProvider=" + this.g + ')';
    }
}
