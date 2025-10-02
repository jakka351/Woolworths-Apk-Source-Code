package au.com.woolworths.shop.lists.ui.guest.onboarding;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopListGuestOnboardingScreenKt {
    public static final void a(final int i, final int i2, final int i3, final int i4, final Function0 loginClick, final Function0 signUpClick, final Function0 onNavigateUp, Composer composer, final int i5) {
        ComposerImpl composerImpl;
        Intrinsics.h(loginClick, "loginClick");
        Intrinsics.h(signUpClick, "signUpClick");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-912106423);
        int i6 = (composerImplV.r(i) ? 4 : 2) | i5 | (composerImplV.r(i2) ? 32 : 16) | (composerImplV.r(i3) ? 256 : 128) | (composerImplV.r(i4) ? 2048 : 1024);
        if ((i5 & 24576) == 0) {
            i6 |= composerImplV.I(loginClick) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= composerImplV.I(signUpClick) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= composerImplV.I(onNavigateUp) ? 1048576 : 524288;
        }
        if ((i6 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-715195891, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingScreenKt$ShopListGuestOnboardingScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, i);
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-1898897409, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingScreenKt$ShopListGuestOnboardingScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, "Back", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-136526570, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingScreenKt$ShopListGuestOnboardingScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier modifierH = PaddingKt.h(SizeKt.c, f, BitmapDescriptorFactory.HUE_RED, 2);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composer2, 54);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier.Companion companion = Modifier.Companion.d;
                        ImageKt.a(PainterResources_androidKt.a(i2, 0, composer2), null, PaddingKt.g(SizeKt.e(companion, 1.0f), 24, f), null, ContentScale.Companion.d, BitmapDescriptorFactory.HUE_RED, null, composer2, 25008, 104);
                        TextKt.b(StringResources_androidKt.c(composer2, i3), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).i, composer2, 48, 0, 65020);
                        TextKt.b(StringResources_androidKt.c(composer2, i4), PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f, 1), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer2).n, 0L, 0L, null, null, 0L, TextUnitKt.c(18), null, null, 0, 16646143), composer2, 48, 0, 65020);
                        PrimaryButtonKt.a(StringResources_androidKt.c(composer2, R.string.login), loginClick, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 248);
                        SecondaryButtonKt.a(StringResources_androidKt.c(composer2, R.string.signup), signUpClick, SizeKt.e(companion, 1.0f), false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 248);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.lists.ui.guest.onboarding.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ShopListGuestOnboardingScreenKt.a(i, i2, i3, i4, loginClick, signUpClick, onNavigateUp, (Composer) obj, RecomposeScopeImplKt.a(i5 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
