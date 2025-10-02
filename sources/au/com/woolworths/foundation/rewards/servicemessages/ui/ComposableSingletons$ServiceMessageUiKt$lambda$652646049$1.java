package au.com.woolworths.foundation.rewards.servicemessages.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ServiceMessageUiKt$lambda$652646049$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsServiceMessage.ActionButton actionButton = new RewardsServiceMessage.ActionButton("Try again 2", "www.google.com");
            InlineErrorType inlineErrorType = InlineErrorType.g;
            ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
            Intrinsics.g(zonedDateTimeNow, "now(...)");
            ZonedDateTime zonedDateTimeNow2 = ZonedDateTime.now();
            Intrinsics.g(zonedDateTimeNow2, "now(...)");
            RewardsServiceMessage.OutageType outageType = RewardsServiceMessage.OutageType.d;
            EmptyList emptyList = EmptyList.d;
            ServiceMessageUiKt.a(new RewardsServiceMessage(inlineErrorType, "General maintenance message", "We are experiencing a service outage. Our team is currently working to restore service. We apologise for the inconvenience caused.", actionButton, "testCoreIconName", emptyList, zonedDateTimeNow, zonedDateTimeNow2, outageType, emptyList), null, null, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
