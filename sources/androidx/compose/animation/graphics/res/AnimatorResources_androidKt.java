package androidx.compose.animation.graphics.res;

import android.R;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.BounceInterpolator;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.graphics.res.AnimatorResources_androidKt;
import androidx.compose.animation.graphics.vector.Animator;
import androidx.compose.animation.graphics.vector.compat.XmlAnimatorParser_androidKt;
import androidx.compose.animation.graphics.vector.compat.XmlPullParserUtils_androidKt;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatorResources_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.animation.core.a f804a;
    public static final androidx.compose.animation.core.a b;
    public static final a c = new a(new BounceInterpolator());
    public static final androidx.compose.animation.core.a d;
    public static final HashMap e;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.animation.core.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.animation.core.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.animation.core.a] */
    static {
        final int i = 1;
        f804a = new Easing() { // from class: androidx.compose.animation.core.a
            @Override // androidx.compose.animation.core.Easing
            public final float a(float f) {
                float f2;
                float f3;
                switch (i) {
                    case 0:
                        CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.f755a;
                        if (f < 0.36363637f) {
                            return 7.5625f * f * f;
                        }
                        if (f < 0.72727275f) {
                            float f4 = f - 0.54545456f;
                            f2 = 7.5625f * f4 * f4;
                            f3 = 0.75f;
                        } else if (f < 0.90909094f) {
                            float f5 = f - 0.8181818f;
                            f2 = 7.5625f * f5 * f5;
                            f3 = 0.9375f;
                        } else {
                            float f6 = f - 0.95454544f;
                            f2 = 7.5625f * f6 * f6;
                            f3 = 0.984375f;
                        }
                        return f2 + f3;
                    case 1:
                        a aVar = AnimatorResources_androidKt.f804a;
                        return (float) ((Math.cos((f + 1) * 3.141592653589793d) / 2.0f) + 0.5f);
                    case 2:
                        a aVar2 = AnimatorResources_androidKt.f804a;
                        return f * f;
                    default:
                        a aVar3 = AnimatorResources_androidKt.f804a;
                        float f7 = 1.0f - f;
                        return 1.0f - (f7 * f7);
                }
            }
        };
        final int i2 = 2;
        b = new Easing() { // from class: androidx.compose.animation.core.a
            @Override // androidx.compose.animation.core.Easing
            public final float a(float f) {
                float f2;
                float f3;
                switch (i2) {
                    case 0:
                        CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.f755a;
                        if (f < 0.36363637f) {
                            return 7.5625f * f * f;
                        }
                        if (f < 0.72727275f) {
                            float f4 = f - 0.54545456f;
                            f2 = 7.5625f * f4 * f4;
                            f3 = 0.75f;
                        } else if (f < 0.90909094f) {
                            float f5 = f - 0.8181818f;
                            f2 = 7.5625f * f5 * f5;
                            f3 = 0.9375f;
                        } else {
                            float f6 = f - 0.95454544f;
                            f2 = 7.5625f * f6 * f6;
                            f3 = 0.984375f;
                        }
                        return f2 + f3;
                    case 1:
                        a aVar = AnimatorResources_androidKt.f804a;
                        return (float) ((Math.cos((f + 1) * 3.141592653589793d) / 2.0f) + 0.5f);
                    case 2:
                        a aVar2 = AnimatorResources_androidKt.f804a;
                        return f * f;
                    default:
                        a aVar3 = AnimatorResources_androidKt.f804a;
                        float f7 = 1.0f - f;
                        return 1.0f - (f7 * f7);
                }
            }
        };
        final int i3 = 3;
        d = new Easing() { // from class: androidx.compose.animation.core.a
            @Override // androidx.compose.animation.core.Easing
            public final float a(float f) {
                float f2;
                float f3;
                switch (i3) {
                    case 0:
                        CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.f755a;
                        if (f < 0.36363637f) {
                            return 7.5625f * f * f;
                        }
                        if (f < 0.72727275f) {
                            float f4 = f - 0.54545456f;
                            f2 = 7.5625f * f4 * f4;
                            f3 = 0.75f;
                        } else if (f < 0.90909094f) {
                            float f5 = f - 0.8181818f;
                            f2 = 7.5625f * f5 * f5;
                            f3 = 0.9375f;
                        } else {
                            float f6 = f - 0.95454544f;
                            f2 = 7.5625f * f6 * f6;
                            f3 = 0.984375f;
                        }
                        return f2 + f3;
                    case 1:
                        a aVar = AnimatorResources_androidKt.f804a;
                        return (float) ((Math.cos((f + 1) * 3.141592653589793d) / 2.0f) + 0.5f);
                    case 2:
                        a aVar2 = AnimatorResources_androidKt.f804a;
                        return f * f;
                    default:
                        a aVar3 = AnimatorResources_androidKt.f804a;
                        float f7 = 1.0f - f;
                        return 1.0f - (f7 * f7);
                }
            }
        };
        Integer numValueOf = Integer.valueOf(R.anim.linear_interpolator);
        androidx.compose.animation.core.b bVar = EasingKt.d;
        Pair pair = new Pair(numValueOf, bVar);
        Integer numValueOf2 = Integer.valueOf(R.interpolator.fast_out_linear_in);
        CubicBezierEasing cubicBezierEasing = EasingKt.c;
        Pair pair2 = new Pair(numValueOf2, cubicBezierEasing);
        Integer numValueOf3 = Integer.valueOf(R.interpolator.fast_out_slow_in);
        CubicBezierEasing cubicBezierEasing2 = EasingKt.f756a;
        Pair pair3 = new Pair(numValueOf3, cubicBezierEasing2);
        Pair pair4 = new Pair(Integer.valueOf(R.interpolator.linear), bVar);
        Integer numValueOf4 = Integer.valueOf(R.interpolator.linear_out_slow_in);
        CubicBezierEasing cubicBezierEasing3 = EasingKt.b;
        e = MapsKt.f(pair, pair2, pair3, pair4, new Pair(numValueOf4, cubicBezierEasing3), new Pair(numValueOf2, cubicBezierEasing), new Pair(numValueOf3, cubicBezierEasing2), new Pair(numValueOf4, cubicBezierEasing3));
    }

    public static final Animator a(int i, Resources.Theme theme, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        XmlPullParserUtils_androidKt.b(xml);
        String name = xml.getName();
        if (Intrinsics.c(name, "set")) {
            return XmlAnimatorParser_androidKt.e(xml, resources, theme, attributeSetAsAttributeSet);
        }
        if (Intrinsics.c(name, "objectAnimator")) {
            return XmlAnimatorParser_androidKt.f(xml, resources, theme, attributeSetAsAttributeSet);
        }
        throw new XmlPullParserException("Unknown tag: " + xml.getName());
    }
}
