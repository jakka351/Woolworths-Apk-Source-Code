package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsPartnerIcon;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsPartnerIcon {
    public static final Companion e;
    public static final RewardsPartnerIcon f;
    public static final /* synthetic */ RewardsPartnerIcon[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsPartnerIcon$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RewardsPartnerIcon rewardsPartnerIcon = new RewardsPartnerIcon("woolworths", 0, "woolworths");
        RewardsPartnerIcon rewardsPartnerIcon2 = new RewardsPartnerIcon("woolworths_metro", 1, "woolworths_metro");
        RewardsPartnerIcon rewardsPartnerIcon3 = new RewardsPartnerIcon("bigw", 2, "bigw");
        RewardsPartnerIcon rewardsPartnerIcon4 = new RewardsPartnerIcon("bws", 3, "bws");
        RewardsPartnerIcon rewardsPartnerIcon5 = new RewardsPartnerIcon("eg", 4, "eg");
        RewardsPartnerIcon rewardsPartnerIcon6 = new RewardsPartnerIcon("ampol", 5, "ampol");
        RewardsPartnerIcon rewardsPartnerIcon7 = new RewardsPartnerIcon("ampol_metro", 6, "ampol_metro");
        RewardsPartnerIcon rewardsPartnerIcon8 = new RewardsPartnerIcon("unknown_partner", 7, "unknown_partner");
        RewardsPartnerIcon rewardsPartnerIcon9 = new RewardsPartnerIcon("UNKNOWN__", 8, "UNKNOWN__");
        f = rewardsPartnerIcon9;
        RewardsPartnerIcon[] rewardsPartnerIconArr = {rewardsPartnerIcon, rewardsPartnerIcon2, rewardsPartnerIcon3, rewardsPartnerIcon4, rewardsPartnerIcon5, rewardsPartnerIcon6, rewardsPartnerIcon7, rewardsPartnerIcon8, rewardsPartnerIcon9};
        g = rewardsPartnerIconArr;
        h = EnumEntriesKt.a(rewardsPartnerIconArr);
        e = new Companion();
        CollectionsKt.R("woolworths", "woolworths_metro", "bigw", "bws", "eg", "ampol", "ampol_metro", "unknown_partner");
    }

    public RewardsPartnerIcon(String str, int i, String str2) {
        this.d = str2;
    }

    public static RewardsPartnerIcon valueOf(String str) {
        return (RewardsPartnerIcon) Enum.valueOf(RewardsPartnerIcon.class, str);
    }

    public static RewardsPartnerIcon[] values() {
        return (RewardsPartnerIcon[]) g.clone();
    }
}
