package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.ExentsionsKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.composeui.ProductMultiBuyLabelKt;
import au.com.woolworths.product.composeui.ProductPriceKt;
import au.com.woolworths.product.composeui.ProductPromotionLabelKt;
import au.com.woolworths.product.composeui.ProductUnavailableLabelKt;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelKt;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelStyle;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionHeroCardKt {
    public static final void a(final ProductCard product, Function1 onClick, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(product, "product");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-491749537);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerImplV.n(product) : composerImplV.I(product) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            String strC = ExentsionsKt.c(product, (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = AspectRatioKt.a(companion, 2.5f);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strC);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zN || objG == obj) {
                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(strC, 2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            boolean z = true;
            Modifier modifierB = SemanticsModifierKt.b(modifierA, true, (Function1) objG);
            composerImplV.o(-1633490746);
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !composerImplV.I(product))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == obj) {
                objG2 = new au.com.woolworths.feature.product.list.compose.b(onClick, product, 3);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            CardKt.b((Function0) objG2, modifierB, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-829735111, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionHeroCardKt$PromotionHeroCard$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ProductCard productCard;
                    Unit unit;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue() & 3;
                    Unit unit2 = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit2;
                    }
                    composer2.o(1849434622);
                    Object objG3 = composer2.G();
                    if (objG3 == Composer.Companion.f1624a) {
                        objG3 = new b(2);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    Modifier.Companion companion2 = Modifier.Companion.d;
                    Modifier modifierF = PaddingKt.f(SemanticsModifierKt.b(companion2, false, (Function1) objG3), 16);
                    BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                    MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    Unit unit3 = null;
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
                    Updater.b(composer2, measurePolicyD, function2);
                    Function2 function22 = ComposeUiNode.Companion.f;
                    Updater.b(composer2, persistentCompositionLocalMapD, function22);
                    Function2 function23 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function23);
                    }
                    Function2 function24 = ComposeUiNode.Companion.d;
                    Updater.b(composer2, modifierD, function24);
                    Modifier modifierC = SizeKt.c(SizeKt.e(companion2, 0.35f), 1.0f);
                    Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                    int p2 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierC);
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
                    Updater.b(composer2, columnMeasurePolicyA, function2);
                    Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                        androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                    }
                    Updater.b(composer2, modifierD2, function24);
                    FillElement fillElement = SizeKt.c;
                    MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                    int p3 = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                    Modifier modifierD3 = ComposedModifierKt.d(composer2, fillElement);
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
                    Updater.b(composer2, measurePolicyD2, function2);
                    Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                        androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                    }
                    Updater.b(composer2, modifierD3, function24);
                    ProductCard productCard2 = product;
                    String productImage = productCard2.getProductImage();
                    Painter painterB = PromotionHeroCardKt.b(composer2);
                    Painter painterA = PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composer2);
                    BiasAlignment biasAlignment2 = Alignment.Companion.e;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
                    float f = 8;
                    Modifier modifierA2 = AspectRatioKt.a(PaddingKt.f(boxScopeInstance.g(companion2, biasAlignment2), f), 1.0f);
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.b;
                    ProductCard productCard3 = productCard2;
                    Composer composer3 = composer2;
                    SingletonAsyncImageKt.b(productImage, null, modifierA2, painterB, painterA, null, null, null, null, null, contentScale$Companion$Fit$1, null, composer3, 48, 6, 31712);
                    SingletonAsyncImageKt.b(productCard3.getBadgeImage(), null, AspectRatioKt.a(SizeKt.u(companion2, 42), 1.0f), PromotionHeroCardKt.b(composer3), null, null, null, null, null, null, contentScale$Companion$Fit$1, null, composer3, 432, 6, 31728);
                    BrandLabelKt.b(StringResources_androidKt.c(composer3, R.string.new_label), BrandLabelStyle.g, false, productCard3.isNew(), boxScopeInstance.g(companion2, Alignment.Companion.h), false, composer3, 432, 96);
                    composer3.f();
                    composer3.f();
                    Arrangement$SpaceEvenly$1 arrangement$SpaceEvenly$1 = Arrangement.f;
                    Modifier modifierG = boxScopeInstance.g(PaddingKt.j(SizeKt.c(SizeKt.e(companion2, 0.65f), 1.0f), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), Alignment.Companion.f);
                    ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$SpaceEvenly$1, horizontal, composer3, 6);
                    int p4 = composer3.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer3.d();
                    Modifier modifierD4 = ComposedModifierKt.d(composer3, modifierG);
                    if (composer3.w() == null) {
                        ComposablesKt.b();
                        throw null;
                    }
                    composer3.i();
                    if (composer3.getO()) {
                        composer3.K(function0);
                    } else {
                        composer3.e();
                    }
                    Updater.b(composer3, columnMeasurePolicyA2, function2);
                    Updater.b(composer3, persistentCompositionLocalMapD4, function22);
                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p4))) {
                        androidx.camera.core.impl.b.z(p4, composer3, p4, function23);
                    }
                    Updater.b(composer3, modifierD4, function24);
                    if (productCard3.isAvailable()) {
                        composer3.o(1748771402);
                        MultiBuyPriceInfo multiBuyPriceInfo = productCard3.getMultiBuyPriceInfo();
                        composer3.o(-636323279);
                        if (multiBuyPriceInfo == null) {
                            unit = null;
                            productCard = productCard3;
                        } else {
                            productCard = productCard3;
                            ProductMultiBuyLabelKt.a(productCard, null, true, null, composer3, ProductCard.$stable | KyberEngine.KyberPolyBytes, 10);
                            unit = unit2;
                        }
                        composer3.l();
                        if (unit == null) {
                            ProductPromotionLabelKt.a(productCard, null, false, false, false, composer3, ProductCard.$stable, 30);
                        }
                        composer3.l();
                        productCard3 = productCard;
                    } else {
                        composer3.o(1749139806);
                        ProductUnavailableLabelKt.a(productCard3, null, true, true, composer3, ProductCard.$stable | 27648, 6);
                        composer3.l();
                    }
                    ProductPriceKt.a(productCard3.getPrice(), productCard3.getTagLabel(), null, null, 0L, false, composer3, TagLabel.$stable << 3, 60);
                    MemberPriceInfo memberPriceInfo = productCard3.getMemberPriceInfo();
                    composer3.o(-636298781);
                    if (memberPriceInfo != null) {
                        ProductMemberPriceLabelKt.a(memberPriceInfo, null, ProductMemberPriceLabelStyling.d, composer3, MemberPriceInfo.$stable | KyberEngine.KyberPolyBytes, 2);
                        unit3 = unit2;
                    }
                    composer3.l();
                    composer3.o(-636299163);
                    if (unit3 == null) {
                        String wasPrice = productCard3.getWasPrice();
                        if (wasPrice == null) {
                            wasPrice = "";
                        }
                        TextKt.b(wasPrice, null, WxTheme.a(composer3).f(), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer3).r, composer3, 0, 3120, 55290);
                        composer3 = composer3;
                    }
                    composer3.l();
                    composer3.f();
                    composer3.f();
                    return unit2;
                }
            }, composerImplV), composerImpl, 805306368, 508);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 9, product, modifier2, onClick);
        }
    }

    public static final Painter b(Composer composer) {
        composer.o(713479998);
        Painter painterA = ((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue() ? PainterResources_androidKt.a(R.drawable.ic_wapple_flat, 0, composer) : null;
        composer.l();
        return painterA;
    }
}
