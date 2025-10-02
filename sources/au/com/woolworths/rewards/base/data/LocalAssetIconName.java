package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/rewards/base/data/LocalAssetIconName;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT", "ARROW", "BASKET", "CART", "CHEVRON_RIGHT", "CHEVRON_RIGHT_SMALL", "COPY", "ERROR", "FEEDBACK", "GREEN_TICK", "HELP", "INFO", "INVOICE", "RECEIPT", "RETURNS", "REWARDS", "SEARCH", "STORE_LOCATION", "SUBSCRIBER", "TRUCK", "UNKNOWN", "VISIBILITY_ON", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalAssetIconName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalAssetIconName[] $VALUES;

    @SerializedName("ACCOUNT")
    public static final LocalAssetIconName ACCOUNT = new LocalAssetIconName("ACCOUNT", 0);

    @SerializedName("ARROW")
    public static final LocalAssetIconName ARROW = new LocalAssetIconName("ARROW", 1);

    @SerializedName("BASKET")
    public static final LocalAssetIconName BASKET = new LocalAssetIconName("BASKET", 2);

    @SerializedName("CART")
    public static final LocalAssetIconName CART = new LocalAssetIconName("CART", 3);

    @SerializedName("CHEVRON_RIGHT")
    public static final LocalAssetIconName CHEVRON_RIGHT = new LocalAssetIconName("CHEVRON_RIGHT", 4);

    @SerializedName("CHEVRON_RIGHT_SMALL")
    public static final LocalAssetIconName CHEVRON_RIGHT_SMALL = new LocalAssetIconName("CHEVRON_RIGHT_SMALL", 5);

    @SerializedName("COPY")
    public static final LocalAssetIconName COPY = new LocalAssetIconName("COPY", 6);

    @SerializedName("ERROR")
    public static final LocalAssetIconName ERROR = new LocalAssetIconName("ERROR", 7);

    @SerializedName("FEEDBACK")
    public static final LocalAssetIconName FEEDBACK = new LocalAssetIconName("FEEDBACK", 8);

    @SerializedName("GREEN_TICK")
    public static final LocalAssetIconName GREEN_TICK = new LocalAssetIconName("GREEN_TICK", 9);

    @SerializedName("HELP")
    public static final LocalAssetIconName HELP = new LocalAssetIconName("HELP", 10);

    @SerializedName("INFO")
    public static final LocalAssetIconName INFO = new LocalAssetIconName("INFO", 11);

    @SerializedName("INVOICE")
    public static final LocalAssetIconName INVOICE = new LocalAssetIconName("INVOICE", 12);

    @SerializedName("RECEIPT")
    public static final LocalAssetIconName RECEIPT = new LocalAssetIconName("RECEIPT", 13);

    @SerializedName("RETURNS")
    public static final LocalAssetIconName RETURNS = new LocalAssetIconName("RETURNS", 14);

    @SerializedName("REWARDS")
    public static final LocalAssetIconName REWARDS = new LocalAssetIconName("REWARDS", 15);

    @SerializedName("SEARCH")
    public static final LocalAssetIconName SEARCH = new LocalAssetIconName("SEARCH", 16);

    @SerializedName("STORE_LOCATION")
    public static final LocalAssetIconName STORE_LOCATION = new LocalAssetIconName("STORE_LOCATION", 17);

    @SerializedName("SUBSCRIBER")
    public static final LocalAssetIconName SUBSCRIBER = new LocalAssetIconName("SUBSCRIBER", 18);

    @SerializedName("TRUCK")
    public static final LocalAssetIconName TRUCK = new LocalAssetIconName("TRUCK", 19);

    @DefaultValue
    public static final LocalAssetIconName UNKNOWN = new LocalAssetIconName("UNKNOWN", 20);

    @SerializedName("VISIBILITY_ON")
    public static final LocalAssetIconName VISIBILITY_ON = new LocalAssetIconName("VISIBILITY_ON", 21);

    private static final /* synthetic */ LocalAssetIconName[] $values() {
        return new LocalAssetIconName[]{ACCOUNT, ARROW, BASKET, CART, CHEVRON_RIGHT, CHEVRON_RIGHT_SMALL, COPY, ERROR, FEEDBACK, GREEN_TICK, HELP, INFO, INVOICE, RECEIPT, RETURNS, REWARDS, SEARCH, STORE_LOCATION, SUBSCRIBER, TRUCK, UNKNOWN, VISIBILITY_ON};
    }

    static {
        LocalAssetIconName[] localAssetIconNameArr$values = $values();
        $VALUES = localAssetIconNameArr$values;
        $ENTRIES = EnumEntriesKt.a(localAssetIconNameArr$values);
    }

    private LocalAssetIconName(String str, int i) {
    }

    @NotNull
    public static EnumEntries<LocalAssetIconName> getEntries() {
        return $ENTRIES;
    }

    public static LocalAssetIconName valueOf(String str) {
        return (LocalAssetIconName) Enum.valueOf(LocalAssetIconName.class, str);
    }

    public static LocalAssetIconName[] values() {
        return (LocalAssetIconName[]) $VALUES.clone();
    }
}
