package au.com.woolworths.foundation.rewards.servicemessages.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/ui/ServiceMessageProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage;", "Companion", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServiceMessageProvider implements PreviewParameterProvider<RewardsServiceMessage> {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsServiceMessage f8656a;
    public static final RewardsServiceMessage b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/ui/ServiceMessageProvider$Companion;", "", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        InlineErrorType inlineErrorType = InlineErrorType.h;
        RewardsServiceMessage.ActionButton actionButton = new RewardsServiceMessage.ActionButton("Learn more", "https://www.woolworths.com.au/shop/discover/rewards/help/service-updates");
        RewardsServiceMessage.ScreenType screenType = RewardsServiceMessage.ScreenType.h;
        RewardsServiceMessage.ScreenType screenType2 = RewardsServiceMessage.ScreenType.g;
        RewardsServiceMessage.ScreenType screenType3 = RewardsServiceMessage.ScreenType.d;
        RewardsServiceMessage.ScreenType screenType4 = RewardsServiceMessage.ScreenType.e;
        RewardsServiceMessage.ScreenType screenType5 = RewardsServiceMessage.ScreenType.f;
        RewardsServiceMessage.ScreenType screenType6 = RewardsServiceMessage.ScreenType.i;
        List listR = CollectionsKt.R(screenType, screenType2, screenType3, screenType4, screenType5, screenType6);
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        Intrinsics.g(zonedDateTimeNow, "now(...)");
        ZonedDateTime zonedDateTimePlusHours = ZonedDateTime.now().plusHours(2L);
        Intrinsics.g(zonedDateTimePlusHours, "plusHours(...)");
        RewardsServiceMessage.OutageType outageType = RewardsServiceMessage.OutageType.d;
        Region region = Region.i;
        f8656a = new RewardsServiceMessage(inlineErrorType, "We’re currently doing some maintenance", "Sorry for the inconvenience. Please check back later.", actionButton, "icon-alert-triangle", listR, zonedDateTimeNow, zonedDateTimePlusHours, outageType, CollectionsKt.Q(region));
        InlineErrorType inlineErrorType2 = InlineErrorType.g;
        RewardsServiceMessage.ActionButton actionButton2 = new RewardsServiceMessage.ActionButton("Learn more", "https://www.woolworths.com.au/shop/discover/rewards/help/service-updates");
        List listR2 = CollectionsKt.R(screenType, screenType2, screenType3, screenType4, screenType5, screenType6);
        ZonedDateTime zonedDateTimeNow2 = ZonedDateTime.now();
        Intrinsics.g(zonedDateTimeNow2, "now(...)");
        ZonedDateTime zonedDateTimePlusHours2 = ZonedDateTime.now().plusHours(2L);
        Intrinsics.g(zonedDateTimePlusHours2, "plusHours(...)");
        b = new RewardsServiceMessage(inlineErrorType2, "We’re currently doing some maintenance", "Some features may be unavailable. Please check back later.", actionButton2, "icon-alert-triangle", listR2, zonedDateTimeNow2, zonedDateTimePlusHours2, RewardsServiceMessage.OutageType.e, CollectionsKt.Q(region));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
