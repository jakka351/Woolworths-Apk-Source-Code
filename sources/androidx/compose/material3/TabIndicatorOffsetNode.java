package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public State r;
    public Animatable s;
    public Animatable t;
    public Dp u;
    public Dp v;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        if (((List) this.r.getD()).isEmpty()) {
            return measureScope.L0(0, 0, EmptyMap.d, TabIndicatorOffsetNode$measure$1.h);
        }
        float f = ((TabPosition) ((List) this.r.getD()).get(0)).b;
        Dp dp = this.v;
        if (dp != null) {
            Animatable animatable = this.t;
            if (animatable == null) {
                animatable = new Animatable(dp, VectorConvertersKt.c, (Object) null, 12);
                this.t = animatable;
            }
            if (!Dp.a(f, ((Dp) ((SnapshotMutableStateImpl) animatable.e).getD()).d)) {
                BuildersKt.c(g2(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, f, null), 3);
            }
        } else {
            this.v = new Dp(f);
        }
        final float f2 = ((TabPosition) ((List) this.r.getD()).get(0)).f1511a;
        Dp dp2 = this.u;
        if (dp2 != null) {
            Animatable animatable2 = this.s;
            if (animatable2 == null) {
                animatable2 = new Animatable(dp2, VectorConvertersKt.c, (Object) null, 12);
                this.s = animatable2;
            }
            if (!Dp.a(f2, ((Dp) ((SnapshotMutableStateImpl) animatable2.e).getD()).d)) {
                BuildersKt.c(g2(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, f2, null), 3);
            }
        } else {
            this.u = new Dp(f2);
        }
        if (measureScope.getD() == LayoutDirection.d) {
            Animatable animatable3 = this.s;
            if (animatable3 != null) {
                f2 = ((Dp) animatable3.f()).d;
            }
        } else {
            Animatable animatable4 = this.s;
            if (animatable4 != null) {
                f2 = ((Dp) animatable4.f()).d;
            }
            f2 = -f2;
        }
        Animatable animatable5 = this.t;
        if (animatable5 != null) {
            f = ((Dp) animatable5.f()).d;
        }
        final Placeable placeableC0 = measurable.c0(Constraints.a(j, measureScope.r1(f), measureScope.r1(f), 0, 0, 12));
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Placeable.PlacementScope) obj).e(placeableC0, measureScope.r1(f2), 0, BitmapDescriptorFactory.HUE_RED);
                return Unit.f24250a;
            }
        });
    }
}
