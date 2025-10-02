package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabRowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1512a = 90;
    public static final TweenSpec b;
    public static final TweenSpec c;

    static {
        CubicBezierEasing cubicBezierEasing = EasingKt.f756a;
        b = AnimationSpecKt.e(250, 0, cubicBezierEasing, 2);
        c = AnimationSpecKt.e(250, 0, cubicBezierEasing, 2);
    }
}
