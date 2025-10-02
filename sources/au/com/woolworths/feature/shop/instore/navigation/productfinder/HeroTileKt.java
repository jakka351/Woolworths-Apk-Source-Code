package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HeroTileKt {
    public static final void a(final int i, int i2, Composer composer, final Modifier modifier, final String title, final String description, final Function0 onClick) {
        int i3;
        Intrinsics.h(onClick, "onClick");
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        ComposerImpl composerImplV = composer.v(-153444758);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(title) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(description) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(225162894, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.HeroTileKt$HeroTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(BackgroundKt.b(ClickableKt.d(modifier, false, null, null, onClick, 7), CoreTheme.b(composer2).e.f4848a.e, RoundedCornerShapeKt.b(f)), f);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceBetween$1, horizontal, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        Painter painterA = PainterResources_androidKt.a(i, 0, composer2);
                        Modifier.Companion companion = Modifier.Companion.d;
                        ImageKt.a(painterA, "", companion, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        SpacerKt.a(composer2, SizeKt.g(companion, 8));
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.i(6, Alignment.Companion.j), horizontal, composer2, 54);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        TextKt.a(title, CoreTheme.f(composer2).d.c.b, null, CoreTheme.b(composer2).e.d.d, null, 0, 2, false, 2, null, composer2, 102236160, 692);
                        TextKt.a(description, CoreTheme.f(composer2).f5120a.c.b, null, CoreTheme.b(composer2).e.d.d, null, 0, 2, false, 2, null, composer2, 102236160, 692);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, onClick, title, description, modifier, i2);
        }
    }
}
