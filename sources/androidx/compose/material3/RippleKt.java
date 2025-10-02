package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.PlatformRipple;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RippleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1479a = new StaticProvidableCompositionLocal(RippleKt$LocalUseFallbackRippleImplementation$1.h);
    public static final DynamicProvidableCompositionLocal b = new DynamicProvidableCompositionLocal(RippleKt$LocalRippleConfiguration$1.h);
    public static final RippleNodeFactory c;
    public static final RippleNodeFactory d;

    static {
        long j = Color.k;
        c = new RippleNodeFactory(true, Float.NaN, j);
        d = new RippleNodeFactory(false, Float.NaN, j);
    }

    public static final IndicationNodeFactory a(boolean z, float f, long j) {
        return (Dp.a(f, Float.NaN) && Color.c(j, Color.k)) ? z ? c : d : new RippleNodeFactory(z, f, j);
    }

    public static final Indication b(boolean z, float f, long j, Composer composer, int i, int i2) {
        Indication indicationA;
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = Color.k;
        }
        composer.o(-1280632857);
        if (((Boolean) composer.x(f1479a)).booleanValue()) {
            TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.f1390a;
            MutableState mutableStateL = SnapshotStateKt.l(new Color(j), composer);
            boolean z3 = (((i & 14) ^ 6) > 4 && composer.p(z)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !composer.q(f)) && (i & 48) != 32) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objG = composer.G();
            if (z4 || objG == Composer.Companion.f1624a) {
                objG = new PlatformRipple(z, f, mutableStateL);
                composer.A(objG);
            }
            indicationA = (PlatformRipple) objG;
        } else {
            indicationA = a(z, f, j);
        }
        composer.l();
        return indicationA;
    }
}
