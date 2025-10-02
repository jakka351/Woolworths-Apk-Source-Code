package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RippleAnimation {

    /* renamed from: a, reason: collision with root package name */
    public Offset f1387a;
    public final float b;
    public final boolean c;
    public Float d;
    public Offset e;
    public final Animatable f = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
    public final Animatable g = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
    public final Animatable h = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
    public final CompletableDeferred i = CompletableDeferredKt.a();
    public final MutableState j;
    public final MutableState k;

    public RippleAnimation(Offset offset, float f, boolean z) {
        this.f1387a = offset;
        this.b = f;
        this.c = z;
        Boolean bool = Boolean.FALSE;
        this.j = SnapshotStateKt.f(bool);
        this.k = SnapshotStateKt.f(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 3
            r4 = 2
            r5 = 1
            kotlin.Unit r6 = kotlin.Unit.f24250a
            r7 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.b(r9)
            return r6
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            androidx.compose.material.ripple.RippleAnimation r2 = r0.p
            kotlin.ResultKt.b(r9)
            goto L72
        L3e:
            androidx.compose.material.ripple.RippleAnimation r2 = r0.p
            kotlin.ResultKt.b(r9)
            goto L5c
        L44:
            kotlin.ResultKt.b(r9)
            r0.p = r8
            r0.s = r5
            androidx.compose.material.ripple.RippleAnimation$fadeIn$2 r9 = new androidx.compose.material.ripple.RippleAnimation$fadeIn$2
            r9.<init>(r8, r7)
            java.lang.Object r9 = kotlinx.coroutines.CoroutineScopeKt.c(r9, r0)
            if (r9 != r1) goto L57
            goto L58
        L57:
            r9 = r6
        L58:
            if (r9 != r1) goto L5b
            goto L88
        L5b:
            r2 = r8
        L5c:
            androidx.compose.runtime.MutableState r9 = r2.j
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            androidx.compose.runtime.SnapshotMutableStateImpl r9 = (androidx.compose.runtime.SnapshotMutableStateImpl) r9
            r9.setValue(r5)
            kotlinx.coroutines.CompletableDeferred r9 = r2.i
            r0.p = r2
            r0.s = r4
            java.lang.Object r9 = r9.await(r0)
            if (r9 != r1) goto L72
            goto L88
        L72:
            r0.p = r7
            r0.s = r3
            r2.getClass()
            androidx.compose.material.ripple.RippleAnimation$fadeOut$2 r9 = new androidx.compose.material.ripple.RippleAnimation$fadeOut$2
            r9.<init>(r2, r7)
            java.lang.Object r9 = kotlinx.coroutines.CoroutineScopeKt.c(r9, r0)
            if (r9 != r1) goto L85
            goto L86
        L85:
            r9 = r6
        L86:
            if (r9 != r1) goto L89
        L88:
            return r1
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
