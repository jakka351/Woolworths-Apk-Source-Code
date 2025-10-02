package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsOfferStatus;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsOfferStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final RewardsOfferStatus g;
    public static final /* synthetic */ RewardsOfferStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsOfferStatus$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RewardsOfferStatus rewardsOfferStatus = new RewardsOfferStatus("NOT_ACTIVATED", 0, "NOT_ACTIVATED");
        RewardsOfferStatus rewardsOfferStatus2 = new RewardsOfferStatus("ACTIVATED", 1, "ACTIVATED");
        RewardsOfferStatus rewardsOfferStatus3 = new RewardsOfferStatus("MISSED", 2, "MISSED");
        RewardsOfferStatus rewardsOfferStatus4 = new RewardsOfferStatus("COMPLETED", 3, "COMPLETED");
        RewardsOfferStatus rewardsOfferStatus5 = new RewardsOfferStatus("ENDED", 4, "ENDED");
        RewardsOfferStatus rewardsOfferStatus6 = new RewardsOfferStatus("PENDING", 5, "PENDING");
        RewardsOfferStatus rewardsOfferStatus7 = new RewardsOfferStatus("UNKNOWN__", 6, "UNKNOWN__");
        g = rewardsOfferStatus7;
        RewardsOfferStatus[] rewardsOfferStatusArr = {rewardsOfferStatus, rewardsOfferStatus2, rewardsOfferStatus3, rewardsOfferStatus4, rewardsOfferStatus5, rewardsOfferStatus6, rewardsOfferStatus7};
        h = rewardsOfferStatusArr;
        i = EnumEntriesKt.a(rewardsOfferStatusArr);
        e = new Companion();
        f = new EnumType("RewardsOfferStatus", CollectionsKt.R("NOT_ACTIVATED", "ACTIVATED", "MISSED", "COMPLETED", "ENDED", "PENDING"));
    }

    public RewardsOfferStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RewardsOfferStatus valueOf(String str) {
        return (RewardsOfferStatus) Enum.valueOf(RewardsOfferStatus.class, str);
    }

    public static RewardsOfferStatus[] values() {
        return (RewardsOfferStatus[]) h.clone();
    }
}
