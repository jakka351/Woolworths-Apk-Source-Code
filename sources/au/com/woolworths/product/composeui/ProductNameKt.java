package au.com.woolworths.product.composeui;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import au.com.woolworths.design.wx.component.text.InlineLabelSpec;
import au.com.woolworths.design.wx.component.text.InlineLabelTextKt;
import au.com.woolworths.design.wx.component.text.SpanPlacement;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductNameKt {
    public static final void a(InlineLabel inlineLabel, Modifier modifier, int i, Integer num, Composer composer, int i2) {
        InlineLabel inlineLabel2;
        int i3;
        ComposerImpl composerImpl;
        String string;
        ComposerImpl composerImplV = composer.v(516390865);
        if ((i2 & 6) == 0) {
            inlineLabel2 = inlineLabel;
            i3 = (composerImplV.I(inlineLabel2) ? 4 : 2) | i2;
        } else {
            inlineLabel2 = inlineLabel;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.r(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(num) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i2 & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            InlineLabelType f = inlineLabel2.getF();
            if (f == BrandedInlineLabel.d) {
                composerImplV.o(-772317667);
                Text d = inlineLabel2.getD();
                composerImplV.o(-1964573266);
                CharSequence text = d == null ? null : d.getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                composerImplV.V(false);
                String string2 = text != null ? text.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                Text e = inlineLabel2.getE();
                composerImplV.o(-1964569266);
                CharSequence text2 = e == null ? null : e.getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                composerImplV.V(false);
                string = text2 != null ? text2.toString() : null;
                String str = string == null ? "" : string;
                InlineLabelSpec inlineLabelSpec = InlineLabelSpec.Branded.f5149a;
                SpanPlacement[] spanPlacementArr = SpanPlacement.d;
                InlineLabelTextKt.a(inlineLabelSpec, string2, modifier, true, 0L, null, null, str, i, num, composerImplV, ((i3 << 6) & 7168) | 24960 | (1879048192 & (i3 << 21)), (i3 >> 9) & 14, BERTags.FLAGS);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                composerImpl = composerImplV;
                if (f == BrandedInlineLabel.e) {
                    composerImpl.o(-771703557);
                    Text d2 = inlineLabel2.getD();
                    composerImpl.o(-1964553458);
                    CharSequence text3 = d2 == null ? null : d2.getText((Context) composerImpl.x(AndroidCompositionLocals_androidKt.b));
                    composerImpl.V(false);
                    String string3 = text3 != null ? text3.toString() : null;
                    String str2 = string3 == null ? "" : string3;
                    Text e2 = inlineLabel2.getE();
                    composerImpl.o(-1964549458);
                    CharSequence text4 = e2 == null ? null : e2.getText((Context) composerImpl.x(AndroidCompositionLocals_androidKt.b));
                    composerImpl.V(false);
                    string = text4 != null ? text4.toString() : null;
                    String str3 = string == null ? "" : string;
                    InlineLabelSpec inlineLabelSpec2 = InlineLabelSpec.Branded.b;
                    SpanPlacement[] spanPlacementArr2 = SpanPlacement.d;
                    InlineLabelTextKt.a(inlineLabelSpec2, str2, modifier, false, 0L, null, null, str3, i, num, composerImpl, ((i3 << 6) & 7168) | 24960 | ((i3 << 21) & 1879048192), (i3 >> 9) & 14, BERTags.FLAGS);
                    composerImpl.V(false);
                } else {
                    composerImpl.o(-771153679);
                    composerImpl.V(false);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(inlineLabel2, modifier, i, num, i2);
        }
    }

    public static final void b(ProductCard productCard, boolean z, Modifier modifier, int i, Integer num, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Integer num2;
        Intrinsics.h(productCard, "productCard");
        ComposerImpl composerImplV = composer.v(1363647587);
        if ((i2 & 6) == 0) {
            i4 = (composerImplV.I(productCard) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.p(z) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= KyberEngine.KyberPolyBytes;
        } else if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerImplV.r(i)) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerImplV.n(num) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            num2 = num;
            i5 = i;
            modifier2 = modifier;
        } else {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                if (i6 != 0) {
                    modifier = Modifier.Companion.d;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i = 3;
                }
                if (i7 != 0) {
                    num = 2;
                }
            } else {
                composerImplV.j();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
            }
            Modifier modifier3 = modifier;
            int i8 = i;
            composerImplV.W();
            Integer num3 = num;
            a(ProductCardExtKt.f(productCard, z), modifier3, i8, num3, composerImplV, (i4 >> 3) & 8176);
            modifier2 = modifier3;
            i5 = i8;
            num2 = num3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.video.advertising.ui.d(productCard, z, modifier2, i5, num2, i2, i3);
        }
    }
}
