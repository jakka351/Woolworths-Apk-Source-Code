package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLogoutItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.account.settings.v2.ui.ComposableSingletons$OptionItemUiKt$lambda$-2147270562$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OptionItemUiKt$lambda$2147270562$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OptionItemUiKt.a(new AccountHomeOptionLogoutItem("logout", "Log out", null, null, false), null, WxTheme.a(composer).g(), null, composer, 0, 10);
        }
        return Unit.f24250a;
    }
}
