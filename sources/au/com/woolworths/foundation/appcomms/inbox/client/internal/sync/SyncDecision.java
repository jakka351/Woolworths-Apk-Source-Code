package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/SyncDecision;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncDecision {
    public static final SyncDecision d;
    public static final SyncDecision e;
    public static final SyncDecision f;
    public static final SyncDecision g;
    public static final /* synthetic */ SyncDecision[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        SyncDecision syncDecision = new SyncDecision("NotificationsOnly", 0);
        d = syncDecision;
        SyncDecision syncDecision2 = new SyncDecision("LastChatbotMessageOnly", 1);
        e = syncDecision2;
        SyncDecision syncDecision3 = new SyncDecision("All", 2);
        f = syncDecision3;
        SyncDecision syncDecision4 = new SyncDecision("None", 3);
        g = syncDecision4;
        SyncDecision[] syncDecisionArr = {syncDecision, syncDecision2, syncDecision3, syncDecision4};
        h = syncDecisionArr;
        i = EnumEntriesKt.a(syncDecisionArr);
    }

    public static SyncDecision valueOf(String str) {
        return (SyncDecision) Enum.valueOf(SyncDecision.class, str);
    }

    public static SyncDecision[] values() {
        return (SyncDecision[]) h.clone();
    }
}
