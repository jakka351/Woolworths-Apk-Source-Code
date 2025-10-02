package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    public InteractionSource r;
    public boolean s;
    public boolean t;
    public Animatable u;
    public Animatable v;
    public float w;
    public float x;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        BuildersKt.c(g2(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        float fT1 = measureScope.T1(this.t ? SwitchTokens.f1607a : ((measurable.J(Constraints.h(j)) != 0 && measurable.b0(Constraints.g(j)) != 0) || this.s) ? SwitchKt.f1508a : SwitchKt.b);
        Animatable animatable = this.v;
        int iFloatValue = (int) (animatable != null ? ((Number) animatable.f()).floatValue() : fT1);
        final Placeable placeableC0 = measurable.c0(Constraints.Companion.c(iFloatValue, iFloatValue));
        final float fT12 = measureScope.T1((SwitchKt.d - measureScope.C(fT1)) / 2.0f);
        float fT13 = measureScope.T1((SwitchKt.c - SwitchKt.f1508a) - SwitchKt.e);
        boolean z = this.t;
        if (z && this.s) {
            fT12 = fT13 - measureScope.T1(SwitchTokens.e);
        } else if (z && !this.s) {
            fT12 = measureScope.T1(SwitchTokens.e);
        } else if (this.s) {
            fT12 = fT13;
        }
        Animatable animatable2 = this.v;
        if (!Intrinsics.b(animatable2 != null ? (Float) ((SnapshotMutableStateImpl) animatable2.e).getD() : null, fT1)) {
            BuildersKt.c(g2(), null, null, new ThumbNode$measure$1(this, fT1, null), 3);
        }
        Animatable animatable3 = this.u;
        if (!Intrinsics.b(animatable3 != null ? (Float) ((SnapshotMutableStateImpl) animatable3.e).getD() : null, fT12)) {
            BuildersKt.c(g2(), null, null, new ThumbNode$measure$2(this, fT12, null), 3);
        }
        if (Float.isNaN(this.x) && Float.isNaN(this.w)) {
            this.x = fT1;
            this.w = fT12;
        }
        return measureScope.L0(iFloatValue, iFloatValue, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ThumbNode$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Animatable animatable4 = this.u;
                Placeable.PlacementScope.h(placementScope, placeableC0, (int) (animatable4 != null ? ((Number) animatable4.f()).floatValue() : fT12), 0);
                return Unit.f24250a;
            }
        });
    }
}
