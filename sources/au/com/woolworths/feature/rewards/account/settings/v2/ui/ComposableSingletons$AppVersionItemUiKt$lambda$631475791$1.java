package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.account.settings.v2.ui.ComposableSingletons$AppVersionItemUiKt$lambda$-631475791$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$AppVersionItemUiKt$lambda$631475791$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            AppVersionItemUiKt.a(new AccountSettingsAppVersionData(2023, "4.2.0", " (9001)"), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
