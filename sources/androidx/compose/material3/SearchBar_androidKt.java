package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "useFullScreenShape", "showContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SearchBar_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1484a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final TweenSpec g;

    static {
        int i = Color.l;
        f1484a = SearchBarDefaults.f1483a / 2;
        b = 240;
        float f2 = 8;
        c = f2;
        d = 4;
        e = f2;
        f = 24;
        CubicBezierEasing cubicBezierEasing = MotionTokens.b;
        CubicBezierEasing cubicBezierEasing2 = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        TweenSpec tweenSpec = new TweenSpec(600, 100, cubicBezierEasing);
        TweenSpec tweenSpec2 = new TweenSpec(350, 100, cubicBezierEasing2);
        g = AnimationSpecKt.e(350, 0, cubicBezierEasing2, 2);
        TweenSpec tweenSpec3 = new TweenSpec(600, 100, cubicBezierEasing);
        TweenSpec tweenSpec4 = new TweenSpec(350, 100, cubicBezierEasing2);
        EnterExitTransitionKt.e(tweenSpec, 2).b(EnterExitTransitionKt.d(tweenSpec3, 14));
        EnterExitTransitionKt.f(tweenSpec2, 2).b(EnterExitTransitionKt.l(tweenSpec4, 14));
    }
}
