package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AppVersionItemUiKt {
    public static final void a(AccountSettingsAppVersionData accountSettingsAppVersionData, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ComposerImpl composerImpl;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(1040847387);
        int i4 = i | (composerImplV.n(accountSettingsAppVersionData) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            float f = 16;
            composerImpl = composerImplV;
            TextKt.b(StringResources_androidKt.b(R.string.app_version, new Object[]{Integer.valueOf(accountSettingsAppVersionData.f5714a), accountSettingsAppVersionData.b, accountSettingsAppVersionData.c}, composerImplV), PaddingKt.i(SizeKt.e(modifier4, 1.0f), f, 12, f, WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV).getD()), WxTheme.a(composerImplV).d(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImpl, 0, 0, 65528);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(accountSettingsAppVersionData, modifier3, i, i2, 8);
        }
    }
}
