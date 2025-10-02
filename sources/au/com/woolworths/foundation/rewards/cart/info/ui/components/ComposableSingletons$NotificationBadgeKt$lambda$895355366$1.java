package au.com.woolworths.foundation.rewards.cart.info.ui.components;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$NotificationBadgeKt$lambda$895355366$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            NotificationBadgeKt.a("5", "5", WxTheme.a(composer).h(), WxTheme.a(composer).h(), null, WxTheme.a(composer).a(), composer, 54, 16);
        }
        return Unit.f24250a;
    }
}
