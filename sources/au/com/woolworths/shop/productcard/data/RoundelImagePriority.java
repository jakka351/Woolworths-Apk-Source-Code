package au.com.woolworths.shop.productcard.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/RoundelImagePriority;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundelImagePriority {
    public static final RoundelImagePriority d;
    public static final RoundelImagePriority e;
    public static final RoundelImagePriority f;
    public static final /* synthetic */ RoundelImagePriority[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        RoundelImagePriority roundelImagePriority = new RoundelImagePriority("PRIMARY", 0);
        d = roundelImagePriority;
        RoundelImagePriority roundelImagePriority2 = new RoundelImagePriority("SECONDARY", 1);
        e = roundelImagePriority2;
        RoundelImagePriority roundelImagePriority3 = new RoundelImagePriority("TERTIARY", 2);
        f = roundelImagePriority3;
        RoundelImagePriority[] roundelImagePriorityArr = {roundelImagePriority, roundelImagePriority2, roundelImagePriority3};
        g = roundelImagePriorityArr;
        h = EnumEntriesKt.a(roundelImagePriorityArr);
    }

    public static RoundelImagePriority valueOf(String str) {
        return (RoundelImagePriority) Enum.valueOf(RoundelImagePriority.class, str);
    }

    public static RoundelImagePriority[] values() {
        return (RoundelImagePriority[]) g.clone();
    }
}
