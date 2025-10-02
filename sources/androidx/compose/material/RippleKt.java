package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1315a = new DynamicProvidableCompositionLocal(RippleKt$LocalRippleConfiguration$1.h);
    public static final RippleNodeFactory b;
    public static final RippleNodeFactory c;
    public static final RippleAlpha d;
    public static final RippleAlpha e;
    public static final RippleAlpha f;

    static {
        long j = Color.k;
        b = new RippleNodeFactory(true, Float.NaN, j);
        c = new RippleNodeFactory(false, Float.NaN, j);
        d = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        e = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        f = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final IndicationNodeFactory a(boolean z, float f2, long j) {
        return (Dp.a(f2, Float.NaN) && Color.c(j, Color.k)) ? z ? b : c : new RippleNodeFactory(z, f2, j);
    }

    public static IndicationNodeFactory b(float f2, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = Color.k;
        }
        return a(z, f2, j);
    }
}
