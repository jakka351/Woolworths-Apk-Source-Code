package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSectionTitleKt {
    public static final void a(String str, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(352232454);
        int i2 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            float f = 16;
            composerImpl = composerImplV;
            TextKt.b(str, PaddingKt.i(SizeKt.e(BackgroundKt.b(Modifier.Companion.d, ToneColors.j, RectangleShapeKt.f1779a), 1.0f), f, 12, f, 8), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImpl, i2 & 14, 0, 65532);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(i, 0, str);
        }
    }
}
