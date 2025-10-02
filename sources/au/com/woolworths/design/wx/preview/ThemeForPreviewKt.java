package au.com.woolworths.design.wx.preview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.compose.d;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
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
        ComposerImpl composerImplV = composer.v(1433744490);
        if (((i | 6) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            previewBackgroundColor = PreviewBackgroundColor.d;
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-1703113161, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.preview.ThemeForPreviewKt$RewardsThemeForPreview$1
                {
                    PreviewBackgroundColor previewBackgroundColor2 = PreviewBackgroundColor.d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        PreviewBackgroundColor previewBackgroundColor2 = PreviewBackgroundColor.d;
                        ThemeForPreviewKt.c(0, composer2, composableLambdaImpl);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(previewBackgroundColor, i, 10, composableLambdaImpl);
        }
    }

    public static final void b(PreviewBackgroundColor previewBackgroundColor, final Function2 content, Composer composer, int i) {
        Intrinsics.h(content, "content");
        ComposerImpl composerImplV = composer.v(316560572);
        if (((i | 6) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            previewBackgroundColor = PreviewBackgroundColor.d;
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1979274500, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.preview.ThemeForPreviewKt$ShopThemeForPreview$1
                {
                    PreviewBackgroundColor previewBackgroundColor2 = PreviewBackgroundColor.d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        PreviewBackgroundColor previewBackgroundColor2 = PreviewBackgroundColor.d;
                        ThemeForPreviewKt.c(0, composer2, content);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(previewBackgroundColor, i, 9, content);
        }
    }

    public static final void c(int i, Composer composer, Function2 function2) {
        Function2 function22;
        PreviewBackgroundColor previewBackgroundColor = PreviewBackgroundColor.d;
        ComposerImpl composerImplV = composer.v(-928236298);
        int i2 = (composerImplV.r(0) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
        } else {
            function22 = function2;
            SurfaceKt.a(null, null, ToneColors.k, 0L, null, BitmapDescriptorFactory.HUE_RED, function22, composerImplV, (i2 << 15) & 3670016, 59);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, function22);
        }
    }
}
