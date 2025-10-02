package me.onebone.toolbar;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/EnterAlwaysCollapsedNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class EnterAlwaysCollapsedNestedScrollConnection implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r3, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1 r3 = (me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.s = r4
            goto L1a
        L13:
            me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1 r3 = new me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r3.<init>(r2, r7)
        L1a:
            java.lang.Object r4 = r3.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r7 = r3.s
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L3a
            if (r7 != r1) goto L32
            long r5 = r3.p
            kotlin.ResultKt.b(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            float r3 = r4.floatValue()
            goto L46
        L32:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L3a:
            kotlin.ResultKt.b(r4)
            float r4 = androidx.compose.ui.unit.Velocity.e(r5)
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 > 0) goto L55
            r3 = r4
        L46:
            float r4 = androidx.compose.ui.unit.Velocity.e(r5)
            float r4 = r4 - r3
            long r3 = androidx.compose.ui.unit.VelocityKt.a(r0, r4)
            androidx.compose.ui.unit.Velocity r5 = new androidx.compose.ui.unit.Velocity
            r5.<init>(r3)
            return r5
        L55:
            r3.p = r5
            r3.s = r1
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        if (Offset.f(j) > BitmapDescriptorFactory.HUE_RED) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (Offset.f(j2) <= BitmapDescriptorFactory.HUE_RED) {
            return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        throw null;
    }
}
