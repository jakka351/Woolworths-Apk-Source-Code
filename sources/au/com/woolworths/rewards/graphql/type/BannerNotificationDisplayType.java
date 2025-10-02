package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/BannerNotificationDisplayType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerNotificationDisplayType {
    public static final Companion e;
    public static final EnumType f;
    public static final BannerNotificationDisplayType g;
    public static final /* synthetic */ BannerNotificationDisplayType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/BannerNotificationDisplayType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BannerNotificationDisplayType bannerNotificationDisplayType = new BannerNotificationDisplayType("INFO", 0, "INFO");
        BannerNotificationDisplayType bannerNotificationDisplayType2 = new BannerNotificationDisplayType("WARNING", 1, "WARNING");
        BannerNotificationDisplayType bannerNotificationDisplayType3 = new BannerNotificationDisplayType("ERROR", 2, "ERROR");
        BannerNotificationDisplayType bannerNotificationDisplayType4 = new BannerNotificationDisplayType("UNKNOWN__", 3, "UNKNOWN__");
        g = bannerNotificationDisplayType4;
        BannerNotificationDisplayType[] bannerNotificationDisplayTypeArr = {bannerNotificationDisplayType, bannerNotificationDisplayType2, bannerNotificationDisplayType3, bannerNotificationDisplayType4};
        h = bannerNotificationDisplayTypeArr;
        i = EnumEntriesKt.a(bannerNotificationDisplayTypeArr);
        e = new Companion();
        f = new EnumType("BannerNotificationDisplayType", CollectionsKt.R("INFO", "WARNING", "ERROR"));
    }

    public BannerNotificationDisplayType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static BannerNotificationDisplayType valueOf(String str) {
        return (BannerNotificationDisplayType) Enum.valueOf(BannerNotificationDisplayType.class, str);
    }

    public static BannerNotificationDisplayType[] values() {
        return (BannerNotificationDisplayType[]) h.clone();
    }
}
