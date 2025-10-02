package androidx.compose.material3;

import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior d;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.d = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r6, long r8, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r6 = r10 instanceof androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r6 == 0) goto L13
            r6 = r10
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r6 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) r6
            int r7 = r6.t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r7 & r0
            if (r1 == 0) goto L13
            int r7 = r7 - r0
            r6.t = r7
            goto L1a
        L13:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r6 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r10 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r10
            r6.<init>(r5, r10)
        L1a:
            java.lang.Object r7 = r6.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r6.t
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L36
            if (r0 != r1) goto L2e
            long r8 = r6.q
            kotlin.ResultKt.b(r7)
            goto L73
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            long r8 = r6.q
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 r0 = r6.p
            kotlin.ResultKt.b(r7)
            goto L52
        L3e:
            kotlin.ResultKt.b(r7)
            r6.p = r5
            r6.q = r8
            r6.t = r2
            androidx.compose.ui.unit.Velocity r7 = new androidx.compose.ui.unit.Velocity
            r2 = 0
            r7.<init>(r2)
            if (r7 != r10) goto L51
            goto L71
        L51:
            r0 = r5
        L52:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r2 = r7.f2206a
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r7 = r0.d
            androidx.compose.material3.TopAppBarState r7 = r7.f1443a
            float r8 = androidx.compose.ui.unit.Velocity.e(r8)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r9 = r0.d
            androidx.compose.animation.core.DecayAnimationSpec r0 = r9.c
            androidx.compose.animation.core.SpringSpec r9 = r9.b
            r4 = 0
            r6.p = r4
            r6.q = r2
            r6.t = r1
            java.lang.Object r7 = androidx.compose.material3.AppBarKt.a(r7, r8, r0, r9, r6)
            if (r7 != r10) goto L72
        L71:
            return r10
        L72:
            r8 = r2
        L73:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r6 = r7.f2206a
            long r6 = androidx.compose.ui.unit.Velocity.g(r8, r6)
            androidx.compose.ui.unit.Velocity r8 = new androidx.compose.ui.unit.Velocity
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        TopAppBarState topAppBarState = this.d.f1443a;
        if (!Boolean.TRUE.booleanValue() || Offset.f(j) > BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        float fB = topAppBarState.b();
        topAppBarState.c(Offset.f(j) + topAppBarState.b());
        if (fB == topAppBarState.b()) {
            return 0L;
        }
        return Offset.a(j, BitmapDescriptorFactory.HUE_RED, 2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        TopAppBarState topAppBarState = this.d.f1443a;
        if (!Boolean.TRUE.booleanValue()) {
            return 0L;
        }
        ((SnapshotMutableFloatStateImpl) topAppBarState.b).p(Offset.f(j) + ((SnapshotMutableFloatStateImpl) topAppBarState.b).a());
        if (Offset.f(j2) < BitmapDescriptorFactory.HUE_RED || Offset.f(j) < BitmapDescriptorFactory.HUE_RED) {
            float fB = topAppBarState.b();
            topAppBarState.c(Offset.f(j) + topAppBarState.b());
            return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, topAppBarState.b() - fB);
        }
        if (Offset.f(j) == BitmapDescriptorFactory.HUE_RED && Offset.f(j2) > BitmapDescriptorFactory.HUE_RED) {
            ((SnapshotMutableFloatStateImpl) topAppBarState.b).p(BitmapDescriptorFactory.HUE_RED);
        }
        if (Offset.f(j2) <= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        float fB2 = topAppBarState.b();
        topAppBarState.c(Offset.f(j2) + topAppBarState.b());
        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, topAppBarState.b() - fB2);
    }
}
