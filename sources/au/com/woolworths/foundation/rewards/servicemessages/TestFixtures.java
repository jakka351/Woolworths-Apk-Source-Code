package au.com.woolworths.foundation.rewards.servicemessages;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/servicemessages/TestFixtures;", "", "service-messages_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TestFixtures {
    static {
        InlineErrorType inlineErrorType = InlineErrorType.g;
        RewardsServiceMessage.ActionButton actionButton = new RewardsServiceMessage.ActionButton("Try again", "https://www.woolworthsrewards.com.au/maintenance");
        List listG0 = CollectionsKt.G0(RewardsServiceMessage.ScreenType.k);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(2020, 1, 12, 12, 30, 0, 0, ZoneId.of("Australia/Sydney"));
        Intrinsics.g(zonedDateTimeOf, "of(...)");
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(2099, 1, 12, 18, 0, 0, 0, ZoneId.of("Australia/Sydney"));
        Intrinsics.g(zonedDateTimeOf2, "of(...)");
        new RewardsServiceMessage(inlineErrorType, "General maintenance message", "We are experiencing a service outage. Our team is currently working to restore service. We apologise for the inconvenience caused.", actionButton, "coreIconName", listG0, zonedDateTimeOf, zonedDateTimeOf2, RewardsServiceMessage.OutageType.e, CollectionsKt.Q(Region.i));
    }
}
