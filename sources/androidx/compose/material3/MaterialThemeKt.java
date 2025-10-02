package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    static {
        new StaticProvidableCompositionLocal(MaterialThemeKt$LocalUsingExpressiveTheme$1.h);
    }

    public static final void a(ColorScheme colorScheme, Shapes shapes, Typography typography, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        ColorScheme colorSchemeA;
        int i3;
        final Shapes shapes2;
        final Typography typographyB;
        Shapes shapes3;
        ComposerImpl composerImplV = composer.v(-2127166334);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colorSchemeA = colorScheme;
                int i4 = composerImplV.n(colorSchemeA) ? 4 : 2;
                i3 = i4 | i;
            } else {
                colorSchemeA = colorScheme;
            }
            i3 = i4 | i;
        } else {
            colorSchemeA = colorScheme;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shapes2 = shapes;
                int i5 = composerImplV.n(shapes2) ? 32 : 16;
                i3 |= i5;
            } else {
                shapes2 = shapes;
            }
            i3 |= i5;
        } else {
            shapes2 = shapes;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                typographyB = typography;
                int i6 = composerImplV.n(typographyB) ? 256 : 128;
                i3 |= i6;
            } else {
                typographyB = typography;
            }
            i3 |= i6;
        } else {
            typographyB = typography;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i2 & 1) != 0) {
                    colorSchemeA = MaterialTheme.a(composerImplV);
                }
                shapes3 = (i2 & 2) != 0 ? (Shapes) composerImplV.x(ShapesKt.f1493a) : shapes2;
                if ((i2 & 4) != 0) {
                    typographyB = MaterialTheme.b(composerImplV);
                }
            } else {
                composerImplV.j();
                shapes3 = shapes2;
            }
            composerImplV.W();
            Indication indicationB = RippleKt.b(false, BitmapDescriptorFactory.HUE_RED, 0L, composerImplV, 0, 7);
            long j = colorSchemeA.f1413a;
            boolean zS = composerImplV.s(j);
            Object objG = composerImplV.G();
            if (zS || objG == Composer.Companion.f1624a) {
                objG = new TextSelectionColors(j, Color.b(j, 0.4f));
                composerImplV.A(objG);
            }
            CompositionLocalKt.b(new ProvidedValue[]{ColorSchemeKt.f1414a.b(colorSchemeA), IndicationKt.f838a.b(indicationB), RippleThemeKt.f1391a.b(CompatRippleTheme.f1415a), ShapesKt.f1493a.b(shapes3), TextSelectionColorsKt.f1228a.b((TextSelectionColors) objG), TypographyKt.f1530a.b(typographyB)}, ComposableLambdaKt.c(-1066563262, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.a(typographyB.j, composableLambdaImpl, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            shapes2 = shapes3;
        }
        final ColorScheme colorScheme2 = colorSchemeA;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    MaterialThemeKt.a(colorScheme2, shapes2, typographyB, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
