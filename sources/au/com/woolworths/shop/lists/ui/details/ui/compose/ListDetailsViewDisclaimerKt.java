package au.com.woolworths.shop.lists.ui.details.ui.compose;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalDisclaimer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListDetailsViewDisclaimerKt {
    public static final void a(ListDetailsTotalDisclaimer disclaimer, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(disclaimer, "disclaimer");
        ComposerImpl composerImplV = composer.v(1283941960);
        int i2 = i | (composerImplV.n(disclaimer) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            TextKt.b(disclaimer.f12311a, modifier, ToneColors.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).r, composerImpl, i2 & 112, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(disclaimer, i, 0, modifier);
        }
    }
}
