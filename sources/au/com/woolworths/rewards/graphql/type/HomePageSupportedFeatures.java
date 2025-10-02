package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/HomePageSupportedFeatures;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomePageSupportedFeatures {
    public static final Companion e;
    public static final HomePageSupportedFeatures f;
    public static final /* synthetic */ HomePageSupportedFeatures[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/HomePageSupportedFeatures$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        HomePageSupportedFeatures homePageSupportedFeatures = new HomePageSupportedFeatures("REWARDS_CARD", 0, "REWARDS_CARD");
        HomePageSupportedFeatures homePageSupportedFeatures2 = new HomePageSupportedFeatures("REWARDS_SPECIALS", 1, "REWARDS_SPECIALS");
        HomePageSupportedFeatures homePageSupportedFeatures3 = new HomePageSupportedFeatures("REWARDS_VOUCHERS", 2, "REWARDS_VOUCHERS");
        HomePageSupportedFeatures homePageSupportedFeatures4 = new HomePageSupportedFeatures("REWARDS_SHOP", 3, "REWARDS_SHOP");
        HomePageSupportedFeatures homePageSupportedFeatures5 = new HomePageSupportedFeatures("REWARDS_SUPPORT", 4, "REWARDS_SUPPORT");
        HomePageSupportedFeatures homePageSupportedFeatures6 = new HomePageSupportedFeatures("REWARDS_EXTRA", 5, "REWARDS_EXTRA");
        HomePageSupportedFeatures homePageSupportedFeatures7 = new HomePageSupportedFeatures("UNKNOWN__", 6, "UNKNOWN__");
        f = homePageSupportedFeatures7;
        HomePageSupportedFeatures[] homePageSupportedFeaturesArr = {homePageSupportedFeatures, homePageSupportedFeatures2, homePageSupportedFeatures3, homePageSupportedFeatures4, homePageSupportedFeatures5, homePageSupportedFeatures6, homePageSupportedFeatures7};
        g = homePageSupportedFeaturesArr;
        h = EnumEntriesKt.a(homePageSupportedFeaturesArr);
        e = new Companion();
        CollectionsKt.R("REWARDS_CARD", "REWARDS_SPECIALS", "REWARDS_VOUCHERS", "REWARDS_SHOP", "REWARDS_SUPPORT", "REWARDS_EXTRA");
    }

    public HomePageSupportedFeatures(String str, int i, String str2) {
        this.d = str2;
    }

    public static HomePageSupportedFeatures valueOf(String str) {
        return (HomePageSupportedFeatures) Enum.valueOf(HomePageSupportedFeatures.class, str);
    }

    public static HomePageSupportedFeatures[] values() {
        return (HomePageSupportedFeatures[]) g.clone();
    }
}
