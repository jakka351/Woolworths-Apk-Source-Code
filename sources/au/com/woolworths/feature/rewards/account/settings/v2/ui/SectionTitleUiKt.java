package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.WxTheme;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionTitleUiKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str) {
        int i3;
        Modifier modifier2;
        int i4;
        ComposerImpl composerImpl;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(-46965695);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (composerImplV.n(modifier2) ? 32 : 16);
        }
        if ((i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            float f = 16;
            composerImpl = composerImplV;
            TextKt.b(upperCase, PaddingKt.i(SizeKt.e(modifier4, 1.0f), f, 20, f, 12), WxTheme.a(composerImplV).d(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).s, composerImpl, 0, 0, 65528);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.f(str, modifier3, i, i2, 2);
        }
    }
}
