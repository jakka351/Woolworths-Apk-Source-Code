package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.modifier.VisibilityModifierKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.RichTextMarkdownKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductPricingFootnoteLabelKt {
    public static final void a(ProductCard productCard, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Intrinsics.h(productCard, "productCard");
        ComposerImpl composerImplV = composer.v(-398642192);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            z2 = z;
        } else {
            z2 = i4 != 0 ? false : z;
            String pricingFootnoteMd = productCard.getPricingFootnoteMd();
            int i5 = i3 & 14;
            int i6 = i3 << 3;
            b(productCard, !(pricingFootnoteMd == null || StringsKt.D(pricingFootnoteMd)), modifier, z2, composerImplV, (i6 & 7168) | i5 | (i6 & 896));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(productCard, modifier, z2, i, i2, 1);
        }
    }

    public static final void b(ProductCard productCard, boolean z, Modifier modifier, boolean z2, Composer composer, int i) {
        int i2;
        Intrinsics.h(productCard, "productCard");
        ComposerImpl composerImplV = composer.v(-1733076148);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else if (z || z2) {
            String pricingFootnoteMd = productCard.getPricingFootnoteMd();
            if (pricingFootnoteMd == null) {
                pricingFootnoteMd = "";
            }
            TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImplV).r, WxTheme.a(composerImplV).c(), 0L, null, null, 0L, 0L, null, null, 0, 16744446);
            composerImplV.o(5004770);
            boolean z3 = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.design.wx.component.bottomsheet.c(z, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            RichTextMarkdownKt.b(pricingFootnoteMd, VisibilityModifierKt.a(modifier, (Function0) objG), textStyleA, false, composerImplV, 0, 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.closeaccount.ui.f(productCard, z, modifier, z2, i);
        }
    }
}
