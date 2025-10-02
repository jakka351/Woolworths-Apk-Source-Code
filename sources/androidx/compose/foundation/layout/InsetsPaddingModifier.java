package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    public final WindowInsets d;
    public final MutableState e;
    public final MutableState f;

    public InsetsPaddingModifier(WindowInsets windowInsets) {
        this.d = windowInsets;
        this.e = SnapshotStateKt.f(windowInsets);
        this.f = SnapshotStateKt.f(windowInsets);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void F1(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.u(WindowInsetsPaddingKt.f986a);
        WindowInsets windowInsets2 = this.d;
        ((SnapshotMutableStateImpl) this.e).setValue(new ExcludeInsets(windowInsets2, windowInsets));
        ((SnapshotMutableStateImpl) this.f).setValue(new UnionInsets(windowInsets, windowInsets2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return Intrinsics.c(((InsetsPaddingModifier) obj).d, this.d);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.f986a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return (WindowInsets) ((SnapshotMutableStateImpl) this.f).getD();
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        MutableState mutableState = this.e;
        final int iD = ((WindowInsets) ((SnapshotMutableStateImpl) mutableState).getD()).d(measureScope, measureScope.getD());
        final int iA = ((WindowInsets) ((SnapshotMutableStateImpl) mutableState).getD()).a(measureScope);
        int iB = ((WindowInsets) ((SnapshotMutableStateImpl) mutableState).getD()).b(measureScope, measureScope.getD()) + iD;
        int iC = ((WindowInsets) ((SnapshotMutableStateImpl) mutableState).getD()).c(measureScope) + iA;
        final Placeable placeableC0 = measurable.c0(ConstraintsKt.i(-iB, -iC, j));
        return measureScope.L0(ConstraintsKt.g(placeableC0.d + iB, j), ConstraintsKt.f(placeableC0.e + iC, j), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Placeable.PlacementScope) obj).e(placeableC0, iD, iA, BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }
}
