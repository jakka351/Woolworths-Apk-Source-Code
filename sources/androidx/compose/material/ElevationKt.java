package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ElevationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TweenSpec f1280a = new TweenSpec(120, EasingKt.f756a, 2);
    public static final TweenSpec b = new TweenSpec(150, new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f), 2);
    public static final TweenSpec c = new TweenSpec(120, new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f), 2);

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 androidx.compose.animation.core.TweenSpec) = 
  (r1v0 androidx.compose.animation.core.TweenSpec)
  (r1v0 androidx.compose.animation.core.TweenSpec)
  (r1v0 androidx.compose.animation.core.TweenSpec)
  (r1v4 androidx.compose.animation.core.TweenSpec)
  (r1v4 androidx.compose.animation.core.TweenSpec)
  (r1v4 androidx.compose.animation.core.TweenSpec)
  (r1v4 androidx.compose.animation.core.TweenSpec)
 binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.animation.core.Animatable r8, float r9, androidx.compose.foundation.interaction.Interaction r10, androidx.compose.foundation.interaction.Interaction r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r0 = 0
            if (r11 == 0) goto L1c
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.material.ElevationKt.f1280a
            if (r10 == 0) goto Lb
        L9:
            r0 = r1
            goto L1a
        Lb:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r10 == 0) goto L10
            goto L9
        L10:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r10 == 0) goto L15
            goto L9
        L15:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r10 == 0) goto L1a
            goto L9
        L1a:
            r3 = r0
            goto L36
        L1c:
            if (r10 == 0) goto L1a
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.material.ElevationKt.b
            if (r11 == 0) goto L25
        L24:
            goto L9
        L25:
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r11 == 0) goto L2a
            goto L24
        L2a:
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r11 == 0) goto L31
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.material.ElevationKt.c
            goto L1a
        L31:
            boolean r10 = r10 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r10 == 0) goto L1a
            goto L24
        L36:
            if (r3 == 0) goto L4c
            androidx.compose.ui.unit.Dp r2 = new androidx.compose.ui.unit.Dp
            r2.<init>(r9)
            r5 = 0
            r7 = 12
            r4 = 0
            r1 = r8
            r6 = r12
            java.lang.Object r8 = androidx.compose.animation.core.Animatable.d(r1, r2, r3, r4, r5, r6, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r8 != r9) goto L5c
            return r8
        L4c:
            r1 = r8
            r6 = r12
            androidx.compose.ui.unit.Dp r8 = new androidx.compose.ui.unit.Dp
            r8.<init>(r9)
            java.lang.Object r8 = r1.h(r8, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r8 != r9) goto L5c
            return r8
        L5c:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ElevationKt.a(androidx.compose.animation.core.Animatable, float, androidx.compose.foundation.interaction.Interaction, androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
