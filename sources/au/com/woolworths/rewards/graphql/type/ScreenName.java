package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ScreenName;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenName {
    public static final Companion e;
    public static final ScreenName f;
    public static final /* synthetic */ ScreenName[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ScreenName$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ScreenName screenName = new ScreenName("ORDER_DECLINED", 0, "ORDER_DECLINED");
        ScreenName screenName2 = new ScreenName("DECLINED_BY_MERCHANT", 1, "DECLINED_BY_MERCHANT");
        ScreenName screenName3 = new ScreenName("ORDER_PROCESSING", 2, "ORDER_PROCESSING");
        ScreenName screenName4 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1", 3, "POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1");
        ScreenName screenName5 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2", 4, "POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2");
        ScreenName screenName6 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1", 5, "POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1");
        ScreenName screenName7 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2", 6, "POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2");
        ScreenName screenName8 = new ScreenName("UNKNOWN__", 7, "UNKNOWN__");
        f = screenName8;
        ScreenName[] screenNameArr = {screenName, screenName2, screenName3, screenName4, screenName5, screenName6, screenName7, screenName8};
        g = screenNameArr;
        h = EnumEntriesKt.a(screenNameArr);
        e = new Companion();
        CollectionsKt.R("ORDER_DECLINED", "DECLINED_BY_MERCHANT", "ORDER_PROCESSING", "POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1", "POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2", "POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1", "POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2");
    }

    public ScreenName(String str, int i, String str2) {
        this.d = str2;
    }

    public static ScreenName valueOf(String str) {
        return (ScreenName) Enum.valueOf(ScreenName.class, str);
    }

    public static ScreenName[] values() {
        return (ScreenName[]) g.clone();
    }
}
