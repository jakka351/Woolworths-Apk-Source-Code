package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    public final ScrollingLogic d;
    public boolean e;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.d = scrollingLogic;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r5, long r7, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r5 == 0) goto L13
            r5 = r9
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r5 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r5
            int r6 = r5.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.s = r6
            goto L1a
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r5 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r5.s
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L3c
            r7 = 2
            if (r0 != r7) goto L34
            long r7 = r5.p
            kotlin.ResultKt.b(r6)
            androidx.compose.ui.unit.Velocity r6 = (androidx.compose.ui.unit.Velocity) r6
            long r5 = r6.getF2206a()
            goto L64
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            long r7 = r5.p
            kotlin.ResultKt.b(r6)
            goto L5e
        L42:
            kotlin.ResultKt.b(r6)
            boolean r6 = r4.e
            r2 = 0
            if (r6 == 0) goto L68
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r4.d
            boolean r0 = r6.h
            if (r0 == 0) goto L53
            r5 = r2
            goto L64
        L53:
            r5.p = r7
            r5.s = r1
            java.lang.Object r6 = r6.b(r7, r5)
            if (r6 != r9) goto L5e
            return r9
        L5e:
            androidx.compose.ui.unit.Velocity r6 = (androidx.compose.ui.unit.Velocity) r6
            long r5 = r6.getF2206a()
        L64:
            long r2 = androidx.compose.ui.unit.Velocity.f(r7, r5)
        L68:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.a(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (!this.e) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = this.d;
        if (scrollingLogic.f900a.a()) {
            return 0L;
        }
        return scrollingLogic.h(scrollingLogic.d(scrollingLogic.f900a.c(scrollingLogic.d(scrollingLogic.g(j2)))));
    }
}
