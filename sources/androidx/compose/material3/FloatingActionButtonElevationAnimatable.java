package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FloatingActionButtonElevationAnimatable {

    /* renamed from: a, reason: collision with root package name */
    public float f1450a;
    public float b;
    public float c;
    public float d;
    public final Animatable e;
    public Interaction f;
    public Interaction g;

    public FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.f1450a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new Animatable(new Dp(f), VectorConvertersKt.c, (Object) null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.interaction.Interaction r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            androidx.compose.animation.core.Animatable r0 = r5.e
            boolean r1 = r7 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r1 == 0) goto L15
            r1 = r7
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r1 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t = r2
            goto L1a
        L15:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r1 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.t
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            androidx.compose.foundation.interaction.Interaction r6 = r1.q
            java.lang.Object r0 = r1.p
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L7a
        L2f:
            r7 = move-exception
            goto L7f
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.ResultKt.b(r7)
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r7 == 0) goto L43
            float r7 = r5.b
            goto L53
        L43:
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r7 == 0) goto L4a
            float r7 = r5.c
            goto L53
        L4a:
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r7 == 0) goto L51
            float r7 = r5.d
            goto L53
        L51:
            float r7 = r5.f1450a
        L53:
            r5.g = r6
            androidx.compose.runtime.MutableState r3 = r0.e     // Catch: java.lang.Throwable -> L76
            androidx.compose.runtime.SnapshotMutableStateImpl r3 = (androidx.compose.runtime.SnapshotMutableStateImpl) r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r3.getD()     // Catch: java.lang.Throwable -> L76
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.ui.unit.Dp) r3     // Catch: java.lang.Throwable -> L76
            float r3 = r3.d     // Catch: java.lang.Throwable -> L76
            boolean r3 = androidx.compose.ui.unit.Dp.a(r3, r7)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L79
            androidx.compose.foundation.interaction.Interaction r3 = r5.f     // Catch: java.lang.Throwable -> L76
            r1.p = r5     // Catch: java.lang.Throwable -> L76
            r1.q = r6     // Catch: java.lang.Throwable -> L76
            r1.t = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = androidx.compose.material3.internal.ElevationKt.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L76
            if (r7 != r2) goto L79
            return r2
        L76:
            r7 = move-exception
            r0 = r5
            goto L7f
        L79:
            r0 = r5
        L7a:
            r0.f = r6
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L7f:
            r0.f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.a(androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.p
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r0
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L76
        L2b:
            r6 = move-exception
            goto L7d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.interaction.Interaction r6 = r5.g
            boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r2 == 0) goto L41
            float r6 = r5.b
            goto L51
        L41:
            boolean r2 = r6 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r2 == 0) goto L48
            float r6 = r5.c
            goto L51
        L48:
            boolean r6 = r6 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r6 == 0) goto L4f
            float r6 = r5.d
            goto L51
        L4f:
            float r6 = r5.f1450a
        L51:
            androidx.compose.animation.core.Animatable r2 = r5.e
            androidx.compose.runtime.MutableState r4 = r2.e
            androidx.compose.runtime.SnapshotMutableStateImpl r4 = (androidx.compose.runtime.SnapshotMutableStateImpl) r4
            java.lang.Object r4 = r4.getD()
            androidx.compose.ui.unit.Dp r4 = (androidx.compose.ui.unit.Dp) r4
            float r4 = r4.d
            boolean r4 = androidx.compose.ui.unit.Dp.a(r4, r6)
            if (r4 != 0) goto L82
            androidx.compose.ui.unit.Dp r4 = new androidx.compose.ui.unit.Dp     // Catch: java.lang.Throwable -> L7b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            r0.p = r5     // Catch: java.lang.Throwable -> L7b
            r0.s = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r2.h(r4, r0)     // Catch: java.lang.Throwable -> L7b
            if (r6 != r1) goto L75
            return r1
        L75:
            r0 = r5
        L76:
            androidx.compose.foundation.interaction.Interaction r6 = r0.g
            r0.f = r6
            goto L82
        L7b:
            r6 = move-exception
            r0 = r5
        L7d:
            androidx.compose.foundation.interaction.Interaction r1 = r0.g
            r0.f = r1
            throw r6
        L82:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
