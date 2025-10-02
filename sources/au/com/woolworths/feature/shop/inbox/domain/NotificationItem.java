package au.com.woolworths.feature.shop.inbox.domain;

import androidx.compose.runtime.Immutable;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/NotificationItem;", "", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationItem {

    /* renamed from: a, reason: collision with root package name */
    public final InboxMessage f7288a;
    public final String b;

    public NotificationItem(InboxMessage inboxMessage, String displayTime) {
        Intrinsics.h(displayTime, "displayTime");
        this.f7288a = inboxMessage;
        this.b = displayTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationItem)) {
            return false;
        }
        NotificationItem notificationItem = (NotificationItem) obj;
        return Intrinsics.c(this.f7288a, notificationItem.f7288a) && Intrinsics.c(this.b, notificationItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7288a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationItem(message=" + this.f7288a + ", displayTime=" + this.b + ")";
    }
}
