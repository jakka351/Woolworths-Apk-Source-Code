package au.com.woolworths.base.wallet.giftingstore.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/base/wallet/giftingstore/data/ScreenName;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_DECLINED", "DECLINED_BY_MERCHANT", "ORDER_PROCESSING", "POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1", "POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2", "POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1", "POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2", "UNKNOWN", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenName {

    @SerializedName("DECLINED_BY_MERCHANT")
    public static final ScreenName DECLINED_BY_MERCHANT;

    @SerializedName("ORDER_DECLINED")
    public static final ScreenName ORDER_DECLINED;

    @SerializedName("ORDER_PROCESSING")
    public static final ScreenName ORDER_PROCESSING;

    @SerializedName("POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1")
    public static final ScreenName POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1;

    @SerializedName("POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2")
    public static final ScreenName POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2;

    @SerializedName("POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1")
    public static final ScreenName POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1;

    @SerializedName("POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2")
    public static final ScreenName POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2;

    @DefaultValue
    @SerializedName("UNKNOWN__")
    public static final ScreenName UNKNOWN;
    public static final /* synthetic */ ScreenName[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ScreenName screenName = new ScreenName("ORDER_DECLINED", 0);
        ORDER_DECLINED = screenName;
        ScreenName screenName2 = new ScreenName("DECLINED_BY_MERCHANT", 1);
        DECLINED_BY_MERCHANT = screenName2;
        ScreenName screenName3 = new ScreenName("ORDER_PROCESSING", 2);
        ORDER_PROCESSING = screenName3;
        ScreenName screenName4 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1", 3);
        POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_1 = screenName4;
        ScreenName screenName5 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2", 4);
        POST_PAYMENT_ONBOARDING_BUY_FOR_MYSELF_2 = screenName5;
        ScreenName screenName6 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1", 5);
        POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_1 = screenName6;
        ScreenName screenName7 = new ScreenName("POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2", 6);
        POST_PAYMENT_ONBOARDING_BUY_AS_A_GIFT_2 = screenName7;
        ScreenName screenName8 = new ScreenName("UNKNOWN", 7);
        UNKNOWN = screenName8;
        ScreenName[] screenNameArr = {screenName, screenName2, screenName3, screenName4, screenName5, screenName6, screenName7, screenName8};
        d = screenNameArr;
        e = EnumEntriesKt.a(screenNameArr);
    }

    private ScreenName(String str, int i) {
    }

    public static ScreenName valueOf(String str) {
        return (ScreenName) Enum.valueOf(ScreenName.class, str);
    }

    public static ScreenName[] values() {
        return (ScreenName[]) d.clone();
    }
}
