package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscounts;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutRewardsAndDiscountsUiKt {
    public static final void a(CheckoutRewardsAndDiscount checkoutRewardsAndDiscount, boolean z, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1028498930);
        int i2 = (composerImplV.I(checkoutRewardsAndDiscount) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (checkoutRewardsAndDiscount instanceof CheckoutRewardsAndDiscount.CheckoutRewards) {
            composerImplV.o(545003063);
            CheckoutRewardsUiKt.a((CheckoutRewardsAndDiscount.CheckoutRewards) checkoutRewardsAndDiscount, z, function0, composerImplV, i2 & 1008);
            composerImplV.V(false);
        } else if (checkoutRewardsAndDiscount instanceof CheckoutRewardsAndDiscount.PromoCode) {
            composerImplV.o(545011453);
            CheckoutPromoCodeUiKt.a((CheckoutRewardsAndDiscount.PromoCode) checkoutRewardsAndDiscount, z, function0, composerImplV, i2 & 1008);
            composerImplV.V(false);
        } else {
            if (!(checkoutRewardsAndDiscount instanceof CheckoutRewardsAndDiscount.StoreCredit)) {
                throw au.com.woolworths.android.onesite.a.w(545000601, composerImplV, false);
            }
            composerImplV.o(545020094);
            CheckoutStoreCreditUiKt.a((CheckoutRewardsAndDiscount.StoreCredit) checkoutRewardsAndDiscount, z, function0, composerImplV, i2 & 1008);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(checkoutRewardsAndDiscount, z, function0, i, 9);
        }
    }

    public static final void b(final CheckoutRewardsAndDiscounts checkoutRewardsAndDiscounts, final Function1 onClickRewardsAndDiscountTile, Composer composer, int i) {
        Intrinsics.h(onClickRewardsAndDiscountTile, "onClickRewardsAndDiscountTile");
        ComposerImpl composerImplV = composer.v(1430495907);
        if ((((composerImplV.I(checkoutRewardsAndDiscounts) ? 4 : 2) | i | (composerImplV.I(onClickRewardsAndDiscountTile) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1237012645, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.CheckoutRewardsAndDiscountsUiKt$CheckoutRewardsAndDiscountsUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        final CheckoutRewardsAndDiscounts checkoutRewardsAndDiscounts2 = checkoutRewardsAndDiscounts;
                        CheckoutSectionTitleKt.a(checkoutRewardsAndDiscounts2.f10582a, composer2, 0);
                        final Function1 function1 = onClickRewardsAndDiscountTile;
                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-212363659, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.CheckoutRewardsAndDiscountsUiKt$CheckoutRewardsAndDiscountsUi$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ArrayList arrayList = checkoutRewardsAndDiscounts2.b;
                                    int i2 = 0;
                                    for (Object obj5 : arrayList) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        CheckoutRewardsAndDiscount checkoutRewardsAndDiscount = (CheckoutRewardsAndDiscount) obj5;
                                        boolean z = i2 < CollectionsKt.I(arrayList);
                                        composer3.o(-1633490746);
                                        Function1 function12 = function1;
                                        boolean zN = composer3.n(function12) | composer3.I(checkoutRewardsAndDiscount);
                                        Object objG = composer3.G();
                                        if (zN || objG == Composer.Companion.f1624a) {
                                            objG = new au.com.woolworths.sdui.common.alert.a(24, function12, checkoutRewardsAndDiscount);
                                            composer3.A(objG);
                                        }
                                        composer3.l();
                                        CheckoutRewardsAndDiscountsUiKt.a(checkoutRewardsAndDiscount, z, (Function0) objG, composer3, 0);
                                        i2 = i3;
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(checkoutRewardsAndDiscounts, i, 19, onClickRewardsAndDiscountTile);
        }
    }
}
