package au.com.woolworths.feature.product.list.legacy;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt;
import au.com.woolworths.product.composeui.ProductCardHorizontalUiKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoAdUnitComposeEpoxyModelKt {
    public static final void a(final ProductCard productCard, final ProductCardConfig productCardConfig, final ProductClickListener productClickListener, final List list, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(365339035);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(list) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1989377107, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.VideoAdUnitComposeEpoxyModelKt$VideoAdProductCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composer2, null);
                        final ProductCardConfig productCardConfig2 = productCardConfig;
                        boolean zIsInstoreMode = productCardConfig2.isInstoreMode();
                        boolean zIsInlineLabelEnabled = productCardConfig2.isInlineLabelEnabled();
                        boolean zIsWatchlistEnabled = productCardConfig2.isWatchlistEnabled();
                        List list2 = list;
                        final ProductCard productCard2 = productCard;
                        boolean zT = ProductCardExtKt.t(productCard2, list2);
                        composer2.o(-1633490746);
                        final ProductClickListener productClickListener2 = productClickListener;
                        boolean zI = composer2.I(productClickListener2) | composer2.I(productCard2);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI || objG == obj3) {
                            final int i3 = 0;
                            objG = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.b0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            productClickListener2.J1(productCard2, "");
                                            break;
                                        default:
                                            productClickListener2.g6(productCard2, "");
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierF = PaddingKt.f(ClickableKt.d(Modifier.Companion.d, false, null, null, (Function0) objG, 7), 16);
                        composer2.o(-1633490746);
                        boolean zI2 = composer2.I(productClickListener2) | composer2.I(productCard2);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == obj3) {
                            final int i4 = 1;
                            objG2 = new Function0() { // from class: au.com.woolworths.feature.product.list.legacy.b0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            productClickListener2.J1(productCard2, "");
                                            break;
                                        default:
                                            productClickListener2.g6(productCard2, "");
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        composer2.l();
                        ProductCardHorizontalUiKt.a(productCard2, zIsInlineLabelEnabled, true, modifierF, false, zIsWatchlistEnabled, zT, (Function0) objG2, false, false, zIsInstoreMode, false, false, false, null, null, null, ComposableLambdaKt.c(-842309855, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.VideoAdUnitComposeEpoxyModelKt$VideoAdProductCard$1.3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    boolean zIsInstoreMode2 = productCardConfig2.isInstoreMode();
                                    ProductCard productCard3 = productCard2;
                                    ProductCardButtonsHorizontalKt.b(productCard3, "", productClickListener2, ProductCardExtKt.i(productCard3, zIsInstoreMode2, false, false, 14), PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, 11), false, composer3, ProductCard.$stable | 24624, 32);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, ProductCard.$stable | KyberEngine.KyberPolyBytes, 12583296, 125712);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(i, 1, productCard, productCardConfig, productClickListener, list, false);
        }
    }
}
