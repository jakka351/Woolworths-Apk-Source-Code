package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    public final Function1 d;
    public final Function2 e;
    public final boolean f;

    public PullRefreshNestedScrollConnection(Function1 function1, Function2 function2, boolean z) {
        this.d = function1;
        this.e = function2;
        this.f = z;
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
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
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
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            float r5 = androidx.compose.ui.unit.Velocity.e(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.r = r3
            kotlin.jvm.functions.Function2 r5 = r4.e
            androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$2 r5 = (androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$2) r5
            java.lang.Object r7 = r5.invoke(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = androidx.compose.ui.unit.VelocityKt.a(r6, r5)
            androidx.compose.ui.unit.Velocity r7 = new androidx.compose.ui.unit.Velocity
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        if (!this.f || i != 1 || Offset.f(j) >= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, ((Number) this.d.invoke(Float.valueOf(Offset.f(j)))).floatValue());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (!this.f || i != 1 || Offset.f(j2) <= BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, ((Number) this.d.invoke(Float.valueOf(Offset.f(j2)))).floatValue());
    }
}
