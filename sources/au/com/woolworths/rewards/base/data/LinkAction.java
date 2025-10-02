package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/rewards/base/data/LinkAction;", "", "<init>", "(Ljava/lang/String;I)V", "WEB_LINK", "DEEP_LINK", "UNKNOWN", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinkAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkAction[] $VALUES;

    @SerializedName("WEB_LINK")
    public static final LinkAction WEB_LINK = new LinkAction("WEB_LINK", 0);

    @SerializedName("DEEP_LINK")
    public static final LinkAction DEEP_LINK = new LinkAction("DEEP_LINK", 1);

    @DefaultValue
    public static final LinkAction UNKNOWN = new LinkAction("UNKNOWN", 2);

    private static final /* synthetic */ LinkAction[] $values() {
        return new LinkAction[]{WEB_LINK, DEEP_LINK, UNKNOWN};
    }

    static {
        LinkAction[] linkActionArr$values = $values();
        $VALUES = linkActionArr$values;
        $ENTRIES = EnumEntriesKt.a(linkActionArr$values);
    }

    private LinkAction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<LinkAction> getEntries() {
        return $ENTRIES;
    }

    public static LinkAction valueOf(String str) {
        return (LinkAction) Enum.valueOf(LinkAction.class, str);
    }

    public static LinkAction[] values() {
        return (LinkAction[]) $VALUES.clone();
    }
}
