package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public View A;
    public Density B;
    public PlatformMagnifier C;
    public State E;
    public IntSize G;
    public BufferedChannel H;
    public Lambda r;
    public Lambda s;
    public PlatformMagnifierFactory z;
    public float t = Float.NaN;
    public boolean u = true;
    public long v = 9205357640488583168L;
    public float w = Float.NaN;
    public float x = Float.NaN;
    public boolean y = true;
    public final MutableState D = SnapshotStateKt.e(null, SnapshotStateKt.g());
    public long F = 9205357640488583168L;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierNode(Function1 function1, Function1 function12, PlatformMagnifierFactory platformMagnifierFactory) {
        this.r = (Lambda) function1;
        this.s = (Lambda) function12;
        this.z = platformMagnifierFactory;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.Q0();
        BufferedChannel bufferedChannel = this.H;
        if (bufferedChannel != null) {
            bufferedChannel.k(Unit.f24250a);
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        ((SnapshotMutableStateImpl) this.D).setValue(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.b(Magnifier_androidKt.f839a, new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new Offset(this.h.F);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        o1();
        this.H = ChannelKt.a(0, 7, null);
        BuildersKt.c(g2(), null, CoroutineStart.g, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        PlatformMagnifier platformMagnifier = this.C;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.C = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        ObserverModifierNodeKt.a(this, new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.u2();
                return Unit.f24250a;
            }
        });
    }

    public final long s2() {
        if (this.E == null) {
            this.E = SnapshotStateKt.d(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SnapshotMutableStateImpl) this.h.D).getD();
                    return new Offset(layoutCoordinates != null ? layoutCoordinates.G(0L) : 9205357640488583168L);
                }
            });
        }
        State state = this.E;
        if (state != null) {
            return ((Offset) state.getD()).f1751a;
        }
        return 9205357640488583168L;
    }

    public final void t2() {
        PlatformMagnifier platformMagnifier = this.C;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View viewA = this.A;
        if (viewA == null) {
            viewA = DelegatableNode_androidKt.a(this);
        }
        View view = viewA;
        this.A = view;
        Density density = this.B;
        if (density == null) {
            density = DelegatableNodeKt.g(this).D;
        }
        Density density2 = density;
        this.B = density2;
        this.C = this.z.a(view, this.u, this.v, this.w, this.x, this.y, density2, this.t);
        v2();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void u2() {
        Density density = this.B;
        if (density == null) {
            density = DelegatableNodeKt.g(this).D;
            this.B = density;
        }
        long j = ((Offset) this.r.invoke(density)).f1751a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & s2()) == 9205357640488583168L) {
            this.F = 9205357640488583168L;
            PlatformMagnifier platformMagnifier = this.C;
            if (platformMagnifier != null) {
                platformMagnifier.dismiss();
                return;
            }
            return;
        }
        this.F = Offset.h(s2(), j);
        if (this.C == null) {
            t2();
        }
        PlatformMagnifier platformMagnifier2 = this.C;
        if (platformMagnifier2 != null) {
            platformMagnifier2.c(this.F, this.t, 9205357640488583168L);
        }
        v2();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void v2() {
        Density density;
        PlatformMagnifier platformMagnifier = this.C;
        if (platformMagnifier == null || (density = this.B) == null || IntSize.a(platformMagnifier.a(), this.G)) {
            return;
        }
        ?? r2 = this.s;
        if (r2 != 0) {
            r2.invoke(new DpSize(density.p(IntSizeKt.d(platformMagnifier.a()))));
        }
        this.G = new IntSize(platformMagnifier.a());
    }
}
