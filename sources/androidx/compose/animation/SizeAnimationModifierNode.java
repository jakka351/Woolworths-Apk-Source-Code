package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "AnimData", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    public AnimationSpec r;
    public Function2 s;
    public boolean v;
    public long t = AnimationModifierKt.f716a;
    public long u = ConstraintsKt.b(0, 0, 15);
    public final MutableState w = SnapshotStateKt.f(null);

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimData {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f733a;
        public long b;

        public AnimData(Animatable animatable, long j) {
            this.f733a = animatable;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return Intrinsics.c(this.f733a, animData.f733a) && IntSize.b(this.b, animData.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.f733a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.f733a + ", startSize=" + ((Object) IntSize.c(this.b)) + ')';
        }
    }

    public SizeAnimationModifierNode(AnimationSpec animationSpec, Function2 function2) {
        this.r = animationSpec;
        this.s = function2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        this.t = AnimationModifierKt.f716a;
        this.v = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void m2() {
        ((SnapshotMutableStateImpl) this.w).setValue(null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableC0;
        char c;
        long j2;
        AnimData animData;
        long jD;
        AnimData animData2;
        if (measureScope.l1()) {
            this.u = j;
            this.v = true;
            placeableC0 = measurable.c0(j);
        } else {
            placeableC0 = measurable.c0(this.v ? this.u : j);
        }
        final Placeable placeable = placeableC0;
        long j3 = (placeable.e & 4294967295L) | (placeable.d << 32);
        if (measureScope.l1()) {
            this.t = j3;
            c = ' ';
            jD = j3;
            j2 = jD;
        } else {
            long j4 = AnimationModifierKt.c(this.t) ? this.t : j3;
            MutableState mutableState = this.w;
            AnimData animData3 = (AnimData) ((SnapshotMutableStateImpl) mutableState).getD();
            if (animData3 != null) {
                Animatable animatable = animData3.f733a;
                c = ' ';
                j2 = j3;
                boolean z = (IntSize.b(j4, ((IntSize) animatable.f()).f2202a) || animatable.g()) ? false : true;
                if (!IntSize.b(j4, ((IntSize) ((SnapshotMutableStateImpl) animatable.e).getD()).f2202a) || z) {
                    animData3.b = ((IntSize) animatable.f()).f2202a;
                    animData2 = animData3;
                    BuildersKt.c(g2(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData2, j4, this, null), 3);
                } else {
                    animData2 = animData3;
                }
                animData = animData2;
            } else {
                c = ' ';
                j2 = j3;
                long j5 = 1;
                animData = new AnimData(new Animatable(new IntSize(j4), VectorConvertersKt.h, new IntSize((j5 << 32) | (j5 & 4294967295L)), 8), j4);
            }
            ((SnapshotMutableStateImpl) mutableState).setValue(animData);
            jD = ConstraintsKt.d(j, ((IntSize) animData.f733a.f()).f2202a);
        }
        final int i = (int) (jD >> c);
        final int i2 = (int) (jD & 4294967295L);
        final long j6 = j2;
        return measureScope.L0(i, i2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>(this) { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope.g((Placeable.PlacementScope) obj, placeable, Alignment.Companion.f1719a.a(j6, (i << 32) | (i2 & 4294967295L), measureScope.getD()));
                return Unit.f24250a;
            }
        });
    }
}
