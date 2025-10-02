package au.com.woolworths.shop.checkout.ui.summary.rewards;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/rewards/RewardsQuantitySelectorActionType;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsQuantitySelectorActionType {
    public static final RewardsQuantitySelectorActionType d;
    public static final RewardsQuantitySelectorActionType e;
    public static final RewardsQuantitySelectorActionType f;
    public static final /* synthetic */ RewardsQuantitySelectorActionType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType = new RewardsQuantitySelectorActionType("ADD", 0);
        d = rewardsQuantitySelectorActionType;
        RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType2 = new RewardsQuantitySelectorActionType("UPDATE", 1);
        e = rewardsQuantitySelectorActionType2;
        RewardsQuantitySelectorActionType rewardsQuantitySelectorActionType3 = new RewardsQuantitySelectorActionType("REMOVE", 2);
        f = rewardsQuantitySelectorActionType3;
        RewardsQuantitySelectorActionType[] rewardsQuantitySelectorActionTypeArr = {rewardsQuantitySelectorActionType, rewardsQuantitySelectorActionType2, rewardsQuantitySelectorActionType3};
        g = rewardsQuantitySelectorActionTypeArr;
        h = EnumEntriesKt.a(rewardsQuantitySelectorActionTypeArr);
    }

    public static RewardsQuantitySelectorActionType valueOf(String str) {
        return (RewardsQuantitySelectorActionType) Enum.valueOf(RewardsQuantitySelectorActionType.class, str);
    }

    public static RewardsQuantitySelectorActionType[] values() {
        return (RewardsQuantitySelectorActionType[]) g.clone();
    }
}
