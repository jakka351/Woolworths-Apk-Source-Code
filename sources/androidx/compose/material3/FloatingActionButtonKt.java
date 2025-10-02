package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FloatingActionButtonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1451a = 20;
    public static final float b = 80;

    static {
        CubicBezierEasing cubicBezierEasing = MotionTokens.c;
        ExitTransition exitTransitionF = EnterExitTransitionKt.f(AnimationSpecKt.e(100, 0, cubicBezierEasing, 2), 2);
        CubicBezierEasing cubicBezierEasing2 = MotionTokens.f1590a;
        exitTransitionF.b(EnterExitTransitionKt.i(AnimationSpecKt.e(500, 0, cubicBezierEasing2, 2), 12));
        EnterExitTransitionKt.e(new TweenSpec(200, 100, cubicBezierEasing), 2).b(EnterExitTransitionKt.a(AnimationSpecKt.e(500, 0, cubicBezierEasing2, 2), 12));
    }
}
