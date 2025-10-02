package au.com.woolworths.feature.shop.healthylifefoodtracker.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerFooterActionType;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoodTrackerFooterActionType {
    public static final FoodTrackerFooterActionType d;
    public static final FoodTrackerFooterActionType e;
    public static final FoodTrackerFooterActionType f;
    public static final /* synthetic */ FoodTrackerFooterActionType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        FoodTrackerFooterActionType foodTrackerFooterActionType = new FoodTrackerFooterActionType("ADD_EDR", 0);
        d = foodTrackerFooterActionType;
        FoodTrackerFooterActionType foodTrackerFooterActionType2 = new FoodTrackerFooterActionType("OPEN_CONSENT", 1);
        e = foodTrackerFooterActionType2;
        FoodTrackerFooterActionType foodTrackerFooterActionType3 = new FoodTrackerFooterActionType("UNKNOWN", 2);
        f = foodTrackerFooterActionType3;
        FoodTrackerFooterActionType[] foodTrackerFooterActionTypeArr = {foodTrackerFooterActionType, foodTrackerFooterActionType2, foodTrackerFooterActionType3};
        g = foodTrackerFooterActionTypeArr;
        h = EnumEntriesKt.a(foodTrackerFooterActionTypeArr);
    }

    public static FoodTrackerFooterActionType valueOf(String str) {
        return (FoodTrackerFooterActionType) Enum.valueOf(FoodTrackerFooterActionType.class, str);
    }

    public static FoodTrackerFooterActionType[] values() {
        return (FoodTrackerFooterActionType[]) g.clone();
    }
}
