package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SessionStatus;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionStatus {
    public static final Companion e;
    public static final SessionStatus f;
    public static final /* synthetic */ SessionStatus[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SessionStatus$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        SessionStatus sessionStatus = new SessionStatus("SESSION_VALID", 0, "SESSION_VALID");
        SessionStatus sessionStatus2 = new SessionStatus("SESSION_PENDING", 1, "SESSION_PENDING");
        SessionStatus sessionStatus3 = new SessionStatus("SESSION_FINISHED_ZERO_DOLLAR", 2, "SESSION_FINISHED_ZERO_DOLLAR");
        SessionStatus sessionStatus4 = new SessionStatus("SESSION_CANCELLED", 3, "SESSION_CANCELLED");
        SessionStatus sessionStatus5 = new SessionStatus("SESSION_FINISHED", 4, "SESSION_FINISHED");
        SessionStatus sessionStatus6 = new SessionStatus("UNKNOWN__", 5, "UNKNOWN__");
        f = sessionStatus6;
        SessionStatus[] sessionStatusArr = {sessionStatus, sessionStatus2, sessionStatus3, sessionStatus4, sessionStatus5, sessionStatus6};
        g = sessionStatusArr;
        h = EnumEntriesKt.a(sessionStatusArr);
        e = new Companion();
        CollectionsKt.R("SESSION_VALID", "SESSION_PENDING", "SESSION_FINISHED_ZERO_DOLLAR", "SESSION_CANCELLED", "SESSION_FINISHED");
    }

    public SessionStatus(String str, int i, String str2) {
        this.d = str2;
    }

    public static SessionStatus valueOf(String str) {
        return (SessionStatus) Enum.valueOf(SessionStatus.class, str);
    }

    public static SessionStatus[] values() {
        return (SessionStatus[]) g.clone();
    }
}
