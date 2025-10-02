package au.com.woolworths.design.core.ui.foundation.color;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.lifecycle.compose.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreThemeColorsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f4871a = new StaticProvidableCompositionLocal(new d(3));
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(new d(4));
    public static final StaticProvidableCompositionLocal c = new StaticProvidableCompositionLocal(new d(5));

    public static final void a(final CoreColors coreColors, final ExtendedColors extendedColors, final BrandColors brandColors, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Intrinsics.h(coreColors, "coreColors");
        Intrinsics.h(extendedColors, "extendedColors");
        Intrinsics.h(brandColors, "brandColors");
        ComposerImpl composerImplV = composer.v(2077931331);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(coreColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.b(new ProvidedValue[]{f4871a.b(coreColors), b.b(extendedColors), c.b(brandColors), b.g(coreColors.e.d.d, ContentColorKt.f4780a)}, composableLambdaImpl, composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.foundation.color.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    CoreThemeColorsKt.a(coreColors, extendedColors, brandColors, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
