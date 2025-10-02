package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public NestedScrollConnection r;
    public NestedScrollDispatcher s;
    public NestedScrollNode t;
    public final String u;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.r = nestedScrollConnection;
        this.s = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L1a
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r12 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            long r10 = r0.q
            kotlin.ResultKt.b(r12)
            goto L81
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            long r10 = r0.q
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = r0.p
            kotlin.ResultKt.b(r12)
            goto L60
        L3f:
            kotlin.ResultKt.b(r12)
            boolean r12 = r9.q
            if (r12 == 0) goto L4f
            if (r12 == 0) goto L4f
            androidx.compose.ui.node.TraversableNode r12 = androidx.compose.ui.node.TraversableNodeKt.a(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r12 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r12
            goto L50
        L4f:
            r12 = r3
        L50:
            if (r12 == 0) goto L6a
            r0.p = r9
            r0.q = r10
            r0.t = r5
            java.lang.Object r12 = r12.J0(r10, r0)
            if (r12 != r1) goto L5f
            goto L80
        L5f:
            r2 = r9
        L60:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r5 = r12.getF2206a()
        L66:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L6e
        L6a:
            r5 = 0
            r2 = r9
            goto L66
        L6e:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r2.r
            long r5 = androidx.compose.ui.unit.Velocity.f(r5, r10)
            r0.p = r3
            r0.q = r10
            r0.t = r4
            java.lang.Object r12 = r12.J0(r5, r0)
            if (r12 != r1) goto L81
        L80:
            return r1
        L81:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r0 = r12.getF2206a()
            long r10 = androidx.compose.ui.unit.Velocity.g(r10, r0)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r11, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.u = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r15 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r15
            r0.<init>(r10, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r6.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.u
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            long r11 = r6.q
            kotlin.ResultKt.b(r15)
            goto L91
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            long r13 = r6.r
            long r11 = r6.q
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r6.p
            kotlin.ResultKt.b(r15)
            goto L5c
        L43:
            kotlin.ResultKt.b(r15)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r10.r
            r6.p = r10
            r6.q = r11
            r6.r = r13
            r6.u = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.V(r2, r4, r6)
            if (r15 != r0) goto L59
            goto L8f
        L59:
            r1 = r10
            r11 = r2
            r13 = r4
        L5c:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r8 = r15.getF2206a()
            boolean r15 = r1.q
            r2 = 0
            if (r15 == 0) goto L75
            if (r15 == 0) goto L72
            if (r15 == 0) goto L72
            androidx.compose.ui.node.TraversableNode r15 = androidx.compose.ui.node.TraversableNodeKt.a(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r15 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r15
            goto L73
        L72:
            r15 = r2
        L73:
            r1 = r15
            goto L78
        L75:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r15 = r1.t
            goto L73
        L78:
            if (r1 == 0) goto L99
            long r11 = androidx.compose.ui.unit.Velocity.g(r11, r8)
            long r4 = androidx.compose.ui.unit.Velocity.f(r13, r8)
            r6.p = r2
            r6.q = r8
            r6.u = r7
            r2 = r11
            java.lang.Object r15 = r1.V(r2, r4, r6)
            if (r15 != r0) goto L90
        L8f:
            return r0
        L90:
            r11 = r8
        L91:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r13 = r15.getF2206a()
            r8 = r11
            goto L9b
        L99:
            r13 = 0
        L9b:
            long r11 = androidx.compose.ui.unit.Velocity.g(r8, r13)
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: W0 */
    public final Object getT() {
        return this.u;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        boolean z = this.q;
        NestedScrollNode nestedScrollNode = null;
        if (z && z) {
            nestedScrollNode = (NestedScrollNode) TraversableNodeKt.a(this);
        }
        long jB0 = nestedScrollNode != null ? nestedScrollNode.b0(i, j) : 0L;
        return Offset.h(jB0, this.r.b0(i, Offset.g(j, jB0)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        NestedScrollDispatcher nestedScrollDispatcher = this.s;
        nestedScrollDispatcher.f1845a = this;
        nestedScrollDispatcher.b = null;
        this.t = null;
        nestedScrollDispatcher.c = new NestedScrollNode$updateDispatcherFields$1(this);
        nestedScrollDispatcher.d = g2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.b(this, new Function1<TraversableNode, Boolean>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                TraversableNode traversableNode = (TraversableNode) obj;
                if (traversableNode.getD().q) {
                    objectRef.d = traversableNode;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        NestedScrollNode nestedScrollNode = (NestedScrollNode) ((TraversableNode) objectRef.d);
        this.t = nestedScrollNode;
        NestedScrollDispatcher nestedScrollDispatcher = this.s;
        nestedScrollDispatcher.b = nestedScrollNode;
        if (nestedScrollDispatcher.f1845a == this) {
            nestedScrollDispatcher.f1845a = null;
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        long jN0 = this.r.n0(i, j, j2);
        boolean z = this.q;
        NestedScrollNode nestedScrollNode = null;
        if (z && z) {
            nestedScrollNode = (NestedScrollNode) TraversableNodeKt.a(this);
        }
        NestedScrollNode nestedScrollNode2 = nestedScrollNode;
        return Offset.h(jN0, nestedScrollNode2 != null ? nestedScrollNode2.n0(i, Offset.h(j, jN0), Offset.g(j2, jN0)) : 0L);
    }

    public final CoroutineScope s2() {
        NestedScrollNode nestedScrollNode = this.q ? (NestedScrollNode) TraversableNodeKt.a(this) : null;
        if (nestedScrollNode != null) {
            return nestedScrollNode.s2();
        }
        CoroutineScope coroutineScope = this.s.d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
