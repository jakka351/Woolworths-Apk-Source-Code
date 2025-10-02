package au.com.woolworths.design.core.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.compose.d;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemeForPreviewKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PreviewBackgroundColor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PreviewBackgroundColor previewBackgroundColor = PreviewBackgroundColor.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PreviewBackgroundColor previewBackgroundColor2 = PreviewBackgroundColor.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(PreviewBackgroundColor previewBackgroundColor, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(848588751);
        if (((i | 6) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            previewBackgroundColor = PreviewBackgroundColor.d;
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1277792526, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.ThemeForPreviewKt$EverydayThemeForPreview$1
                {
                    PreviewBackgroundColor previewBackgroundColor2 = PreviewBackgroundColor.d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ThemeForPreviewKt.b(PreviewBackgroundColor.d, composableLambdaImpl, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(previewBackgroundColor, i, 6, composableLambdaImpl);
        }
    }

    public static final void b(PreviewBackgroundColor previewBackgroundColor, Function2 function2, Composer composer, int i) {
        long j;
        Function2 function22;
        ComposerImpl composerImplV = composer.v(1955434410);
        if ((((composerImplV.r(previewBackgroundColor.ordinal()) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
        } else {
            int iOrdinal = previewBackgroundColor.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-2023198671);
                j = CoreTheme.b(composerImplV).e.f4848a.c;
                composerImplV.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(-2023195726);
                j = CoreTheme.b(composerImplV).e.f4848a.e;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw a.w(-2023202035, composerImplV, false);
                }
                composerImplV.o(-2023192559);
                j = CoreTheme.b(composerImplV).e.f4848a.b.f4851a;
                composerImplV.V(false);
            }
            function22 = function2;
            SurfaceKt.b(null, null, j, 0L, null, null, function22, composerImplV, 59);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(previewBackgroundColor, i, 7, function22);
        }
    }
}
