package au.com.woolworths.shop.product.details.ui.productscarousel;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.contentpage.ui.d;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.composeui.ProductInfoGridKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardTileKt {
    public static final void a(final ProductCard productCard, final String str, final ProductClickListener productClickListener, final boolean z, final SharedIntrinsicHeightState sharedIntrinsicHeightState, final boolean z2, final boolean z3, final boolean z4, Modifier modifier, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(sharedIntrinsicHeightState, "sharedIntrinsicHeightState");
        ComposerImpl composerImplV = composer.v(1053455646);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(sharedIntrinsicHeightState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.p(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.p(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.p(z4) ? 8388608 : 4194304;
        }
        if (((i2 | 100663296) & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1759789414, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.ProductCardTileKt$ProductCardTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductMultiBuyLabel productMultiBuyLabel = ProductMultiBuyLabel.h;
                        int i3 = ProductCard.$stable;
                        final ProductCard productCard2 = productCard;
                        ProductCardExtKt.n(productCard2, productMultiBuyLabel, z, composer2);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (objG == obj3) {
                            objG = new au.com.woolworths.shop.product.details.ui.a(12);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG);
                        composer2.o(-1746271574);
                        final ProductClickListener productClickListener2 = productClickListener;
                        boolean zI = composer2.I(productClickListener2);
                        String str2 = str;
                        boolean zN = zI | composer2.n(str2) | composer2.I(productCard2);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == obj3) {
                            objG2 = new d(productClickListener2, str2, productCard2, 17);
                            composer2.A(objG2);
                        }
                        Function0 function0 = (Function0) objG2;
                        composer2.l();
                        final boolean z5 = z4;
                        final boolean z6 = z;
                        final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                        final String str3 = str;
                        final boolean z7 = z2;
                        final boolean z8 = z3;
                        CardKt.b(function0, modifierB, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-767142592, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.ProductCardTileKt$ProductCardTile$1.3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    float f = 4;
                                    Modifier modifierI = PaddingKt.i(SizeKt.o(companion, 160), f, 12, f, 16);
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composer3, 54);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierI);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function02 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function02);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    Modifier modifierA = SharedIntrinsicHeightModifierKt.a(companion, sharedIntrinsicHeightState2);
                                    composer3.o(-1746271574);
                                    ProductClickListener productClickListener3 = productClickListener2;
                                    boolean zI2 = composer3.I(productClickListener3);
                                    String str4 = str3;
                                    boolean zN2 = zI2 | composer3.n(str4);
                                    ProductCard productCard3 = productCard2;
                                    boolean zI3 = zN2 | composer3.I(productCard3);
                                    Object objG3 = composer3.G();
                                    if (zI3 || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new d(productClickListener3, str4, productCard3, 18);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    int i4 = ProductCard.$stable;
                                    ProductInfoGridKt.a(productCard3, true, modifierA, z7, z8, (Function0) objG3, false, false, true, true, true, false, null, false, null, false, false, null, z5, composer3, i4 | 920125488, 54, 258048);
                                    ProductCardButtonsVerticalKt.b(productCard3, str4, productClickListener3, ProductCardExtKt.i(productCard3, z6, false, false, 12), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composer3, i4 | 24576, 0);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 508);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Modifier modifier3 = modifier2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductCardTileKt.a(productCard, str, productClickListener, z, sharedIntrinsicHeightState, z2, z3, z4, modifier3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
