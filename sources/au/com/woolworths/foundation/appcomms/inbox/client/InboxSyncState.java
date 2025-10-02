package au.com.woolworths.foundation.appcomms.inbox.client;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState;", "", "Syncing", "Idle", "OutOfSync", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState$Idle;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState$OutOfSync;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState$Syncing;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InboxSyncState {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState$Idle;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements InboxSyncState {

        /* renamed from: a, reason: collision with root package name */
        public static final Idle f8410a = new Idle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public final int hashCode() {
            return -491368015;
        }

        public final String toString() {
            return "Idle";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState$OutOfSync;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OutOfSync implements InboxSyncState {

        /* renamed from: a, reason: collision with root package name */
        public static final OutOfSync f8411a = new OutOfSync();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OutOfSync);
        }

        public final int hashCode() {
            return -1399270845;
        }

        public final String toString() {
            return "OutOfSync";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState$Syncing;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Syncing implements InboxSyncState {

        /* renamed from: a, reason: collision with root package name */
        public static final Syncing f8412a = new Syncing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Syncing);
        }

        public final int hashCode() {
            return -207783830;
        }

        public final String toString() {
            return "Syncing";
        }
    }
}
