package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.ComposableSingletons$TimelineBreakdownUiKt$lambda$-395132497$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$TimelineBreakdownUiKt$lambda$395132497$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TimelineBreakdownUiKt.b(new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("7 days before the trial ends", "We'll send you a reminder email", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_info_circle.png", "7 days before the trial ends"), true, null, composer, 48);
        }
        return Unit.f24250a;
    }
}
