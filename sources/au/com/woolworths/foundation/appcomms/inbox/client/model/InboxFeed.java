package au.com.woolworths.foundation.appcomms.inbox.client.model;

import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed;", "", "NotificationsOnly", "Mixed", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed$Mixed;", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed$NotificationsOnly;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InboxFeed {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed$Mixed;", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Mixed implements InboxFeed {

        /* renamed from: a, reason: collision with root package name */
        public final LastChatbotMessage f8438a;
        public final List b;

        public Mixed(LastChatbotMessage lastChatbotMessage, List notifications) {
            Intrinsics.h(lastChatbotMessage, "lastChatbotMessage");
            Intrinsics.h(notifications, "notifications");
            this.f8438a = lastChatbotMessage;
            this.b = notifications;
        }

        @Override // au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed
        /* renamed from: a, reason: from getter */
        public final List getF8439a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mixed)) {
                return false;
            }
            Mixed mixed = (Mixed) obj;
            return Intrinsics.c(this.f8438a, mixed.f8438a) && Intrinsics.c(this.b, mixed.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8438a.hashCode() * 31);
        }

        public final String toString() {
            return "Mixed(lastChatbotMessage=" + this.f8438a + ", notifications=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed$NotificationsOnly;", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationsOnly implements InboxFeed {

        /* renamed from: a, reason: collision with root package name */
        public final List f8439a;

        public NotificationsOnly(List notifications) {
            Intrinsics.h(notifications, "notifications");
            this.f8439a = notifications;
        }

        @Override // au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed
        /* renamed from: a, reason: from getter */
        public final List getF8439a() {
            return this.f8439a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationsOnly) && Intrinsics.c(this.f8439a, ((NotificationsOnly) obj).f8439a);
        }

        public final int hashCode() {
            return this.f8439a.hashCode();
        }

        public final String toString() {
            return a.l("NotificationsOnly(notifications=", ")", this.f8439a);
        }
    }

    /* renamed from: a */
    List getF8439a();
}
