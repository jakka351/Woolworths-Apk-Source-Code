package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/BannerActionType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerActionType {
    public static final Companion e;
    public static final BannerActionType f;
    public static final /* synthetic */ BannerActionType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/BannerActionType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BannerActionType bannerActionType = new BannerActionType("WEB_LINK", 0, "WEB_LINK");
        BannerActionType bannerActionType2 = new BannerActionType("DEEP_LINK", 1, "DEEP_LINK");
        BannerActionType bannerActionType3 = new BannerActionType("APP_LOCAL", 2, "APP_LOCAL");
        BannerActionType bannerActionType4 = new BannerActionType("UNKNOWN__", 3, "UNKNOWN__");
        f = bannerActionType4;
        BannerActionType[] bannerActionTypeArr = {bannerActionType, bannerActionType2, bannerActionType3, bannerActionType4};
        g = bannerActionTypeArr;
        h = EnumEntriesKt.a(bannerActionTypeArr);
        e = new Companion();
        CollectionsKt.R("WEB_LINK", "DEEP_LINK", "APP_LOCAL");
    }

    public BannerActionType(String str, int i, String str2) {
        this.d = str2;
    }

    public static BannerActionType valueOf(String str) {
        return (BannerActionType) Enum.valueOf(BannerActionType.class, str);
    }

    public static BannerActionType[] values() {
        return (BannerActionType[]) g.clone();
    }
}
