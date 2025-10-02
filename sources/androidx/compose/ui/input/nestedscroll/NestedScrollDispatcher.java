package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public NestedScrollNode f1845a;
    public NestedScrollNode b;
    public Lambda c = new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.d;
        }
    };
    public CoroutineScope d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r10, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r14)
            goto L85
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            kotlin.ResultKt.b(r14)
            goto L5f
        L38:
            kotlin.ResultKt.b(r14)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r14 = r9.f1845a
            r1 = 0
            if (r14 == 0) goto L4b
            boolean r4 = r14.q
            if (r4 == 0) goto L4b
            androidx.compose.ui.node.TraversableNode r14 = androidx.compose.ui.node.TraversableNodeKt.a(r14)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r14 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r14
            goto L4c
        L4b:
            r14 = r1
        L4c:
            r4 = 0
            if (r14 != 0) goto L66
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r9.b
            if (r1 == 0) goto L8d
            r6.r = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.V(r2, r4, r6)
            if (r14 != r0) goto L5f
            goto L84
        L5f:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r4 = r14.getF2206a()
            goto L8d
        L66:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r13 = r9.f1845a
            if (r13 == 0) goto L7a
            boolean r14 = r13.q
            if (r14 == 0) goto L7a
            androidx.compose.ui.node.TraversableNode r13 = androidx.compose.ui.node.TraversableNodeKt.a(r13)
            r1 = r13
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r1
        L7a:
            if (r1 == 0) goto L8c
            r6.r = r12
            java.lang.Object r14 = r1.V(r2, r4, r6)
            if (r14 != r0) goto L85
        L84:
            return r0
        L85:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r4 = r14.getF2206a()
            goto L8d
        L8c:
            r4 = r10
        L8d:
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.a(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r8)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r8 = r5.f1845a
            r2 = 0
            if (r8 == 0) goto L42
            boolean r4 = r8.q
            if (r4 == 0) goto L42
            androidx.compose.ui.node.TraversableNode r8 = androidx.compose.ui.node.TraversableNodeKt.a(r8)
            r2 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
        L42:
            if (r2 == 0) goto L54
            r0.r = r3
            java.lang.Object r8 = r2.J0(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            androidx.compose.ui.unit.Velocity r8 = (androidx.compose.ui.unit.Velocity) r8
            long r6 = r8.getF2206a()
            goto L56
        L54:
            r6 = 0
        L56:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.b(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final CoroutineScope c() {
        CoroutineScope coroutineScope = (CoroutineScope) this.c.invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
