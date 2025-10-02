package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/ui/FinalGlanceFeedProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/ui/FinalGlanceFeedProviderItem;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinalGlanceFeedProvider implements PreviewParameterProvider<FinalGlanceFeedProviderItem> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/ui/FinalGlanceFeedProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CollectionsKt.R(new EverydayExtrasFinalGlanceContentItem.TitleTextItem("One final glance over everything"), new EverydayExtrasFinalGlanceContentItem.TimelineBreakdown(CollectionsKt.R(new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("Today", "Start 30-day free trial of Everyday Extra", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_green_tick.png", "Today Start 30-day free trial of Everyday Extra"), new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("7 days before the trial ends", "We'll send you a reminder email", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_info_circle.png", "7 days before the trial ends We'll send you a reminder email"), new EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem("Day 30", "Your free trial ends on 14 December 2023. Add payment details any time during trial", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/everyday_extra/signup/edx_signup_extra_perks.png", "Day 30 Your free trial ends on 14 December 2023. Add payment details any time during trial"))), new EverydayExtrasFinalGlanceContentItem.NoteTextItem("By continuing you accept the terms and conditions"), new EverydayExtrasFinalGlanceContentItem.Button("Start 30 day free trial", EverydayExtrasButtonActionType.d, null, EverydayExtrasButtonStyle.d), new EverydayExtrasFinalGlanceContentItem.Button("Cancel", EverydayExtrasButtonActionType.e, null, EverydayExtrasButtonStyle.e));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
