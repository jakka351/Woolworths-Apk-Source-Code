package ovh.plrapps.mapcompose.ui.gestures;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lovh/plrapps/mapcompose/ui/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class PressGestureScopeImpl implements PressGestureScope, Density {
    public final /* synthetic */ Density d;
    public boolean e;
    public boolean f;
    public final MutexImpl g;

    public PressGestureScopeImpl(Density density) {
        Intrinsics.h(density, "density");
        this.d = density;
        this.g = new MutexImpl(false);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float B(int i) {
        return this.d.B(i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float C(float f) {
        return this.d.C(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long F(long j) {
        return this.d.F(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long H(float f) {
        return this.d.H(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return this.d.getE();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float T1(float f) {
        return this.d.T1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int W1(long j) {
        return this.d.W1(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y0(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.p
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl r0 = (ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl) r0
            kotlin.ResultKt.b(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.b(r5)
            boolean r5 = r4.e
            if (r5 != 0) goto L4b
            boolean r5 = r4.f
            if (r5 != 0) goto L4b
            r0.p = r4
            r0.s = r3
            kotlinx.coroutines.sync.MutexImpl r5 = r4.g
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            boolean r5 = r0.e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl.Y0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return this.d.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$reset$1 r0 = (ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$reset$1 r0 = new ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.p
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl r0 = (ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl) r0
            kotlin.ResultKt.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.b(r5)
            r0.p = r4
            r0.s = r3
            kotlinx.coroutines.sync.MutexImpl r5 = r4.g
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r5 = 0
            r0.e = r5
            r0.f = r5
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl.i(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j) {
        return this.d.p(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j) {
        return this.d.r(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r0(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            java.lang.Object r5 = r4.Y0(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L46:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl.r0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    public final int r1(float f) {
        return this.d.r1(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long t(int i) {
        return this.d.t(i);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float t1(long j) {
        return this.d.t1(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long v(float f) {
        return this.d.v(f);
    }
}
