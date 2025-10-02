package me.onebone.toolbar;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/ExitUntilCollapsedNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ExitUntilCollapsedNestedScrollConnection implements NestedScrollConnection {
    public final CollapsingToolbarState d;
    public final FlingBehavior e;

    public ExitUntilCollapsedNestedScrollConnection(CollapsingToolbarState toolbarState, FlingBehavior flingBehavior) {
        Intrinsics.h(toolbarState, "toolbarState");
        Intrinsics.h(flingBehavior, "flingBehavior");
        this.d = toolbarState;
        this.e = flingBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPreFling$1 r0 = (me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPreFling$1 r0 = new me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPreFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            long r6 = r0.p
            kotlin.ResultKt.b(r8)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.b(r8)
            float r8 = androidx.compose.ui.unit.Velocity.e(r6)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 >= 0) goto L59
            float r8 = androidx.compose.ui.unit.Velocity.e(r6)
            r0.p = r6
            r0.s = r4
            me.onebone.toolbar.CollapsingToolbarState r2 = r5.d
            androidx.compose.foundation.gestures.FlingBehavior r4 = r5.e
            java.lang.Object r8 = r2.f(r4, r8, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            goto L5d
        L59:
            float r8 = androidx.compose.ui.unit.Velocity.e(r6)
        L5d:
            float r6 = androidx.compose.ui.unit.Velocity.e(r6)
            float r6 = r6 - r8
            long r6 = androidx.compose.ui.unit.VelocityKt.a(r3, r6)
            androidx.compose.ui.unit.Velocity r8 = new androidx.compose.ui.unit.Velocity
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r4, long r6, kotlin.coroutines.Continuation r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPostFling$1
            if (r4 == 0) goto L13
            r4 = r8
            me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPostFling$1 r4 = (me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPostFling$1) r4
            int r5 = r4.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.s = r5
            goto L1a
        L13:
            me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPostFling$1 r4 = new me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L2c
            long r6 = r4.p
            kotlin.ResultKt.b(r5)
            goto L4e
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r5)
            float r5 = androidx.compose.ui.unit.Velocity.e(r6)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L54
            r4.p = r6
            r4.s = r2
            me.onebone.toolbar.CollapsingToolbarState r0 = r3.d
            androidx.compose.foundation.gestures.FlingBehavior r2 = r3.e
            java.lang.Object r5 = r0.f(r2, r5, r4)
            if (r5 != r8) goto L4e
            return r8
        L4e:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
        L54:
            float r4 = androidx.compose.ui.unit.Velocity.e(r6)
            float r4 = r4 - r5
            long r4 = androidx.compose.ui.unit.VelocityKt.a(r1, r4)
            androidx.compose.ui.unit.Velocity r6 = new androidx.compose.ui.unit.Velocity
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.onebone.toolbar.ExitUntilCollapsedNestedScrollConnection.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        float f = Offset.f(j);
        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, f < BitmapDescriptorFactory.HUE_RED ? this.d.d.c(f) : 0.0f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        float f = Offset.f(j2);
        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, f > BitmapDescriptorFactory.HUE_RED ? this.d.d.c(f) : 0.0f);
    }
}
