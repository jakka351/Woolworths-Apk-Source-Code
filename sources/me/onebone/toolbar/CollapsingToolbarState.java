package me.onebone.toolbar;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/CollapsingToolbarState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarState implements ScrollableState {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f24916a;
    public final MutableState b = SnapshotStateKt.f(Integer.MAX_VALUE);
    public final MutableState c = SnapshotStateKt.f(0);
    public final ScrollableState d = ScrollableStateKt.a(new Function1<Float, Float>() { // from class: me.onebone.toolbar.CollapsingToolbarState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            float fFloatValue = ((Number) obj).floatValue();
            CollapsingToolbarState collapsingToolbarState = this.h;
            float fMax = fFloatValue < BitmapDescriptorFactory.HUE_RED ? Math.max(collapsingToolbarState.i() - collapsingToolbarState.g(), fFloatValue) : Math.min(collapsingToolbarState.h() - collapsingToolbarState.g(), fFloatValue);
            float f = collapsingToolbarState.e + fMax;
            int i = (int) f;
            if (Math.abs(f) > BitmapDescriptorFactory.HUE_RED) {
                ((SnapshotMutableStateImpl) collapsingToolbarState.f24916a).setValue(Integer.valueOf(collapsingToolbarState.g() + i));
                collapsingToolbarState.e = f - i;
            }
            return Float.valueOf(fMax);
        }
    });
    public float e;

    public CollapsingToolbarState(int i) {
        this.f24916a = SnapshotStateKt.f(Integer.valueOf(i));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.d.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float c(float f) {
        return this.d.c(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objE = this.d.e(mutatePriority, function2, continuation);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(androidx.compose.foundation.gestures.FlingBehavior r5, float r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof me.onebone.toolbar.CollapsingToolbarState$fling$1
            if (r0 == 0) goto L13
            r0 = r7
            me.onebone.toolbar.CollapsingToolbarState$fling$1 r0 = (me.onebone.toolbar.CollapsingToolbarState$fling$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            me.onebone.toolbar.CollapsingToolbarState$fling$1 r0 = new me.onebone.toolbar.CollapsingToolbarState$fling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$FloatRef r5 = r0.p
            kotlin.ResultKt.b(r7)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.internal.Ref$FloatRef r7 = new kotlin.jvm.internal.Ref$FloatRef
            r7.<init>()
            r7.d = r6
            me.onebone.toolbar.CollapsingToolbarState$fling$2 r6 = new me.onebone.toolbar.CollapsingToolbarState$fling$2
            r2 = 0
            r6.<init>(r5, r7, r2)
            r0.p = r7
            r0.s = r3
            androidx.compose.foundation.MutatePriority r5 = androidx.compose.foundation.MutatePriority.d
            java.lang.Object r5 = r4.e(r5, r6, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r7
        L4f:
            float r5 = r5.d
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.onebone.toolbar.CollapsingToolbarState.f(androidx.compose.foundation.gestures.FlingBehavior, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final int g() {
        return ((Number) ((SnapshotMutableStateImpl) this.f24916a).getD()).intValue();
    }

    public final int h() {
        return ((Number) ((SnapshotMutableStateImpl) this.b).getD()).intValue();
    }

    public final int i() {
        return ((Number) ((SnapshotMutableStateImpl) this.c).getD()).intValue();
    }

    public final float j() {
        return i() == h() ? BitmapDescriptorFactory.HUE_RED : RangesKt.b((g() - i()) / (h() - i()), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }
}
