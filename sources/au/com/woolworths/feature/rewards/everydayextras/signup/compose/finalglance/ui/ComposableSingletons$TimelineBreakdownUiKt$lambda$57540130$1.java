package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.ComposableSingletons$TimelineBreakdownUiKt$lambda$-57540130$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$TimelineBreakdownUiKt$lambda$57540130$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TimelineBreakdownUiKt.a(CollectionsKt.R(new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("Today", "Start 30-day free trial of Everyday Extra", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_green_tick.png", "Today Start 30-day free trial of Everyday Extra"), new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("7 days before the trial ends", "We'll send you a reminder email", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_info_circle.png", "7 days before the trial ends We'll send you a reminder email"), new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("Day 30", "Your free trial ends on 14 December 2023. Add payment details any time during trial", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_extra_perks.png", "Day 30 Your free trial ends on 14 December 2023. Add payment details any time during trial")), composer, 0);
        }
        return Unit.f24250a;
    }
}
