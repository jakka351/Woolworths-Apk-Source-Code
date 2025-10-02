package au.com.woolworths.feature.shop.countryselector.ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.a;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/Region;", "region", "country-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OnboardingCountrySelectorScreenKt {
    public static final void a(final Region region, final Function1 onRegionSelected, final Function0 onContinueClicked, Function0 onBack, Composer composer, int i) {
        int i2;
        Intrinsics.h(onRegionSelected, "onRegionSelected");
        Intrinsics.h(onContinueClicked, "onContinueClicked");
        Intrinsics.h(onBack, "onBack");
        ComposerImpl composerImplV = composer.v(-176585273);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(region == null ? -1 : region.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRegionSelected) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onContinueClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onBack) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(PaddingKt.j(SizeKt.c, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.b(composerImplV), composerImplV).getB(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), null, null, null, 0L, null, ComposableLambdaKt.c(1773821204, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.ui.OnboardingCountrySelectorScreenKt$OnboardingCountrySelectorScreen$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        Modifier modifierH = PaddingKt.h(PaddingKt.e(companion, paddingValues), f, BitmapDescriptorFactory.HUE_RED, 2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        SpacerKt.a(72, composer2, 6);
                        boolean z = false;
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.wapple, 0, composer2), null, SizeKt.q(companion, 56), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        SpacerKt.a(f, composer2, 6);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(29);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(companion, true, (Function1) objG);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(8), horizontal, composer2, 6);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
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
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        TextKt.a(StringResources_androidKt.c(composer2, R.string.onboarding_country_selector_title), CoreTheme.f(composer2).c.f5127a.f5128a, TestTagKt.a(companion, "CountrySelectorTitleLabel"), CoreTheme.b(composer2).e.d.d, null, 0, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                        TextKt.a(StringResources_androidKt.c(composer2, R.string.onboarding_country_selector_subtitle), CoreTheme.f(composer2).e.f5133a.b, TestTagKt.a(companion, "CountrySelectorSubtitleLabel"), CoreTheme.b(composer2).e.d.b, null, 0, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                        composer2.f();
                        SpacerKt.a(24, composer2, 6);
                        Region region2 = region;
                        CountrySelectorUiKt.b(region2, onRegionSelected, null, composer2, 0, 4);
                        androidx.compose.foundation.layout.SpacerKt.a(composer2, ColumnScopeInstance.f948a.a(companion, 1.0f, true));
                        String strC = StringResources_androidKt.c(composer2, R.string.onboarding_country_selector_action_label);
                        if (region2 != null) {
                            z = true;
                        }
                        PrimaryButtonKt.a(strC, onContinueClicked, TestTagKt.a(PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, 1), "CountrySelectorContinueButton"), z, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 240);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582912, 126);
            composerImplV.o(5004770);
            boolean z = (i2 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new a(24, onBack);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG, composerImplV, 0, 1);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(i, 15, region, onRegionSelected, onContinueClicked, onBack, false);
        }
    }
}
