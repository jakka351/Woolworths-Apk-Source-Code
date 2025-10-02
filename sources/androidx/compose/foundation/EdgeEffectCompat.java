package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EdgeEffectCompat {
    public static float a(EdgeEffect edgeEffect, float f, float f2, Density density) {
        float f3 = EdgeEffectCompat_androidKt.f833a;
        double d = density.getD() * 386.0878f * 160.0f * 0.84f;
        double d2 = EdgeEffectCompat_androidKt.f833a * d;
        if (((float) (Math.exp((EdgeEffectCompat_androidKt.b / EdgeEffectCompat_androidKt.c) * Math.log((Math.abs(f) * 0.35f) / d2)) * d2)) > c(edgeEffect) * f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        d(edgeEffect, MathKt.b(f));
        return f;
    }

    public static EdgeEffect b(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(context) : new GlowEdgeEffectCompat(context);
    }

    public static float c(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.b(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void d(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float e(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static void f(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof GlowEdgeEffectCompat)) {
            edgeEffect.onRelease();
            return;
        }
        GlowEdgeEffectCompat glowEdgeEffectCompat = (GlowEdgeEffectCompat) edgeEffect;
        float f2 = glowEdgeEffectCompat.b + f;
        glowEdgeEffectCompat.b = f2;
        if (Math.abs(f2) > glowEdgeEffectCompat.f835a) {
            glowEdgeEffectCompat.onRelease();
        }
    }
}
