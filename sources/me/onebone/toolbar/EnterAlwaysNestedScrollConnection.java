package me.onebone.toolbar;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/EnterAlwaysNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class EnterAlwaysNestedScrollConnection implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof me.onebone.toolbar.EnterAlwaysNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            me.onebone.toolbar.EnterAlwaysNestedScrollConnection$onPreFling$1 r0 = (me.onebone.toolbar.EnterAlwaysNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            me.onebone.toolbar.EnterAlwaysNestedScrollConnection$onPreFling$1 r0 = new me.onebone.toolbar.EnterAlwaysNestedScrollConnection$onPreFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 != r3) goto L32
            long r5 = r0.p
            kotlin.ResultKt.b(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            goto L49
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.b(r7)
            float r7 = androidx.compose.ui.unit.Velocity.e(r5)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L58
            float r7 = androidx.compose.ui.unit.Velocity.e(r5)
        L49:
            float r5 = androidx.compose.ui.unit.Velocity.e(r5)
            float r5 = r5 - r7
            long r5 = androidx.compose.ui.unit.VelocityKt.a(r2, r5)
            androidx.compose.ui.unit.Velocity r7 = new androidx.compose.ui.unit.Velocity
            r7.<init>(r5)
            return r7
        L58:
            androidx.compose.ui.unit.Velocity.e(r5)
            r0.p = r5
            r0.s = r3
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.onebone.toolbar.EnterAlwaysNestedScrollConnection.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        Offset.f(j);
        throw null;
    }
}
