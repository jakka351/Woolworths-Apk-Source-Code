package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/LocalAssetIconName;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalAssetIconName {
    public static final Companion e;
    public static final EnumType f;
    public static final LocalAssetIconName g;
    public static final /* synthetic */ LocalAssetIconName[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/LocalAssetIconName$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        LocalAssetIconName localAssetIconName = new LocalAssetIconName("CART", 0, "CART");
        LocalAssetIconName localAssetIconName2 = new LocalAssetIconName("ACCOUNT", 1, "ACCOUNT");
        LocalAssetIconName localAssetIconName3 = new LocalAssetIconName("TRUCK", 2, "TRUCK");
        LocalAssetIconName localAssetIconName4 = new LocalAssetIconName("SEARCH", 3, "SEARCH");
        LocalAssetIconName localAssetIconName5 = new LocalAssetIconName("INFO", 4, "INFO");
        LocalAssetIconName localAssetIconName6 = new LocalAssetIconName("REWARDS", 5, "REWARDS");
        LocalAssetIconName localAssetIconName7 = new LocalAssetIconName("FEEDBACK", 6, "FEEDBACK");
        LocalAssetIconName localAssetIconName8 = new LocalAssetIconName("CHEVRON_RIGHT", 7, "CHEVRON_RIGHT");
        LocalAssetIconName localAssetIconName9 = new LocalAssetIconName("CHEVRON_RIGHT_SMALL", 8, "CHEVRON_RIGHT_SMALL");
        LocalAssetIconName localAssetIconName10 = new LocalAssetIconName("SUBSCRIBER", 9, "SUBSCRIBER");
        LocalAssetIconName localAssetIconName11 = new LocalAssetIconName("COPY", 10, "COPY");
        LocalAssetIconName localAssetIconName12 = new LocalAssetIconName("BASKET", 11, "BASKET");
        LocalAssetIconName localAssetIconName13 = new LocalAssetIconName("ARROW", 12, "ARROW");
        LocalAssetIconName localAssetIconName14 = new LocalAssetIconName("INVOICE", 13, "INVOICE");
        LocalAssetIconName localAssetIconName15 = new LocalAssetIconName("HELP", 14, "HELP");
        LocalAssetIconName localAssetIconName16 = new LocalAssetIconName("RETURNS", 15, "RETURNS");
        LocalAssetIconName localAssetIconName17 = new LocalAssetIconName("VISIBILITY_ON", 16, "VISIBILITY_ON");
        LocalAssetIconName localAssetIconName18 = new LocalAssetIconName("RECEIPT", 17, "RECEIPT");
        LocalAssetIconName localAssetIconName19 = new LocalAssetIconName("STORE_LOCATION", 18, "STORE_LOCATION");
        LocalAssetIconName localAssetIconName20 = new LocalAssetIconName("GREEN_TICK", 19, "GREEN_TICK");
        LocalAssetIconName localAssetIconName21 = new LocalAssetIconName("ERROR", 20, "ERROR");
        LocalAssetIconName localAssetIconName22 = new LocalAssetIconName("UNKNOWN__", 21, "UNKNOWN__");
        g = localAssetIconName22;
        LocalAssetIconName[] localAssetIconNameArr = {localAssetIconName, localAssetIconName2, localAssetIconName3, localAssetIconName4, localAssetIconName5, localAssetIconName6, localAssetIconName7, localAssetIconName8, localAssetIconName9, localAssetIconName10, localAssetIconName11, localAssetIconName12, localAssetIconName13, localAssetIconName14, localAssetIconName15, localAssetIconName16, localAssetIconName17, localAssetIconName18, localAssetIconName19, localAssetIconName20, localAssetIconName21, localAssetIconName22};
        h = localAssetIconNameArr;
        i = EnumEntriesKt.a(localAssetIconNameArr);
        e = new Companion();
        f = new EnumType("LocalAssetIconName", CollectionsKt.R("CART", "ACCOUNT", "TRUCK", "SEARCH", "INFO", "REWARDS", "FEEDBACK", "CHEVRON_RIGHT", "CHEVRON_RIGHT_SMALL", "SUBSCRIBER", "COPY", "BASKET", "ARROW", "INVOICE", "HELP", "RETURNS", "VISIBILITY_ON", "RECEIPT", "STORE_LOCATION", "GREEN_TICK", "ERROR"));
    }

    public LocalAssetIconName(String str, int i2, String str2) {
        this.d = str2;
    }

    public static LocalAssetIconName valueOf(String str) {
        return (LocalAssetIconName) Enum.valueOf(LocalAssetIconName.class, str);
    }

    public static LocalAssetIconName[] values() {
        return (LocalAssetIconName[]) h.clone();
    }
}
