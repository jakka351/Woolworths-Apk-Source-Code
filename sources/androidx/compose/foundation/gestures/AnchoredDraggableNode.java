package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DragGestureNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {
    public FlingBehavior B;
    public Density C;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E2(androidx.compose.foundation.gestures.AnchoredDraggableNode r3, float r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r4 = r5 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            if (r4 == 0) goto L13
            r4 = r5
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r4 = (androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1) r4
            int r0 = r4.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.r = r0
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r3 = r4.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r4.r
            r5 = 0
            if (r4 == 0) goto L37
            r0 = 1
            if (r4 == r0) goto L33
            r0 = 2
            if (r4 != r0) goto L2b
            kotlin.ResultKt.b(r3)
            throw r5
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            kotlin.ResultKt.b(r3)
            return r3
        L37:
            kotlin.ResultKt.b(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.E2(androidx.compose.foundation.gestures.AnchoredDraggableNode, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void A2(long j) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void B2(long j) {
        if (this.q) {
            BuildersKt.c(g2(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, j, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean C2() {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public final boolean F2() {
        if (DelegatableNodeKt.g(this).E != LayoutDirection.e) {
            return false;
        }
        Orientation orientation = Orientation.d;
        return false;
    }

    public final void G2() {
        TweenSpec tweenSpec = AnchoredDraggableDefaults.f864a;
        final Function1 function1 = AnchoredDraggableDefaults.b;
        final Density density = DelegatableNodeKt.g(this).D;
        this.C = density;
        DecayAnimationSpec decayAnimationSpec = AnchoredDraggableKt.c;
        final Function0<Float> function0 = new Function0<Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$anchoredDraggableFlingBehavior$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(density.T1(125));
            }
        };
        SnapLayoutInfoProvider snapLayoutInfoProvider = new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float a(float f) {
                throw null;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public final float b(float f, float f2) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        };
        float f = SnapFlingBehaviorKt.f915a;
        this.B = new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, tweenSpec);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void P() {
        D0();
        if (this.q) {
            Density density = DelegatableNodeKt.g(this).D;
            Density density2 = this.C;
            if (density2 == null || !density2.equals(density)) {
                this.C = density;
                G2();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        G2();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object z2(Function2 function2, Continuation continuation) {
        new AnchoredDraggableNode$drag$2(function2, this, null);
        MutatePriority mutatePriority = MutatePriority.d;
        throw null;
    }
}
