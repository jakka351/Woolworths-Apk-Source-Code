package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/UpgradeType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpgradeType {
    public static final Companion e;
    public static final UpgradeType f;
    public static final /* synthetic */ UpgradeType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/UpgradeType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        UpgradeType upgradeType = new UpgradeType("APP", 0, "APP");
        UpgradeType upgradeType2 = new UpgradeType("OS", 1, "OS");
        UpgradeType upgradeType3 = new UpgradeType("NONE", 2, "NONE");
        UpgradeType upgradeType4 = new UpgradeType("UNKNOWN__", 3, "UNKNOWN__");
        f = upgradeType4;
        UpgradeType[] upgradeTypeArr = {upgradeType, upgradeType2, upgradeType3, upgradeType4};
        g = upgradeTypeArr;
        h = EnumEntriesKt.a(upgradeTypeArr);
        e = new Companion();
        CollectionsKt.R("APP", "OS", "NONE");
    }

    public UpgradeType(String str, int i, String str2) {
        this.d = str2;
    }

    public static UpgradeType valueOf(String str) {
        return (UpgradeType) Enum.valueOf(UpgradeType.class, str);
    }

    public static UpgradeType[] values() {
        return (UpgradeType[]) g.clone();
    }
}
