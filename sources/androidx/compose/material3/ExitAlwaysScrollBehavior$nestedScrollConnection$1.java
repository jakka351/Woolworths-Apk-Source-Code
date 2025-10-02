package androidx.compose.material3;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r3, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.t = r4
            goto L1a
        L13:
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r3.<init>(r2, r7)
        L1a:
            java.lang.Object r4 = r3.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r3.t
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 == r1) goto L43
            r5 = 2
            if (r0 != r5) goto L3b
            long r5 = r3.q
            kotlin.ResultKt.b(r4)
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r3 = r4.f2206a
            long r3 = androidx.compose.ui.unit.Velocity.g(r5, r3)
            androidx.compose.ui.unit.Velocity r5 = new androidx.compose.ui.unit.Velocity
            r5.<init>(r3)
            return r5
        L3b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L43:
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1 r3 = r3.p
            kotlin.ResultKt.b(r4)
            goto L5d
        L49:
            kotlin.ResultKt.b(r4)
            r3.p = r2
            r3.q = r5
            r3.t = r1
            androidx.compose.ui.unit.Velocity r4 = new androidx.compose.ui.unit.Velocity
            r5 = 0
            r4.<init>(r5)
            if (r4 != r7) goto L5c
            return r7
        L5c:
            r3 = r2
        L5d:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r4 = r4.f2206a
            r3.getClass()
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        throw null;
    }
}
