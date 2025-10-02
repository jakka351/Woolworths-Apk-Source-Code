package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.DividerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-buy-again_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductTileSkeletonKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1656141594);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.merchcard.a(21);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 805306368, 511);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 12);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(352690129);
        int i2 = 1;
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1843341356);
            for (int i4 = 0; i4 < 3; i4++) {
                BoxKt.a(BackgroundKt.b(ClipKt.a(SizeKt.g(SizeKt.u(companion, 80), 28), RoundedCornerShapeKt.b(16)), CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a), composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.sdui.legacy.banner.designcoreadapter.a(i, i2, modifier);
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-518669869);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            modifier = Modifier.Companion.d;
            float f = 16;
            Modifier modifierI = PaddingKt.i(BreathingShimmerKt.a(modifier), f, 10, f, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            b(null, composerImplV, 0);
            SpacerKt.a(composerImplV, SizeKt.g(modifier, f));
            d(null, composerImplV, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.sdui.legacy.banner.designcoreadapter.a(i, 4, modifier);
        }
    }

    public static final void d(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(2067417254);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            BoxKt.a(BackgroundKt.b(ClipKt.a(SizeKt.g(SizeKt.u(companion, 64), 10), RoundedCornerShapeKt.b(16)), CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a), composerImplV, 0);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.sdui.legacy.banner.designcoreadapter.a(i, 2, modifier);
        }
    }

    public static final void e(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-833038873);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion.d;
            Modifier modifierA = BreathingShimmerKt.a(modifier2);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierF = PaddingKt.f(SizeKt.e(modifier2, 1.0f), 16);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierF);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            float f = 4;
            BoxKt.a(BackgroundKt.b(SizeKt.q(modifier2, 80), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f)), composerImplV, 0);
            float f2 = 24;
            Modifier modifierJ = PaddingKt.j(modifier2, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            float f3 = 10;
            BoxKt.a(BackgroundKt.b(SizeKt.r(modifier2, 122, f3), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f)), composerImplV, 0);
            float f4 = 12;
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, f4));
            BoxKt.a(BackgroundKt.b(SizeKt.r(modifier2, 109, f3), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f)), composerImplV, 0);
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, f4));
            BoxKt.a(BackgroundKt.b(SizeKt.r(modifier2, 60, f2), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f)), composerImplV, 0);
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, 27));
            BoxKt.a(BackgroundKt.b(SizeKt.r(modifier2, 147, 36), CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f)), composerImplV, 0);
            composerImplV.V(true);
            composerImplV.V(true);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 390, 0, CoreTheme.b(composerImplV).e.b.e, composerImplV, modifier2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.sdui.legacy.banner.designcoreadapter.a(i, 3, modifier2);
        }
    }
}
