package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
    public boolean t;
    public Function0 u;
    public PullToRefreshState w;
    public float x;
    public boolean v = true;
    public final NestedScrollNode y = new NestedScrollNode(this, null);
    public final MutableFloatState z = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableFloatState A = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);

    public PullToRefreshModifierNode(boolean z, Function0 function0, PullToRefreshState pullToRefreshState, float f) {
        this.t = z;
        this.u = function0;
        this.w = pullToRefreshState;
        this.x = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            float r5 = androidx.compose.ui.unit.Velocity.e(r5)
            r0.r = r3
            java.lang.Object r7 = r4.z2(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = androidx.compose.ui.unit.VelocityKt.a(r6, r5)
            androidx.compose.ui.unit.Velocity r7 = new androidx.compose.ui.unit.Velocity
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        if (!this.w.d() && this.v && i == 1 && Offset.f(j) < BitmapDescriptorFactory.HUE_RED) {
            return x2(j);
        }
        return 0L;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        s2(this.y);
        BuildersKt.c(g2(), null, null, new PullToRefreshModifierNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (this.w.d() || !this.v || i != 1) {
            return 0L;
        }
        long jX2 = x2(j2);
        BuildersKt.c(g2(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3);
        return jX2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v2(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.p
            kotlin.ResultKt.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.w
            r0.p = r4
            r0.s = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            androidx.compose.runtime.MutableFloatState r5 = r0.A
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r5 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r5
            r1 = 0
            r5.p(r1)
            androidx.compose.runtime.MutableFloatState r5 = r0.z
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r5 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r5
            r5.p(r1)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.v2(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w2(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.p
            kotlin.ResultKt.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.w
            r0.p = r4
            r0.s = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            int r5 = r0.y2()
            float r5 = (float) r5
            androidx.compose.runtime.MutableFloatState r1 = r0.A
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r1 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r1
            r1.p(r5)
            int r5 = r0.y2()
            float r5 = (float) r5
            androidx.compose.runtime.MutableFloatState r0 = r0.z
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r0 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r0
            r0.p(r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.w2(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final long x2(long j) {
        float fA;
        float fY2;
        if (this.t) {
            fA = 0.0f;
        } else {
            MutableFloatState mutableFloatState = this.A;
            SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
            float f = Offset.f(j) + snapshotMutableFloatStateImpl.a();
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            fA = f - snapshotMutableFloatStateImpl.a();
            ((SnapshotMutableFloatStateImpl) mutableFloatState).p(f);
            if (((SnapshotMutableFloatStateImpl) mutableFloatState).a() * 0.5f <= y2()) {
                fY2 = ((SnapshotMutableFloatStateImpl) mutableFloatState).a() * 0.5f;
            } else {
                float fB = RangesKt.b(Math.abs((((SnapshotMutableFloatStateImpl) mutableFloatState).a() * 0.5f) / y2()) - 1.0f, BitmapDescriptorFactory.HUE_RED, 2.0f);
                fY2 = y2() + (y2() * (fB - (((float) Math.pow(fB, 2)) / 4)));
            }
            ((SnapshotMutableFloatStateImpl) this.z).p(fY2);
        }
        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, fA);
    }

    public final int y2() {
        return ((Density) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.h)).r1(this.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z2(float r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            float r7 = r0.q
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.p
            kotlin.ResultKt.b(r8)
            goto L82
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            float r7 = r0.q
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r0 = r0.p
            kotlin.ResultKt.b(r8)
            goto L6e
        L3f:
            kotlin.ResultKt.b(r8)
            boolean r8 = r6.t
            if (r8 == 0) goto L4c
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r5)
            return r7
        L4c:
            androidx.compose.runtime.MutableFloatState r8 = r6.A
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r8 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r8
            float r8 = r8.a()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r2
            int r2 = r6.y2()
            float r2 = (float) r2
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L74
            r0.p = r6
            r0.q = r7
            r0.t = r4
            java.lang.Object r8 = r6.w2(r0)
            if (r8 != r1) goto L6d
            goto L80
        L6d:
            r0 = r6
        L6e:
            kotlin.jvm.functions.Function0 r8 = r0.u
            r8.invoke()
            goto L82
        L74:
            r0.p = r6
            r0.q = r7
            r0.t = r3
            java.lang.Object r8 = r6.v2(r0)
            if (r8 != r1) goto L81
        L80:
            return r1
        L81:
            r0 = r6
        L82:
            androidx.compose.runtime.MutableFloatState r8 = r0.A
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r8 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r8
            float r8 = r8.a()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L90
        L8e:
            r7 = r5
            goto L95
        L90:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L95
            goto L8e
        L95:
            androidx.compose.runtime.MutableFloatState r8 = r0.A
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r8 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r8
            r8.p(r5)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.z2(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
