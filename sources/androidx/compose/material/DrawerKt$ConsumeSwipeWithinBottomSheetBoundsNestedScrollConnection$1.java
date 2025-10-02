package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    public final Orientation d = Orientation.d;
    public final /* synthetic */ AnchoredDraggableState e;

    public DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState anchoredDraggableState) {
        this.e = anchoredDraggableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r7 = r0.p
            kotlin.ResultKt.b(r9)
            goto L69
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.b(r9)
            androidx.compose.foundation.gestures.Orientation r9 = r6.d
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.e
            if (r9 != r2) goto L41
            float r9 = androidx.compose.ui.unit.Velocity.d(r7)
            goto L45
        L41:
            float r9 = androidx.compose.ui.unit.Velocity.e(r7)
        L45:
            androidx.compose.material.AnchoredDraggableState r2 = r6.e
            float r4 = r2.g()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L67
            androidx.compose.material.DraggableAnchors r5 = r2.e()
            float r5 = r5.e()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L67
            r0.p = r7
            r0.s = r3
            java.lang.Object r9 = r2.j(r9, r0)
            if (r9 != r1) goto L69
            return r1
        L67:
            r7 = 0
        L69:
            androidx.compose.ui.unit.Velocity r9 = new androidx.compose.ui.unit.Velocity
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.J0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(long r3, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.s = r4
            goto L1a
        L13:
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r3.<init>(r2, r7)
        L1a:
            java.lang.Object r4 = r3.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r3.s
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.p
            kotlin.ResultKt.b(r4)
            goto L52
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            kotlin.ResultKt.b(r4)
            androidx.compose.foundation.gestures.Orientation r4 = r2.d
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.e
            if (r4 != r0) goto L41
            float r4 = androidx.compose.ui.unit.Velocity.d(r5)
            goto L45
        L41:
            float r4 = androidx.compose.ui.unit.Velocity.e(r5)
        L45:
            r3.p = r5
            r3.s = r1
            androidx.compose.material.AnchoredDraggableState r0 = r2.e
            java.lang.Object r3 = r0.j(r4, r3)
            if (r3 != r7) goto L52
            return r7
        L52:
            androidx.compose.ui.unit.Velocity r3 = new androidx.compose.ui.unit.Velocity
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.V(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        Orientation orientation = Orientation.e;
        Orientation orientation2 = this.d;
        float fE = orientation2 == orientation ? Offset.e(j) : Offset.f(j);
        float f = BitmapDescriptorFactory.HUE_RED;
        if (fE >= BitmapDescriptorFactory.HUE_RED || i != 1) {
            return 0L;
        }
        float fD = this.e.d(fE);
        float f2 = orientation2 == orientation ? fD : 0.0f;
        if (orientation2 == Orientation.d) {
            f = fD;
        }
        return OffsetKt.a(f2, f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        Orientation orientation = Orientation.e;
        Orientation orientation2 = this.d;
        float fD = this.e.d(orientation2 == orientation ? Offset.e(j2) : Offset.f(j2));
        float f = orientation2 == orientation ? fD : 0.0f;
        if (orientation2 != Orientation.d) {
            fD = 0.0f;
        }
        return OffsetKt.a(f, fD);
    }
}
