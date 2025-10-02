package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListHeaderItemKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-880938990);
        if ((((composerImplV.r(i) ? 4 : 2) | i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            String strC = StringResources_androidKt.c(composerImplV, i);
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierI = PaddingKt.i(SizeKt.e(companion, 1.0f), f, 20, f, 8);
            TextStyle textStyle = WxTheme.b(composerImplV).k;
            composerImpl = composerImplV;
            modifier2 = companion;
            TextKt.b(strC, modifierI, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImpl, 0, 0, 65532);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.recipes.details.ui.a(i, modifier2, i2, 7);
        }
    }
}
