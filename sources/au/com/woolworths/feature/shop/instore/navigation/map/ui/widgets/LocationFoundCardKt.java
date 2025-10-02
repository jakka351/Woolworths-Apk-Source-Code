package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationFoundCardKt {
    public static final void a(int i, Composer composer, final Modifier modifier, final Function0 onInfoClick) {
        int i2;
        Intrinsics.h(onInfoClick, "onInfoClick");
        ComposerImpl composerImplV = composer.v(1183600863);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onInfoClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final String strC = StringResources_androidKt.c(composerImplV, R.string.location_found_description);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(35536187, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.LocationFoundCardKt$LocationFoundCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                        float f = 8;
                        Modifier modifierB = BackgroundKt.b(modifier, CoreTheme.b(composer2).f4782a.f4783a.b.b, RoundedCornerShapeKt.d(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12));
                        composer2.o(5004770);
                        Function0 function0 = onInfoClick;
                        boolean zN = composer2.n(function0);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zN || objG == obj3) {
                            objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(16, function0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierD = ClickableKt.d(modifierB, false, null, null, (Function0) objG, 7);
                        composer2.o(5004770);
                        String str = strC;
                        boolean zN2 = composer2.n(str);
                        Object objG2 = composer2.G();
                        if (zN2 || objG2 == obj3) {
                            objG2 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str, 9);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        Modifier modifierA = SemanticsModifierKt.a(modifierD, (Function1) objG2);
                        float f2 = 16;
                        Modifier modifierH = PaddingKt.h(modifierA, BitmapDescriptorFactory.HUE_RED, f2, 1);
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$SpaceBetween$1, vertical, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierH);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD2, function24);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierH2 = PaddingKt.h(companion, f2, BitmapDescriptorFactory.HUE_RED, 2);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierH2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        IconKt.a(PainterResources_androidKt.a(R.drawable.ic_tick_circle, 0, composer2), null, null, CoreTheme.b(composer2).e.f4848a.f4849a.c, composer2, 48, 4);
                        SpacerKt.a(composer2, SizeKt.u(companion, f));
                        String strC2 = StringResources_androidKt.c(composer2, R.string.location_found_label);
                        TextStyle textStyle = CoreTheme.f(composer2).f5120a.b.c;
                        long j = Color.f;
                        TextStyle textStyleA = TextStyle.a(textStyle, j, 0L, null, null, 0L, 0L, null, null, 0, 16777214);
                        composer2.o(1849434622);
                        Object objG3 = composer2.G();
                        if (objG3 == obj3) {
                            objG3 = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d(21);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        TextKt.a(strC2, textStyleA, SemanticsModifierKt.a(companion, (Function1) objG3), 0L, null, 0, 0, false, 0, null, composer2, 0, 1016);
                        composer2.f();
                        Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 20, BitmapDescriptorFactory.HUE_RED, 11);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierJ);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD4, function24);
                        IconKt.a(PainterResources_androidKt.a(R.drawable.ic_question_circle, 0, composer2), null, null, Color.b(j, 0.8f), composer2, 3120, 4);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(onInfoClick, modifier, i, 3);
        }
    }
}
