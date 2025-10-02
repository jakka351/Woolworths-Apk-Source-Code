package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/ui/SampleMessageRowDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/inbox/ui/SampleMessageRowData;", "Companion", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SampleMessageRowDataProvider implements PreviewParameterProvider<SampleMessageRowData> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/ui/SampleMessageRowDataProvider$Companion;", "", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        InboxMessage.Cta cta = new InboxMessage.Cta("Open", "url");
        InboxMessage.Category category = InboxMessage.Category.g;
        InboxMessage.TermsAndConditions termsAndConditions = new InboxMessage.TermsAndConditions("View T&Cs", "content");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(0L);
        Intrinsics.g(instantOfEpochMilli, "ofEpochMilli(...)");
        InboxMessage inboxMessage = new InboxMessage("1", "campaignCode", null, "title", "body", cta, category, termsAndConditions, instantOfEpochMilli, false, true);
        new NotificationItem(inboxMessage, "30 MINUTES AGO");
        new NotificationItem(InboxMessage.a(inboxMessage, 2015), "3 DAYS AGO");
        new NotificationItem(InboxMessage.a(inboxMessage, 1919), "18 AUG 2022");
        new NotificationItem(InboxMessage.a(inboxMessage, 1887), "18 AUG 2022");
        new NotificationItem(InboxMessage.a(inboxMessage, 1983), "18 AUG 2022");
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
