package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r0.r
            if (r0 == 0) goto L31
            r5 = 1
            if (r0 != r5) goto L29
            kotlin.ResultKt.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            float r7 = androidx.compose.ui.unit.Velocity.d(r5)
            float r5 = androidx.compose.ui.unit.Velocity.e(r5)
            long r5 = androidx.compose.ui.geometry.OffsetKt.a(r7, r5)
            float r5 = androidx.compose.ui.geometry.Offset.f(r5)
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L51
        L49:
            androidx.compose.ui.unit.Velocity r5 = new androidx.compose.ui.unit.Velocity
            r6 = 0
            r5.<init>(r6)
            return r5
        L51:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r4 = r8 instanceof androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r4 == 0) goto L13
            r4 = r8
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r4 = (androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r4
            int r5 = r4.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.s = r5
            goto L1a
        L13:
            androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r4 = new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r8 = r4.s
            r0 = 1
            if (r8 == 0) goto L38
            if (r8 != r0) goto L30
            long r6 = r4.p
            kotlin.ResultKt.b(r5)
            androidx.compose.ui.unit.Velocity r4 = new androidx.compose.ui.unit.Velocity
            r4.<init>(r6)
            return r4
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.b(r5)
            float r5 = androidx.compose.ui.unit.Velocity.d(r6)
            float r8 = androidx.compose.ui.unit.Velocity.e(r6)
            long r1 = androidx.compose.ui.geometry.OffsetKt.a(r5, r8)
            androidx.compose.ui.geometry.Offset.f(r1)
            r4.p = r6
            r4.s = r0
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        if (Offset.f(j) >= BitmapDescriptorFactory.HUE_RED || i != 1) {
            return 0L;
        }
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        Offset.f(j2);
        throw null;
    }
}
